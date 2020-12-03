package OutputProcessor.Strategy.StoreCash;

import Datastore.Datastore;
import Datastore.Datastore2;

public class StoreCash2 extends StoreCash {

    public StoreCash2(Datastore datastore) {
        super(datastore);
    }

    public void storeCash() {
        System.out.println("Invalid Operation! ");
    }
}
