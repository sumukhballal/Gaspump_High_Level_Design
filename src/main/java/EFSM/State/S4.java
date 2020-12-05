package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class S4 */


public class S4 extends State {
    public S4(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void Pump()
    {
        /* Pump 1 Unit of Gas */
        outputProcessor.PumpGasUnit();
        outputProcessor.GasPumpedMsg();

        /* No change in state */
    }

    @Override
    public  void StopPump()
    {
        /* Print the receipt */
        outputProcessor.PrintReceipt();
        /* Go to S0 */
        mda_efsm.SetState(1);
    }
}
