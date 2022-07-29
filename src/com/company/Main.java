package com.company;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(),
                new Turtle(),
                new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).Attack();
            } else if (animal.getClass().getName().equals("com.company.Eagle")) {
                ((Eagle) animal).Fly();
            }else {
                ((Turtle)animal).Swim();
            }
        }
        System.out.println("------------");

        Eagle[] eagle = {new Eagle()} ;
        for (Eagle a:eagle) {
         a.Fly();
        }
        Shark[] shark = {new Shark()};
        for (Shark s:shark) {
            s.Attack();
        }
        Turtle[] turtles = {new Turtle()};
        for (Turtle t :turtles) {
            t.Swim();
        }
    }
}