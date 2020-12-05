package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

/* State Class S5 */


public class S5 extends State {
    public S5(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        super(mda_efsm, outputProcessor);
    }

    @Override
    public void CorrectPin()
    {
        /* Display the Menu */
        outputProcessor.DisplayMenu();
        outputProcessor.EjectCard();
        /* Go to S3 */
        mda_efsm.SetState(4);
    }

    @Override
    public void IncorrectPin(int max)
    {
        int k = outputProcessor.getK();
        if(k<=max)
        {
            /* Display Wrong Pin */
            outputProcessor.WrongPinMsg();
            outputProcessor.setK(k+1);

            /* No change in state */
        }
        else if(k>max)
        {
            outputProcessor.WrongPinMsg();
            outputProcessor.EjectCard();
            /* Go to S0 */
            mda_efsm.SetState(1);
        }
    }

}
