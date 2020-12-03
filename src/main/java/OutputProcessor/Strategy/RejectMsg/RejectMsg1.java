package OutputProcessor.Strategy.RejectMsg;

import Datastore.Datastore;
import Datastore.Datastore1;

public class RejectMsg1 extends RejectMsg {

    public void rejectMsg() {
        System.out.println("You do not have enough Credit! Exiting..");
    }
}
