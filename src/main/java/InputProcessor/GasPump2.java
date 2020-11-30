package InputProcessor;

import Datastore.Datastore;
import EFSM.MDA_EFSM;
import Factory.AbstractFactory;
import Factory.GasPump2Factory;

public class GasPump2 {
    AbstractFactory abstractFactory;
    MDA_EFSM mda_efsm;
    Datastore datastore;

    public GasPump2()
    {
        this.mda_efsm=new MDA_EFSM();
    }

    public void setAbstractFactory(GasPump2Factory gasPump2Factory) {
        this.abstractFactory=gasPump2Factory;
    }

    public void setDatastore(GasPump2Factory gasPump2Factory) {
        this.datastore=gasPump2Factory.getDatastore();
    }


}
