package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class S1 extends State {
    public S1(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void PayCredit()
    {
        mda_efsm.SetState(3);
    }
    @Override
    public void PayCash()
    {
        outputProcessor.StoreCash();
        outputProcessor.DisplayMenu();
        outputProcessor.SetW(1);
        mda_efsm.SetState(4);
    }
    @Override
    public void PayDebit()
    {
        outputProcessor.EnterPinMsg();
        outputProcessor.StorePin();
        outputProcessor.setK(0);
        mda_efsm.SetState(6);
    }
}
