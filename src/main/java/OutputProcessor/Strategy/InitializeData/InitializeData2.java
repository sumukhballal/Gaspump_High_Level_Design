package OutputProcessor.Strategy.InitializeData;

import Datastore.Datastore;
import Datastore.Datastore2;

public class InitializeData2 extends InitializeData {

    public InitializeData2(Datastore datastore) {
        super(datastore);
    }

    public void initializeData() {
        Datastore2 datastore2 = (Datastore2) datastore;
        datastore2.setPrice(0);
        System.out.println("Initial Values Set. \n");
    }
}
