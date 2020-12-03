package OutputProcessor.Strategy.SetPrice;

import Datastore.Datastore;

public abstract class SetPrice {
    Datastore datastore;

    public SetPrice(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void setPrice(int g);
}
