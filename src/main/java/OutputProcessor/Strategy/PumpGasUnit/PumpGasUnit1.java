package OutputProcessor.Strategy.PumpGasUnit;

import Datastore.Datastore;
import Datastore.Datastore1;

public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(Datastore datastore) {
        super(datastore);
    }

    public void pumpGasUnit() {
        Datastore1 datastore1 = (Datastore1) datastore;
        int litres=datastore1.getL();
        int price=datastore1.getPrice();

        datastore1.setL(litres++);
        datastore1.setTotal(litres * price);
    }
}
