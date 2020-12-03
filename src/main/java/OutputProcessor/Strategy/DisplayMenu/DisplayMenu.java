package OutputProcessor.Strategy.DisplayMenu;

import Datastore.Datastore;

public abstract class DisplayMenu {

    Datastore datastore;

    public DisplayMenu(Datastore datastore) {
        this.datastore=datastore;
    }

    public abstract void displayMenu();
}