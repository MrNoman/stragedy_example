package com.company;

public class StragedyUsage {
    private Strategy strategy;

    public void setStrategyUsage (Strategy strategy){
        this.strategy = strategy;
    }

    public void useStragedy (){
        strategy.doSmth();
    }
}
