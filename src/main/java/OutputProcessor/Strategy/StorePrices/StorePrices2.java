package OutputProcessor.Strategy.StorePrices;

import Datastore.Datastore;
import Datastore.Datastore2;

public class StorePrices2 extends StorePrices {

    public StorePrices2(Datastore datastore) {
        super(datastore);
    }

    public void storePrices() {

        Datastore2 datastore2 = (Datastore2) datastore;
        datastore2.setRprice(datastore2.getTemp_a());
        datastore2.setDprice(datastore2.getTemp_b());
        datastore2.setSprice(datastore2.getTemp_c());
        System.out.println("Gaspump1 activated!");
    }
}
