package OutputProcessor;

import Factory.AbstractFactory;
import OutputProcessor.Strategy.StorePrices.StorePrices;

public class OutputProcessor {

    private StorePrices storePrices;

    public OutputProcessor(AbstractFactory abstractFactory)
    {
        this.storePrices= abstractFactory.getStorePrices();
    }

    public void StorePrices()
    {
        this.storePrices.storePrices();
    }
}
