package Factory;

import Datastore.Datastore;
import Datastore.Datastore1;

public class GasPump1Factory extends  AbstractFactory {

    public Datastore getDatastore() {
        Datastore datastore = new Datastore1();
        return datastore;
    }
}
