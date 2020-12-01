package EFSM.State;

import EFSM.MDA_EFSM;

public class State {
    MDA_EFSM mda_efsm;

    public State(MDA_EFSM mda_efsm) {
        this.mda_efsm=mda_efsm;
    }

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
    public void Correctpin() {
        System.out.println("Invalid!");
    }
    public void Reject() {
        System.out.println("Invalid!");
    }
    public void StopPump() {
        System.out.println("Invalid!");
    }
    public void Pump() {
        System.out.println("Invalid!");
    }
    public void StarttPump() {
        System.out.println("Invalid!");
    }
    public void SelectGas(int g) {
        System.out.println("Invalid!");
    }
}
