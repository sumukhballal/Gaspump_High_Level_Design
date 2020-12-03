package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class S3 extends State {
    public S3(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void SelectGas(int g)
    {
        outputProcessor.SetPrice(g);

        /* No change in state */
    }

    @Override
    public  void StartPump()
    {
        outputProcessor.SetInitialValues();
        mda_efsm.SetState(5);
    }

    @Override
    public  void Cancel()
    {
        outputProcessor.CancelMsg();
        outputProcessor.ReturnCash();
        mda_efsm.SetState(1);
    }

}
