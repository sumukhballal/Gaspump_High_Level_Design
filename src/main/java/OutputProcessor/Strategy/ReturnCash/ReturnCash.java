package OutputProcessor.Strategy.ReturnCash;

import Datastore.Datastore;

public abstract class ReturnCash {
    Datastore datastore;

    public ReturnCash(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void returnCash();
}
