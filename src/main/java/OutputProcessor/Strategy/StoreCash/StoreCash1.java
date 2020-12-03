package OutputProcessor.Strategy.StoreCash;

import Datastore.Datastore;
import Datastore.Datastore1;

public class StoreCash1 extends StoreCash {

    public StoreCash1(Datastore datastore) {
        super(datastore);
    }

    public void storeCash() {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setCash(datastore1.getTemp_c());
    }
}
