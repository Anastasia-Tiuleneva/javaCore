package lesson1;

public class Cat extends Animal {
    public Cat(String nikname, int  jump, int  run, int  swim) {
        super(nikname, jump, run, swim );
    }
    @Override
    public String toString() {
        return "Котик: " + getNikname() + ", " + "прыгает: " + getJump() +  " раз, " + "бегает: " + getRun() + " м, " + "плавает "+ getSwim() + " м";

    }
}

