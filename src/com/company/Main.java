package com.company;


public class Main {

    public static void main(String[] args) {
	StragedyUsage str = new StragedyUsage(new Strategy1());
	//str.setStrategyUsage(new Strategy1());
	str.useStragedy();

    str.setStrategyUsage(new Strategy2());
    str.useStragedy();

    }
}
