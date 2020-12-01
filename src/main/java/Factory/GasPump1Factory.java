package Factory;

import Datastore.Datastore;
import Datastore.Datastore1;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.StorePrices.StorePrices1;

public class GasPump1Factory extends  AbstractFactory {

    Datastore datastore;

    public Datastore getDatastore() {
        if(this.datastore==null) {
            this.datastore = new Datastore1();
        }
        return this.datastore;
    }

    public StorePrices getStorePrices() {
        return new StorePrices1(getDatastore());
    }
}
