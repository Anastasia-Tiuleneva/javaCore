package lesson1;

public class Course {
    public int getJumping() {
        return jumping;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    public int getRuning() {
        return runing;
    }

    public void setRuning(int runing) {
        this.runing = runing;
    }

    public int getSwiming() {
        return swiming;
    }

    public void setSwiming(int swiming) {
        this.swiming = swiming;
    }

    private int jumping;
    private int runing;

    private int swiming;



    public Course ( int jumping, int runing, int swiming) {
        this.runing = runing;
        this.jumping = jumping;
        this.swiming = swiming;
    }
    public String toString(){
        return "Полоса препядствий состоит из:" + " " + runing + ","  + " " + jumping+ ","  + " " + swiming ;
    }
    public void courseInfo() {
        System.out.println("Полоса препядствий состоит из:" + " " + runing + ","  + " " + jumping+ ","  + " " + swiming);
    }


   public void doIt(Team x) {
        if (x.getPlayer1().getJump() >= getJumping()){
            x.setResultJumpPlayer1("Успешно");
        }
        else {
            x.setResultJumpPlayer1("Поражение");
        }
       if (x.getPlayer1().getRun() >= getRuning()){
           x.setResultRunPlayer1("Успешно");
       }
       else {
           x.setResultRunPlayer1("Поражение");
       }
       if (x.getPlayer1().getSwim() >= getSwiming()){
               x.setResultSwimPlayer1("Успешно");
       }
       else {
               x.setResultSwimPlayer1("Поражение");
       }
       if (x.getPlayer2().getJump() >= getJumping()){
           x.setResultJumpPlayer2("Успешно");
       }
       else {
           x.setResultJumpPlayer2("Поражение");
       }
       if (x.getPlayer2().getRun() >= getRuning()){
           x.setResultRunPlayer2("Успешно");
       }
       else {
           x.setResultRunPlayer2("Поражение");
       }
       if (x.getPlayer2().getSwim() >= getSwiming()){
           x.setResultSwimPlayer2("Успешно");
       }
       else {
           x.setResultSwimPlayer2("Поражение");
       }
       if (x.getPlayer3().getJump() >= getJumping()){
           x.setResultJumpPlayer3("Успешно");
       }
       else {
           x.setResultJumpPlayer3("Поражение");
       }
       if (x.getPlayer3().getRun() >= getRuning()){
           x.setResultRunPlayer3("Успешно");
       }
       else {
           x.setResultRunPlayer3("Поражение");
       }
       if (x.getPlayer3().getSwim() >= getSwiming()){
           x.setResultSwimPlayer3("Успешно");
       }
       else {
           x.setResultSwimPlayer3("Поражение");
       }
       if (x.getPlayer4().getJump() >= getJumping()){
           x.setResultJumpPlayer4("Успешно");
       }
       else {
           x.setResultJumpPlayer4("Поражение");
       }
       if (x.getPlayer4().getRun() >= getRuning()){
           x.setResultRunPlayer4("Успешно");
       }
       else {
           x.setResultRunPlayer4("Поражение");
       }
       if (x.getPlayer1().getSwim() >= getSwiming()){
           x.setResultSwimPlayer4("Успешно");
       }
       else {
           x.setResultSwimPlayer4("Поражение");
       }
   }



}
