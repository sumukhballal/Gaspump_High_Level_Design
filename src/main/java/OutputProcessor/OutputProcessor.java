package OutputProcessor;

import Factory.AbstractFactory;
import OutputProcessor.Strategy.CancelMsg.CancelMsg;
import OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import OutputProcessor.Strategy.EjectCard.EjectCard;
import OutputProcessor.Strategy.EnterPinMsg.EnterPinMsg;
import OutputProcessor.Strategy.GasPumpedMsg.GasPumpedMsg;
import OutputProcessor.Strategy.InitializeData.InitializeData;
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
import OutputProcessor.Strategy.PayMsg.PayMsg;
import OutputProcessor.Strategy.WrongPinMsg.WrongPinMsg;;

public class OutputProcessor {

    AbstractFactory abstractFactory;
    int k;

    public OutputProcessor(AbstractFactory abstractFactory) {
        this.abstractFactory=abstractFactory;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    public void StorePrices()
    {
        StorePrices storePrices = this.abstractFactory.getStorePrices();
        storePrices.storePrices();
    }

    public void PayMsg() {
        PayMsg payMsg = this.abstractFactory.getPayMsg();
        payMsg.payMsg();
    }

    public void StoreCash() {
        StoreCash storeCash = this.abstractFactory.getStoreCash();
        storeCash.storeCash();
    }
    public void DisplayMenu()	 {
        DisplayMenu displayMenu = this.abstractFactory.getDisplayMenu();
        displayMenu.displayMenu();
    }
    public void RejectMsg() {

    }
    public void SetPrice(int g) {
        SetPrice setPrice = this.abstractFactory.getSetPrice();
        setPrice.setPrice(g);
    }
    public void SetInitialValues() {
        SetInitialValues setInitialValues = this.abstractFactory.getSetInitialValue();
        setInitialValues.setInitialValues();
    }
    public void PumpGasUnit() {
        PumpGasUnit pumpGasUnit = this.abstractFactory.getPumpGasUnit();
        pumpGasUnit.pumpGasUnit();
    }
    public void GasPumpedMsg() {
        GasPumpedMsg gasPumpedMsg = this.abstractFactory.getGasPumpedMsg();
        gasPumpedMsg.gasPumpedMsg();
    }
    public void PrintReceipt() {
        PrintReceipt printReceipt = this.abstractFactory.getPrintReceipt();
        printReceipt.printReceipt();
    }
    public void CancelMsg() {
        CancelMsg cancelMsg = this.abstractFactory.getCancelMsg();
        cancelMsg.cancelMsg();
    }
    public void ReturnCash() 	{
        ReturnCash returnCash = this.abstractFactory.getReturnCash();
        returnCash.returnCash();
    }
    public void WrongPinMsg() {
        WrongPinMsg wrongPinMsg = this.abstractFactory.getWrongPinMsg();
        wrongPinMsg.wrongPinMsg();
    }
    public void StorePin() {
        StorePin storePin = this.abstractFactory.getStorePin();
        storePin.storePin();
    }
    public void EnterPinMsg() {
        EnterPinMsg enterPinMsg = this.abstractFactory.getEnterPinMsg();
        enterPinMsg.enterPinMsg();
    }
    public void InitializeData() {
        InitializeData initializeData = this.abstractFactory.getInitializeData();
        initializeData.initializeData();
    }
    public void EjectCard() {
        EjectCard ejectCard = this.abstractFactory.getEjectCard();
        ejectCard.ejectCard();
    }
    public void SetW(int v) {
        SetW setW = this.abstractFactory.getSetW();
        setW.setW(v);
    }
}
