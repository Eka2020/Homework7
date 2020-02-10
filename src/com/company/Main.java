package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.setHealth(250);
        w.setDamage(30);
       w.setAttakType(20);
        System.out.println("Воин");
        System.out.println("запас жизни "+ w.getHealth());
        System.out.println("сила атаки "+ w.getDamage());
        System.out.println("супер способность "+ w.getAttakType());
        System.out.println("___________________________");
        Magic m=new Magic();
        m.setHealth(260);
        m.setDamage(20);
        m.setAttakType(40);
        System.out.println("Воин с магическими способностями");
        System.out.println("запас жизни "+ m.getHealth());
        System.out.println("сила атаки "+ m.getDamage());
        System.out.println("супер способность "+ m.getAttakType());
        System.out.println("___________________________");

        Kinetic k=new Kinetic();
        k.setHealth(270);
        k.setDamage(35);
        k.setAttakType(50);
        System.out.println("Воин с кинетическими способностями");
        System.out.println("запас жизни "+ k.getHealth());
        System.out.println("сила атаки "+ k.getDamage());
        System.out.println("супер способность "+ k.getAttakType());
        System.out.println("___________________________");

    }

    private static void changeDefence() {
        changeDefence();
    }

}
