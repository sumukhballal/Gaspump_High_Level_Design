package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class S4 extends State {
    public S4(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void Pump()
    {
        outputProcessor.PumpGasUnit();
        outputProcessor.GasPumpedMsg();
    }

    @Override
    public  void StopPump()
    {
        outputProcessor.PrintReceipt();
        mda_efsm.SetState(1);
    }
}
