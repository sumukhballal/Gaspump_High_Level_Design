package InputProcessor;

import Datastore.Datastore;
import Datastore.Datastore1;
import EFSM.MDA_EFSM;
import Factory.AbstractFactory;
import Factory.GasPump1Factory;

public class GasPump1 {

    AbstractFactory abstractFactory;
    MDA_EFSM mda_efsm;
    Datastore datastore;

    public GasPump1()
    {
        this.mda_efsm=new MDA_EFSM();
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setDatastore(AbstractFactory abstractFactory) {
        this.datastore=abstractFactory.getDatastore();
    }


    public void displayOperations() {

        System.out.println("");
    }

    public void Activate(int a) {
        if(a>0)
        {
            Datastore1 datastore1 = (Datastore1) this.datastore;
            datastore1.temp_a=a;
            mda_efsm.Activate();
        }
        else
        {
            System.out.println("Failed. Please input value greater than 0.");
        }
    }
}
