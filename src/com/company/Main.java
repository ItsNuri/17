package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal[] animals = {new Shark(),new Eagle(),new Turtle()};

        Animal[] reptile = {new Turtle()};
        Animal[] fish = {new Shark()};
        Animal[] bird = {new Eagle()};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark)s).attack();
            }
            if (s.getClass().getName().equals("com.company.Shark")){
                ((Shark)s).attack();
            }
            if (s instanceof Turtle) {
                ((Turtle)s).swim();
            }
            if (s.getClass().getName().equals("com.company.Turtle")){
                ((Turtle)s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle)s).fly();
            }
            if (s.getClass().getName().equals("com.company.Eagle")){
                ((Eagle)s).fly();
            }}
    }
}
