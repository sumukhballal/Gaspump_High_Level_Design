package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class S3 */


public class S3 extends State {
    public S3(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void SelectGas(int g)
    {
        /* Set Price
        * 0 - Regular Price
        * 1 - Diesel Price
        * 2 - Super Price
        *  */
        outputProcessor.SetPrice(g);

        /* No change in state */
    }

    @Override
    public  void StartPump()
    {
        outputProcessor.SetInitialValues();
        /* Go to S4 */
        mda_efsm.SetState(5);
    }

    @Override
    public  void Cancel()
    {
        /* Call cancel MSG */
        outputProcessor.CancelMsg();
        outputProcessor.ReturnCash();
        /* Go to S0 */
        mda_efsm.SetState(1);
    }

}
