package lessonOne.lesson1;

public abstract class Animal  {

    private String nikname;
    private int jump;
    private int  run;
    private int  swim;

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public Animal (String  nikname, int  jump, int  run, int  swim) {
        this.nikname = nikname;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
    public abstract String toString();










}
