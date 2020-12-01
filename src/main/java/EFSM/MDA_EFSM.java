package EFSM;

import EFSM.State.*;
import OutputProcessor.OutputProcessor;

public class MDA_EFSM {

    State state;
    State[] LS;
    OutputProcessor outputProcessor;

    public MDA_EFSM()
    {
        LS=new State[7];
        LS[0]=new Start(this);
        LS[1]=new S0(this);
        LS[2]=new S1(this);
        LS[3]=new S2(this);
        LS[4]=new S3(this);
        LS[5]=new S4(this);
        LS[6]=new S5(this);
        SetState(0);
    }

    public void SetState(int s) {
        this.state=LS[s];
    }

    public State GetState()
    {
        return this.state;
    }

    public State[] GetStates()
    {
        return this.LS;
    }

    public void Activate() {
        state.Activate();
    }

    public void setOutputProcessor(OutputProcessor outputProcessor) {
        this.outputProcessor=outputProcessor;
    }

    public OutputProcessor getOutputProcessor() {
        return this.outputProcessor;
    }
}
