package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird(){
        super("blue", 2 , false);
    }

    @Override
    public String getDescription(){
        String fur = super.isHasFur() ? "a" : "no";
        String pawPlural = super.getNumberOfPaws() == 1 ? "paw" : " paws";
        return "This animal is mostly " + super.getColor() + ". It has "+getNumberOfPaws() + pawPlural+ " and " + fur + " fur. " + "Moreover, it has 2 wings and can fly.";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
