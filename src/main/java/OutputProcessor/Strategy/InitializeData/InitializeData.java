package OutputProcessor.Strategy.InitializeData;

import Datastore.Datastore;

public abstract class InitializeData {
    Datastore datastore;

    public InitializeData(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void initializeData();
}
