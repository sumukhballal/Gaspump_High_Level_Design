package OutputProcessor.Strategy.PumpGasUnit;

import Datastore.Datastore;
import Datastore.Datastore2;

public class PumpGasUnit2 extends PumpGasUnit {

    public PumpGasUnit2(Datastore datastore) {
        super(datastore);
    }

    public void pumpGasUnit() {
        Datastore2 datastore2 = (Datastore2) datastore;
        int litres=datastore2.getG();
        float price=datastore2.getPrice();

        datastore2.setG(litres++);
        datastore2.setTotal(litres * price);
    }
}
