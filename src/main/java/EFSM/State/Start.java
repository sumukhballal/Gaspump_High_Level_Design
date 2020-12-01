package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class Start extends State {


    public Start(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    public void Activate()
    {
       State currState = mda_efsm.GetState();
       State[] LS = mda_efsm.GetStates();

       if(currState.equals(LS[0]))
       {
            mda_efsm.SetState(1);
            OutputProcessor outputProcessor=mda_efsm.getOutputProcessor();
            outputProcessor
       }
    }
}
