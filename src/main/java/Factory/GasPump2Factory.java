package Factory;

import Datastore.Datastore;
import Datastore.Datastore2;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.StorePrices.StorePrices2;

public class GasPump2Factory  extends  AbstractFactory{

    Datastore datastore;

    public Datastore getDatastore() {
        if(this.datastore==null) {
            this.datastore = new Datastore2();
        }
        return this.datastore;
    }

    public StorePrices getStorePrices() {
        return new StorePrices2(getDatastore());
    }
}
