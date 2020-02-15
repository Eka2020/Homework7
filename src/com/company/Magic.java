package com.company;

public class Magic extends Hero {

    @Override
    public void superPower(double superpower) {
        System.out.println("Супер способность Магического воина = Сила атаки * коэффициент = " + superpower * getDamage());

    }

    @Override
    public void superPower() {
        return;
    }
}
