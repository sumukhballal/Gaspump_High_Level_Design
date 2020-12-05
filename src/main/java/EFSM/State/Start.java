package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class Start */


public class Start extends State {


    public Start(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void Activate()
    {
        /* Store Prices */
       outputProcessor.StorePrices();
       /* Go to S2 */
       mda_efsm.SetState(1);
    }
}
