package OutputProcessor.Strategy.StorePin;

import Datastore.Datastore;

public abstract class StorePin {
    Datastore datastore;

    public StorePin(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void storePin();
}
