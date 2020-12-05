package OutputProcessor.Strategy.PrintReceipt;

import Datastore.Datastore;
import Datastore.Datastore2;

public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(Datastore datastore) {
        super(datastore);
    }

    public void printReceipt() {
        Datastore2 datastore2 = (Datastore2) datastore;
        System.out.println("------ Printing Receipt! -------- \n " +
                "Pumped : "+datastore2.getG()+" Litres. \n" +
                "Of type : " +datastore2.getGasType()+" with Price : $"+datastore2.getPrice()+" / Litre \n" +
                "Paid Amount : $"+datastore2.getTotal()+"\n" +
                "-----------------------------");
    }
}
