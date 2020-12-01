package Factory;

import Datastore.Datastore;
import Datastore.Datastore1;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.StorePrices.StorePrices1;

public class GasPump1Factory extends  AbstractFactory {

    public Datastore getDatastore() {
        Datastore datastore = new Datastore1();
        return datastore;
    }

    public StorePrices getStorePrices() {
        return new StorePrices1();
    }
}
