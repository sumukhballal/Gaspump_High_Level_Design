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


/* Output Processor Base Class */

public class OutputProcessor {

    AbstractFactory abstractFactory;
    int k;

    /* Initialize once only */

    private SetPrice setPrice;
    private SetW setW;
    private StoreCash storeCash;
    private StorePin storePin;
    private StorePrices storePrices;
    private PayMsg payMsg;
    private WrongPinMsg wrongPinMsg;
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private EjectCard ejectCard;
    private EnterPinMsg enterPinMsg;
    private GasPumpedMsg gasPumpedMsg;
    private InitializeData initializeData;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;

    public OutputProcessor(AbstractFactory abstractFactory) {
        this.abstractFactory=abstractFactory;

        /* Set the objects only once hence we need to intialize this in the constructor */
        intializeObjects(abstractFactory);
    }

    private void intializeObjects(AbstractFactory abstractFactory)
    {
        this.setW=abstractFactory.getSetW();
        this.setPrice=abstractFactory.getSetPrice();
        this.storeCash=abstractFactory.getStoreCash();
        this.storePin=abstractFactory.getStorePin();
        this.storePrices=abstractFactory.getStorePrices();
        this.payMsg=abstractFactory.getPayMsg();
        this.wrongPinMsg=abstractFactory.getWrongPinMsg();
        this.cancelMsg=abstractFactory.getCancelMsg();
        this.displayMenu=abstractFactory.getDisplayMenu();
        this.ejectCard=abstractFactory.getEjectCard();
        this.enterPinMsg=abstractFactory.getEnterPinMsg();
        this.gasPumpedMsg=abstractFactory.getGasPumpedMsg();
        this.initializeData=abstractFactory.getInitializeData();
        this.printReceipt=abstractFactory.getPrintReceipt();
        this.pumpGasUnit=abstractFactory.getPumpGasUnit();
        this.rejectMsg=abstractFactory.getRejectMsg();
        this.returnCash=abstractFactory.getReturnCash();
        this.setInitialValues=abstractFactory.getSetInitialValue();

    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }


    /* Call AbstractFactory of GP1 or GP2 and get the Correct Strategy Class Corresponding to it */

    public void StorePrices()
    {
        storePrices.storePrices();
    }

    public void PayMsg() {
        payMsg.payMsg();
    }

    public void StoreCash() {
        storeCash.storeCash();
    }
    public void DisplayMenu()	 {
        displayMenu.displayMenu();
    }
    public void RejectMsg() {
        rejectMsg.rejectMsg();
    }
    public void SetPrice(int g) {
        setPrice.setPrice(g);
    }
    public void SetInitialValues() {
        setInitialValues.setInitialValues();
    }
    public void PumpGasUnit() {
        pumpGasUnit.pumpGasUnit();
    }
    public void GasPumpedMsg() {
        gasPumpedMsg.gasPumpedMsg();
    }
    public void PrintReceipt() {
        printReceipt.printReceipt();
    }
    public void CancelMsg() {
        cancelMsg.cancelMsg();
    }
    public void ReturnCash() 	{
        returnCash.returnCash();
    }
    public void WrongPinMsg() {
        wrongPinMsg.wrongPinMsg();
    }
    public void StorePin() {
        storePin.storePin();
    }
    public void EnterPinMsg() {
        enterPinMsg.enterPinMsg();
    }
    public void InitializeData() {
        initializeData.initializeData();
    }
    public void EjectCard() {
        ejectCard.ejectCard();
    }
    public void SetW(int v) {
        setW.setW(v);
    }
}
