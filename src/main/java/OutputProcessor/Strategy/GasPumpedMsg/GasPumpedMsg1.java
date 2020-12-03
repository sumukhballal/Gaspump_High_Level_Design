package OutputProcessor.Strategy.GasPumpedMsg;

import Datastore.Datastore;
import Datastore.Datastore1;

public class GasPumpedMsg1 extends GasPumpedMsg {

    public GasPumpedMsg1(Datastore datastore) {
        super(datastore);
    }

    public void gasPumpedMsg() {
        Datastore1 datastore1 = (Datastore1) datastore;
        System.out.println("Pumped 1 Liter of Regular [ $"+datastore1.getPrice()+"] \n" +
                "Total Litres Pumped : "+datastore1.getL()+"\n" +
                "Total Cost : $"+datastore1.getTotal()+"\n");
    }
}
