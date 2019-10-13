package com.example.Task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;

public class NumbersModel {
    private int number1;
    private int number2;
    private int multiplication;

    public NumbersModel(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.multiplication = 0;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication() {
        this.multiplication = this.number1 * this.number2;
    }

    @JsonIgnore
    public NumbersModel getNumbers(){
        return this;
    }
}
