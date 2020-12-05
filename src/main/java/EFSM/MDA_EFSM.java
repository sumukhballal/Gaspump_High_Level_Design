package EFSM;

import EFSM.State.*;
import OutputProcessor.OutputProcessor;

public class MDA_EFSM {

    /* MDA-EFSM Context Class */

    State state;
    State[] LS;

    public MDA_EFSM(OutputProcessor outputProcessor)
    {

        /* State 0 - Start
        * State 1 - S0
        * State 2 - S1
        * State 3 - S2
        * State 4 - S3
        * State 5 - S4
        * State 6 - S5
        * */

        LS=new State[7];
        LS[0]=new Start(this, outputProcessor);
        LS[1]=new S0(this, outputProcessor);
        LS[2]=new S1(this, outputProcessor);
        LS[3]=new S2(this, outputProcessor);
        LS[4]=new S3(this, outputProcessor);
        LS[5]=new S4(this, outputProcessor);
        LS[6]=new S5(this, outputProcessor);
        SetState(0);
    }

    /* Set the current state */
    public void SetState(int s) {
        this.state=LS[s];
    }

    /* Get the current state */
    public State GetState()
    {
        return this.state;
    }

    /* Call corresponding state events */
    public void Activate() {
        state.Activate();
    }

    public void Start() {
        state.Start();
    }
    public void Reject() {
        state.Reject();
    }
    public void Cancel() {
        state.Cancel();
    }
    public void Approved() {
        state.Approved();
    }
    public void StartPump() {
        state.StartPump();
    }
    public void Pump() {
        state.Pump();
    }
    public void StopPump() {
        state.StopPump();
    }
    public void SelectGas(int g) {
        state.SelectGas(g);
    }
    public void CorrectPin() {
        state.CorrectPin();
    }
    public void IncorrectPin(int max) {
        state.IncorrectPin(max);
    }
    public void PayCash() {
        state.PayCash();
    }
    public void PayCredit() {
        state.PayCredit();
    }
    public void PayDebit() {
        state.PayDebit();
    }

}
