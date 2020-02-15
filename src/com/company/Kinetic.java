package com.company;

public class Kinetic extends Hero {


    @Override
    public void superPower() {
        return;
    }

    @Override
    public void superPower(double superpower) {
        System.out.println("Супер способность кинетического воина = Сила атаки * коэффициент = "+superpower*getDamage());
    }
}
