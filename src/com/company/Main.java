package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.setHealth(250);
        System.out.println("Воин");
        System.out.println("запас жизни " + w.getHealth());
        w.setDamage(30);
        System.out.println("сила атаки " + w.getDamage());
        w.superPower(1.5);

        System.out.println("___________________________");
        Magic m = new Magic();
        m.setHealth(260);
        m.setDamage(20);

        System.out.println("Воин с магическими способностями");
        System.out.println("запас жизни " + m.getHealth());
        System.out.println("сила атаки " + m.getDamage());
        m.superPower(3);
        System.out.println("___________________________");

        Kinetic k = new Kinetic();
        k.setHealth(270);
        k.setDamage(35);
        System.out.println("Воин с кинетическими способностями");
        System.out.println("запас жизни " + k.getHealth());
        System.out.println("сила атаки " + k.getDamage());
        k.superPower(2);
        System.out.println("___________________________");

    }

    private static void changeDefence() {
        changeDefence();
    }

}
