package lesson1;

public class Fish extends Animal {
    public Fish(String  nikname, int  jump, int  run, int  swim) {
        super(nikname, jump, run, swim);
    }


    public String toString(){
        return "Рыба: " + getNikname() + ", " + "прыгает: " + getJump() +  " раз, " + "бегает: " + getRun() + " м, " + "плавает "+ getSwim() + " м";
    }


}
