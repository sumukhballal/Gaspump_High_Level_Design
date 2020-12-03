package OutputProcessor.Strategy.SetInitialValues;

import Datastore.Datastore;
import Datastore.Datastore1;

public class SetInitialValues1 extends SetInitialValues {

    public SetInitialValues1(Datastore datastore) {
        super(datastore);
    }

    public void setInitialValues() {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setTotal(0);
        datastore1.setL(0);
        System.out.println("Pump Ready!");
    }
}
