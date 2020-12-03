package OutputProcessor.Strategy.ReturnCash;

import Datastore.Datastore;
import Datastore.Datastore1;

public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(Datastore datastore) {
        super(datastore);
    }

    public void returnCash() {
        System.out.println("Invalid Operation!");
    }
}
