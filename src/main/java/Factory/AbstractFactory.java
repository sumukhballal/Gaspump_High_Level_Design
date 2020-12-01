package Factory;

import Datastore.Datastore;
import OutputProcessor.Strategy.StorePrices.StorePrices;

public abstract class AbstractFactory {

    public abstract Datastore getDatastore();
    public abstract StorePrices getStorePrices();

}
