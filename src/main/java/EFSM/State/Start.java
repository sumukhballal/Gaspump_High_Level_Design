package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class Start extends State {


    public Start(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void Activate()
    {
       outputProcessor.StorePrices();
       mda_efsm.SetState(1);
    }
}
