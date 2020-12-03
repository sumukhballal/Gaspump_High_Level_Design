package OutputProcessor.Strategy.ReturnCash;

import Datastore.Datastore;
import Datastore.Datastore1;

public class ReturnCash1 extends ReturnCash {

    public ReturnCash1(Datastore datastore) {
        super(datastore);
    }

    public void returnCash() {
        Datastore1 datastore1 = (Datastore1) datastore;
        System.out.println("Returning cash : "+datastore1.getCash()+" \n");
    }
}
