package OutputProcessor.Strategy.DisplayMenu;

import Datastore.Datastore;
import Datastore.Datastore2;

public  class DisplayMenu2 extends DisplayMenu {

    public DisplayMenu2(Datastore datastore)
    {
        super(datastore);
    }

    public  void displayMenu() {
        Datastore2 datastore2 = (Datastore2)datastore;
        System.out.println("Transaction Success.. \n Select Gas Type ... \n \n " +
                "1.) Regular ["+datastore2.getRprice()+"] / Gallon \n" +
                "2.) Diesel  ["+datastore2.getDprice()+"] / Gallon \n" +
                "3.) Super  ["+datastore2.getSprice()+"] / Gallon \n >");
    }
}