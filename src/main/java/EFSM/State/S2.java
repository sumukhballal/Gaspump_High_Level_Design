package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class S2 */

public class S2 extends State {
    public S2(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public  void Approved()
    {
        /* Display Menu */
        outputProcessor.DisplayMenu();
        outputProcessor.EjectCard();
        /* Go to S3 */
        mda_efsm.SetState(4);
    }

    @Override
    public  void Reject()
    {
        /* Reject MSG */
        outputProcessor.RejectMsg();
        outputProcessor.EjectCard();
        /* Go to S0 */
        mda_efsm.SetState(1);
    }
}
