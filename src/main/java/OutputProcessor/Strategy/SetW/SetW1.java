package OutputProcessor.Strategy.SetW;

import Datastore.Datastore;
import Datastore.Datastore1;

public class SetW1 extends SetW {

    public SetW1(Datastore datastore) {
        super(datastore);
    }

    public void setW(int v) {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setW(v);
    }
}
