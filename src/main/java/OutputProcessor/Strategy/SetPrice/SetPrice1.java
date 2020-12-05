package OutputProcessor.Strategy.SetPrice;

import Datastore.Datastore;
import Datastore.Datastore1;

public class SetPrice1 extends SetPrice {

    public SetPrice1(Datastore datastore) {
        super(datastore);
    }

    public void setPrice(int g) {
        Datastore1 datastore1 = (Datastore1) datastore;
        datastore1.setPrice(datastore1.getPrice());
        /* Set Price
         * 0 - Regular Price
        */
        System.out.println("Price set for Regular Gas : "+datastore1.getPrice()+" / Litre \n");
    }
}
