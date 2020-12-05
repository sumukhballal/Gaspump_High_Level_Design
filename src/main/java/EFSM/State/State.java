package EFSM.State;

import EFSM.MDA_EFSM;
import OutputProcessor.OutputProcessor;

public class State {

    /* Global Values for all children class */
    MDA_EFSM mda_efsm;
    OutputProcessor outputProcessor;

    /* Forms the base class with global MDA-EFSM and OutputProcessor Objects */

    public State(MDA_EFSM mda_efsm, OutputProcessor outputProcessor) {
        this.mda_efsm=mda_efsm;
        this.outputProcessor=outputProcessor;
    }

    /* All Operations are set to Invalid as this should only be called from the State Class Children */
    /* This class cannot be made abstract as that would mean implementation for every operation in child classes */

    public void Activate() {
        System.out.println("Invalid!");
    }
    public void Start() {
        System.out.println("Invalid!");
    }
    public void PayCash() {
        System.out.println("Invalid!");
    }
    public void PayCredit() {
        System.out.println("Invalid!");
    }
    public void PayDebit() {
        System.out.println("Invalid!");
    }
    public void Cancel() {
        System.out.println("Invalid!");
    }
    public void Approved() {
        System.out.println("Invalid!");
    }
    public void IncorrectPin(int max) {
        System.out.println("Invalid!");
    }
    public void CorrectPin() { System.out.println("Invalid!"); }
    public void Reject() { System.out.println("Invalid!"); }
    public void StopPump() {
        System.out.println("Invalid!");
    }
    public void Pump() {
        System.out.println("Invalid!");
    }
    public void StartPump() {
        System.out.println("Invalid!");
    }
    public void SelectGas(int g) {
        System.out.println("Invalid!");
    }
}
