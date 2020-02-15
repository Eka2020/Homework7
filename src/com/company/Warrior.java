package com.company;

public class Warrior extends Hero {

    @Override
    public void superPower(double superpower) {
        System.out.println("Супер способность воина = Сила атаки * коэффициент = "+ superpower * getDamage());
    }

    @Override
    public void superPower() {
        return;
    }
}

