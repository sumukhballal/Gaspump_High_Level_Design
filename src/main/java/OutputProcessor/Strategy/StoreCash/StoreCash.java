package OutputProcessor.Strategy.StoreCash;

import Datastore.Datastore;

public abstract class StoreCash {
    Datastore datastore;

    public StoreCash(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void storeCash();
}
