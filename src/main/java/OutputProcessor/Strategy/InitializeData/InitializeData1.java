package OutputProcessor.Strategy.InitializeData;

import Datastore.Datastore;
import Datastore.Datastore1;

public class InitializeData1 extends InitializeData {

    public InitializeData1(Datastore datastore) {
        super(datastore);
    }

    public void initializeData() {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setPrice(0);
        System.out.println("Initial Values Set. \n");
    }
}
