package Factory;

import Datastore.Datastore;
import Datastore.Datastore2;
import OutputProcessor.Strategy.CancelMsg.CancelMsg;
import OutputProcessor.Strategy.CancelMsg.CancelMsg2;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu2;
import OutputProcessor.Strategy.EjectCard.EjectCard;
import OutputProcessor.Strategy.EjectCard.EjectCard2;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg2;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg2;
import OutputProcessor.Strategy.InitializeData.InitializeData;
import OutputProcessor.Strategy.InitializeData.InitializeData2;
import OutputProcessor.Strategy.PayMsg.PayMsg;
import OutputProcessor.Strategy.PayMsg.PayMsg2;
import OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import OutputProcessor.Strategy.PrintReceipt.PrintReceipt2;
import OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit2;
import OutputProcessor.Strategy.RejectMsg.RejectMsg;
import OutputProcessor.Strategy.RejectMsg.RejectMsg2;
import OutputProcessor.Strategy.ReturnCash.ReturnCash;
import OutputProcessor.Strategy.ReturnCash.ReturnCash2;
import OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import OutputProcessor.Strategy.SetInitialValues.SetInitialValues2;
import OutputProcessor.Strategy.SetPrice.SetPrice;
import OutputProcessor.Strategy.SetPrice.SetPrice2;
import OutputProcessor.Strategy.SetW.SetW;
import OutputProcessor.Strategy.SetW.SetW2;
import OutputProcessor.Strategy.StoreCash.StoreCash;
import OutputProcessor.Strategy.StoreCash.StoreCash2;
import OutputProcessor.Strategy.StorePin.StorePin;
import OutputProcessor.Strategy.StorePin.StorePin2;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.StorePrices.StorePrices2;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg2;


/* Abstract Factory 2 class */


public class GasPump2Factory extends  AbstractFactory {

    Datastore datastore;

    /* Set and return Datastore */
    public Datastore getDatastore() {
        if(this.datastore==null) {
            this.datastore = new Datastore2();
        }
        return this.datastore;
    }

    /* Return Objects corresponding to GP2 - Output Processor */


    @Override
    public StorePrices getStorePrices() {
        return new StorePrices2(getDatastore());
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg2();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2(getDatastore());
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2(getDatastore());
    }

    @Override
    public WrongPinMsg getWrongPinMsg() {
        return new WrongPinMsg2();
    }

    @Override
    public StorePin getStorePin() {
        return new StorePin2(getDatastore());
    }

    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new EnterPinMsg2();
    }

    @Override
    public InitializeData getInitializeData() {
        return new InitializeData2(getDatastore());
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard2();
    }

    @Override
    public SetW getSetW() {
        return new SetW2(getDatastore());
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(getDatastore());
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2(getDatastore());
    }

    @Override
    public SetInitialValues getSetInitialValue() {
        return new SetInitialValues2(getDatastore());
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2(getDatastore());
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2(getDatastore());
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2(getDatastore());
    }
}
