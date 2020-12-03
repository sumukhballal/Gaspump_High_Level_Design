package OutputProcessor.Strategy.GasPumpedMsg;

import Datastore.Datastore;
import Datastore.Datastore2;

public class GasPumpedMsg2 extends GasPumpedMsg {

    public GasPumpedMsg2(Datastore datastore) {
        super(datastore);
    }

    public void gasPumpedMsg() {
        Datastore2 datastore2 = (Datastore2) datastore;
        System.out.println("Pumped 1 Gallon of  "+datastore2.getGasType()+" [ $"+datastore2.getPrice()+"] \n" +
                "Total Gallons pumped : "+datastore2.getG()+"\n" +
                "Total Cost : $"+datastore2.getTotal()+"\n");
    }
}
