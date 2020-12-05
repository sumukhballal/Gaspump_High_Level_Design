package InputProcessor;

import Datastore.Datastore;
import Datastore.Datastore1;
import EFSM.MDA_EFSM;
import Factory.AbstractFactory;
import Factory.GasPump1Factory;
import OutputProcessor.OutputProcessor;


/* Input Processor GasPump1 */
public class GasPump1 {

    AbstractFactory abstractFactory;
    MDA_EFSM mda_efsm;
    Datastore datastore;

    /* Initialize Connections to Factory/Datastore/MDA-EFSM */
    public GasPump1(AbstractFactory abstractFactory) {
        this.abstractFactory=abstractFactory;
        this.datastore=abstractFactory.getDatastore();
        this.mda_efsm=new MDA_EFSM(new OutputProcessor(abstractFactory));
    }

    /* Display Operations Available for GP1 */
    public void displayOperations() {

        System.out.println("" +
                "Select Operation for GasPump 1 : \n" +
                "0.) Activate\n" +
                "1.) Start \n" +
                "2.) PayCredit \n" +
                "3.) Reject \n" +
                "4.) Cancel \n" +
                "5.) Approved \n" +
                "6.) PayCash \n" +
                "7.) StartPump \n" +
                "8.) PumpLiter \n" +
                "9.) StopPump \n" +
                "q.) Quit\n >");
    }


    /* Operations - Call the corresponding event */

    public void Activate(int a) {
        if(a>0)
        {
            Datastore1 datastore1 = (Datastore1) this.datastore;
            datastore1.setTemp_a(a);
            mda_efsm.Activate();
        }
        else
        {
            System.out.println("Failed. Please input value greater than 0.");
        }
    }

    public void Start() {
        mda_efsm.Start();;
    }
    public void PayCredit() {
        mda_efsm.PayCredit();
    }
    public void Reject() {
        mda_efsm.Reject();
    }
    public void Cancel() {
        mda_efsm.Cancel();
    }
    public void Approved() {
        mda_efsm.Approved();
    }
    public void PayCash(int c) {
        if(c>0)
        {
            Datastore1 datastore1 = (Datastore1) this.datastore;
            datastore1.setTemp_c(c); // Set Temp Cash
            mda_efsm.PayCash();
        }
        else {
            System.out.println("Please give cash greater than 0!");
        }
    }
    public void StartPump() {
        mda_efsm.StartPump();
    }
    public void PumpLiter() {
        Datastore1 datastore1 = (Datastore1) this.datastore;
        int w = datastore1.getW();
        int price = datastore1.getPrice();
        int cash = (w==1)?datastore1.getCash():0;
        int L = datastore1.getL();

        /* W=1 for Cash and W=0 for Credit/Debit */

        if((w==1 && (cash >= price*(L+1))) || w==0 )
        {
            mda_efsm.Pump();
        }
        else {
            mda_efsm.StopPump();
            System.out.println("Cash Exhausted!");
        }
    }
    public void StopPump() {
        mda_efsm.StopPump();
    }
}
