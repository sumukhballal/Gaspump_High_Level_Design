package OutputProcessor.Strategy.StorePin;

import Datastore.Datastore;
import Datastore.Datastore2;

public class StorePin2 extends StorePin {

    public StorePin2(Datastore datastore) {
        super(datastore);
    }

    public void storePin() {
        Datastore2 datastore2 = (Datastore2)  datastore;
        datastore2.setPin(datastore2.getTemp_p());
    }
}
