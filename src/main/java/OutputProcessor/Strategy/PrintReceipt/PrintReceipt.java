package OutputProcessor.Strategy.PrintReceipt;

import Datastore.Datastore;

public abstract class PrintReceipt {
    Datastore datastore;

    public PrintReceipt(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void printReceipt();
}
