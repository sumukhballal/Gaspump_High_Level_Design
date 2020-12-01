package OutputProcessor.Strategy.StorePrices;

import Datastore.Datastore;

public abstract class StorePrices {
    Datastore datastore;

    public StorePrices(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void storePrices();
}
