package Factory;

import Datastore.Datastore;
import Datastore.Datastore1;
import OutputProcessor.Strategy.CancelMsg.CancelMsg;
import OutputProcessor.Strategy.CancelMsg.CancelMsg1;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu1;
import OutputProcessor.Strategy.EjectCard.EjectCard;
import OutputProcessor.Strategy.EjectCard.EjectCard1;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg1;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg1;
import OutputProcessor.Strategy.InitializeData.InitializeData;
import OutputProcessor.Strategy.InitializeData.InitializeData1;
import OutputProcessor.Strategy.PayMsg.PayMsg;
import OutputProcessor.Strategy.PayMsg.PayMsg1;
import OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import OutputProcessor.Strategy.PrintReceipt.PrintReceipt1;
import OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit1;
import OutputProcessor.Strategy.RejectMsg.RejectMsg;
import OutputProcessor.Strategy.RejectMsg.RejectMsg1;
import OutputProcessor.Strategy.ReturnCash.ReturnCash;
import OutputProcessor.Strategy.ReturnCash.ReturnCash1;
import OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import OutputProcessor.Strategy.SetInitialValues.SetInitialValues1;
import OutputProcessor.Strategy.SetPrice.SetPrice;
import OutputProcessor.Strategy.SetPrice.SetPrice1;
import OutputProcessor.Strategy.SetW.SetW;
import OutputProcessor.Strategy.SetW.SetW1;
import OutputProcessor.Strategy.StoreCash.StoreCash;
import OutputProcessor.Strategy.StoreCash.StoreCash1;
import OutputProcessor.Strategy.StorePin.StorePin;
import OutputProcessor.Strategy.StorePin.StorePin1;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.StorePrices.StorePrices1;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg1;



/* Abstract Factory 1 class */


public class GasPump1Factory extends  AbstractFactory {

    Datastore datastore;

    /* Set and return Datastore */
    public Datastore getDatastore() {
        if(this.datastore==null) {
            this.datastore = new Datastore1();
        }
        return this.datastore;
    }

    /* Return Objects corresponding to GP1 - Output Processor */

    @Override
    public StorePrices getStorePrices() {
        return new StorePrices1(getDatastore());
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg1();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1(getDatastore());
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1(getDatastore());
    }

    @Override
    public WrongPinMsg getWrongPinMsg() {
        return new WrongPinMsg1();
    }

    @Override
    public StorePin getStorePin() {
        return new StorePin1(getDatastore());
    }

    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new EnterPinMsg1();
    }

    @Override
    public InitializeData getInitializeData() {
        return new InitializeData1(getDatastore());
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard1();
    }

    @Override
    public SetW getSetW() {
        return new SetW1(getDatastore());
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(getDatastore());
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1(getDatastore());
    }

    @Override
    public SetInitialValues getSetInitialValue() {
        return new SetInitialValues1(getDatastore());
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1(getDatastore());
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg1(getDatastore());
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1(getDatastore());
    }
}
