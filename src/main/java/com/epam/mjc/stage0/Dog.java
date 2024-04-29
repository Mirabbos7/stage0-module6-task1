package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog(){
        super("brown", 4 , true);
    }

    @Override
    public String getDescription(){
        String fur = super.isHasFur() ? "a" : "no";
        String pawPlural = super.getNumberOfPaws() == 1 ? "paw" : "paws";
        return "This animal is mostly " + super.getColor() + ". It has "+getNumberOfPaws() + " " + pawPlural+ " and " + fur + " fur.";
    }
}
