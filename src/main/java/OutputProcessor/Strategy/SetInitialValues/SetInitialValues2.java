package OutputProcessor.Strategy.SetInitialValues;

import Datastore.Datastore;
import Datastore.Datastore2;

public class SetInitialValues2 extends SetInitialValues {

    public SetInitialValues2(Datastore datastore) {
        super(datastore);
    }

    public void setInitialValues() {

        Datastore2 datastore2 = (Datastore2) datastore;
        datastore2.setTotal(0);
        datastore2.setG(0);
        System.out.println("Pump Ready!");
    }
}
