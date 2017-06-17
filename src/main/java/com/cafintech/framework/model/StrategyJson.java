package com.cafintech.framework.model;

/**
 * Created by nick on 2017/6/17.
 *
 * Json object for data transform
 *
 */
public class StrategyJson {

    private String description;
    private Inputs inputs;
    private Strategy strategy;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
