package OutputProcessor.Strategy.SetW;

import Datastore.Datastore;

public abstract class SetW {
    Datastore datastore;

    public SetW(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void setW(int v);
}
