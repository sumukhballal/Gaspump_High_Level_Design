package OutputProcessor.Strategy.GasPumpedMsg;

import Datastore.Datastore;

public abstract class GasPumpedMsg {
    Datastore datastore;

    public GasPumpedMsg(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void gasPumpedMsg();
}
