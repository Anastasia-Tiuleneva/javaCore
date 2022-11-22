package lessonOne.lesson1;

public class Turtle extends Animal {
    public Turtle(String  nikname, int  jump, int  run, int  swim) {
        super(nikname, jump, run, swim);
    }

    public String toString(){
        return "Черепаха: " + getNikname() + ", " + "прыгает: " + getJump() +  " раз, " + "бегает: " + getRun() + " м, " + "плавает "+ getSwim() + " м";
    }




}

