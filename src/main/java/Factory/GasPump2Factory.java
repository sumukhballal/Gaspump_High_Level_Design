package Factory;

import Datastore.Datastore;
import Datastore.Datastore2;

public class GasPump2Factory  extends  AbstractFactory{


    public Datastore getDatastore() {
        Datastore datastore = new Datastore2();
        return datastore;
    }
}
