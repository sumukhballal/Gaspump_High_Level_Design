package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class S2 extends State {
    public S2(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void Approved()
    {
        outputProcessor.DisplayMenu();
        outputProcessor.EjectCard();
        mda_efsm.SetState(4);
    }

    @Override
    public  void Reject()
    {
        outputProcessor.RejectMsg();
        outputProcessor.EjectCard();
        mda_efsm.SetState(1);
    }
}
