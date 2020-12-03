package OutputProcessor.Strategy.SetPrice;

import Datastore.Datastore;
import Datastore.Datastore2;

public class SetPrice2 extends SetPrice {

    public SetPrice2(Datastore datastore) {
        super(datastore);
    }

    public void setPrice(int g) {
        Datastore2 datastore2 = (Datastore2) datastore;
        if(g==1)
        {
            datastore2.setGasType("Regular");
            datastore2.setPrice(datastore2.getRprice());
        }
        else if(g==2)
        {
            datastore2.setGasType("Diesel");
            datastore2.setPrice(datastore2.getDprice());
        }
        else if(g==3)
        {
            datastore2.setGasType("Super");
            datastore2.setPrice(datastore2.getSprice());
        }
        System.out.println("Price set for "+datastore2.getGasType()+" Gas : "+datastore2.getPrice()+" / Gallon \n");
    }
}
