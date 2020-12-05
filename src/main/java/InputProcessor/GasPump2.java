package InputProcessor;

import Datastore.Datastore;
import Datastore.Datastore2;
import EFSM.MDA_EFSM;
import Factory.AbstractFactory;
import Factory.GasPump2Factory;
import OutputProcessor.OutputProcessor;


/* Input Processor GasPump2 */

public class GasPump2 {
    AbstractFactory abstractFactory;
    MDA_EFSM mda_efsm;
    Datastore datastore;

    /* Initialize Connections to Factory/Datastore/MDA-EFSM */
    public GasPump2(AbstractFactory abstractFactory)
    {
        this.abstractFactory=abstractFactory;
        this.datastore=abstractFactory.getDatastore();
        this.mda_efsm=new MDA_EFSM(new OutputProcessor(abstractFactory));
    }

    /* Display Operations Available for GP2 */
    public void displayOperations() {

        System.out.println("" +
                "Select Operation for GasPump 2 : \n" +
                "0.) Activate \n" +
                "1.) Start \n" +
                "2.) PayCredit \n" +
                "3.) Reject \n" +
                "4.) PayDebit \n" +
                "5.) Pin \n" +
                "6.) Cancel \n" +
                "7.) Approved \n" +
                "8.) Diesel \n" +
                "9.) Regular \n" +
                "10.) Super \n" +
                "11.) StartPump\n" +
                "12.) PumpGallon\n" +
                "13.) StopPump \n" +
                "14.) FullTank \n" +
                "q.) Quit\n");
    }


    /* Operations - Call the corresponding event */

    public void Activate(float a, float b, float c) {
        if(a>0 && b>0 && c>0)
        {
            Datastore2 datastore2 = (Datastore2) this.datastore;
            datastore2.setTemp_a(a);
            datastore2.setTemp_b(b);
            datastore2.setTemp_c(c);
            mda_efsm.Activate();
        }
        else
        {
            System.out.println("Failed. Please input value greater than 0 for all values!");
        }
    }
    public void Start() {
        mda_efsm.Start();
    }
    public void PayCredit() {
        mda_efsm.PayCredit();
    }
    public void Reject() {
        mda_efsm.Reject();
    }
    public void PayDebit(String p) {
        Datastore2 datastore2 = (Datastore2) this.datastore;
        datastore2.setTemp_p(p);
        mda_efsm.PayDebit();
    }
    public void Pin(String x) {
        Datastore2 datastore2 = (Datastore2) this.datastore;
        String pin = datastore2.getPin();

        if(x.equals(pin))
        {
            mda_efsm.CorrectPin();
        }
       else
        {
            mda_efsm.IncorrectPin(1);
        }

    }
    public void Cancel() {
        mda_efsm.Cancel();
    }
    public void Approved() {
        mda_efsm.Approved();
    }
    public void Diesel() {
        mda_efsm.SelectGas(2);
    }
    public void Regular() {
        mda_efsm.SelectGas(1);
    }
    public void Super() {
        mda_efsm.SelectGas(3);
    }
    public void StartPump() {
        Datastore2 datastore2 = (Datastore2) this.datastore;
        float price = datastore2.getPrice();

        if (price > 0) {
            mda_efsm.StartPump();
        }
        else
        {
            System.out.println("Price not set to 0!");
        }
    }
    public void PumpGallon() {
        mda_efsm.Pump();
    }
    public void StopPump() {
        mda_efsm.StopPump();
    }

    public void FullTank() {
        mda_efsm.StopPump();
    }
}
