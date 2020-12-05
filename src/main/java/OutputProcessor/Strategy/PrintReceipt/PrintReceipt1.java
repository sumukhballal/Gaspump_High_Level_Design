package OutputProcessor.Strategy.PrintReceipt;

import Datastore.Datastore;
import Datastore.Datastore1;

public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(Datastore datastore) {
        super(datastore);
    }

    public void printReceipt() {
        Datastore1 datastore1 = (Datastore1) datastore;
        System.out.println("------ Printing Receipt! -------- \n " +
                "Pumped : "+datastore1.getL()+" Litres. \n" +
                "Of type : Regular with Price : $"+datastore1.getPrice()+" / Litre \n" +
                "Paid Amount : $"+datastore1.getTotal()+"\n" +
                "-----------------------------");
    }
}
