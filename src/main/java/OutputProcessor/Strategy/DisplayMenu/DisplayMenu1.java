package OutputProcessor.Strategy.DisplayMenu;

import Datastore.Datastore;
import Datastore.Datastore1;

public  class DisplayMenu1 extends DisplayMenu {

    public DisplayMenu1(Datastore datastore)
    {
        super(datastore);
    }

    public  void displayMenu() {
        Datastore1 datastore1 = (Datastore1)datastore;
        System.out.println("Transaction Success.. \n Select Gas Type ... \n \n 1.) Regular ["+datastore1.getPrice()+"] / Liter \n >");
    }
}