package Factory;

import Datastore.Datastore;
import OutputProcessor.Strategy.CancelMsg.CancelMsg;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import OutputProcessor.Strategy.EjectCard.EjectCard;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import OutputProcessor.Strategy.InitializeData.InitializeData;
import OutputProcessor.Strategy.PayMsg.PayMsg;
import OutputProcessor.Strategy.PrintReceipt.PrintReceipt;
import OutputProcessor.Strategy.PumpGasUnit.PumpGasUnit;
import OutputProcessor.Strategy.RejectMsg.RejectMsg;
import OutputProcessor.Strategy.ReturnCash.ReturnCash;
import OutputProcessor.Strategy.SetInitialValues.SetInitialValues;
import OutputProcessor.Strategy.SetPrice.SetPrice;
import OutputProcessor.Strategy.SetW.SetW;
import OutputProcessor.Strategy.StoreCash.StoreCash;
import OutputProcessor.Strategy.StorePin.StorePin;
import OutputProcessor.Strategy.StorePrices.StorePrices;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg;

public abstract class AbstractFactory {

    public abstract Datastore getDatastore();
    public abstract StorePrices getStorePrices();
    public abstract PayMsg getPayMsg();
    public abstract StoreCash getStoreCash();
    public abstract DisplayMenu getDisplayMenu();
    public abstract RejectMsg getRejectMsg();
    public abstract SetPrice getSetPrice();
    public abstract SetInitialValues getSetInitialValue();
    public abstract PumpGasUnit getPumpGasUnit();
    public abstract GasPumpedMsg getGasPumpedMsg();
    public abstract PrintReceipt getPrintReceipt();
    public abstract CancelMsg getCancelMsg();
    public abstract ReturnCash getReturnCash();
    public abstract WrongPinMsg getWrongPinMsg();
    public abstract StorePin getStorePin();
    public abstract EnterPinMsg getEnterPinMsg();
    public abstract InitializeData getInitializeData();
    public abstract EjectCard getEjectCard();
    public abstract SetW getSetW();

}
