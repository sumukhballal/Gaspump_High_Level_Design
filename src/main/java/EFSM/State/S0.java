package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class S0 */
public class S0 extends State {

    public S0(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void Start()
    {
        outputProcessor.PayMsg();
        outputProcessor.InitializeData();
        outputProcessor.SetW(0);
        /* Go to S1 */
        mda_efsm.SetState(2);
    }
}
