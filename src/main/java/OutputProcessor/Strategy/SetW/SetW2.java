package OutputProcessor.Strategy.SetW;

import Datastore.Datastore;
import Datastore.Datastore2;

public class SetW2 extends SetW {

    public SetW2(Datastore datastore) {
        super(datastore);
    }

    public void setW(int v) {
        Datastore2 datastore2 = (Datastore2) datastore;
        datastore2.setW(v);
    }
}
