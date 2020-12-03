package OutputProcessor.Strategy.PumpGasUnit;

import Datastore.Datastore;

public abstract class PumpGasUnit {
    Datastore datastore;

    public PumpGasUnit(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void pumpGasUnit();
}
