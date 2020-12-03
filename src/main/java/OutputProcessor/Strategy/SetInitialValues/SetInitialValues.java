package OutputProcessor.Strategy.SetInitialValues;

import Datastore.Datastore;

public abstract class SetInitialValues {
    Datastore datastore;

    public SetInitialValues(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void setInitialValues();
}
