package lessonOne.lesson1;

public class Dog extends Animal {
    public Dog(String nikname, int  jump, int  run, int  swim) {
        super(nikname, jump, run, swim);
    }

    public String toString() {
        return "Собака: " + getNikname() + ", " + "прыгает: " + getJump() +  " раз, " + "бегает: " + getRun() + " м, " + "плавает "+ getSwim() + " м";
    }
}

