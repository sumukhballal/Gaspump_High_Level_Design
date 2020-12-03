package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class S5 extends State {
    public S5(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void CorrectPin()
    {
        outputProcessor.DisplayMenu();
        outputProcessor.EjectCard();
        mda_efsm.SetState(4);
    }

    @Override
    public void IncorrectPin(int max)
    {
        int k = outputProcessor.getK();
        if(k<=max)
        {
            outputProcessor.WrongPinMsg();
            outputProcessor.setK(k+1);

            /* No change in state */
        }
        else if(k>max)
        {
            outputProcessor.WrongPinMsg();
            outputProcessor.EjectCard();
            mda_efsm.SetState(1);
        }
    }

}
