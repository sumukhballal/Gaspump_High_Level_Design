package OutputProcessor.Strategy.StorePrices;

import Datastore.Datastore;
import Datastore.Datastore1;

public class StorePrices1 extends StorePrices {

    public StorePrices1(Datastore datastore) {
        super(datastore);
    }

    public void storePrices() {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setPrice(datastore1.getTemp_a());
        System.out.println("Gaspump1 activated!");
    }
}
