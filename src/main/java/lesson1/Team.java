package lesson1;

public class Team {

    private String name;
    private Animal player1;
    private Animal player2;
    private Animal player3;
    private Animal player4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPlayer1() {
        return player1;
    }

    public void setPlayer1(Animal player1) {
        this.player1 = player1;
    }

    public Animal getPlayer2() {
        return player2;
    }

    public void setPlayer2(Animal player2) {
        this.player2 = player2;
    }

    public Animal getPlayer3() {
        return player3;
    }

    public void setPlayer3(Animal player3) {
        this.player3 = player3;
    }

    public Animal getPlayer4() {
        return player4;
    }

    public void setPlayer4(Animal player4) {
        this.player4 = player4;
    }






    private String resultJumpPlayer1;
    private String resultRunPlayer1;
    private String resultSwimPlayer1;
    private String resultJumpPlayer2;
    private String resultRunPlayer2;
    private String resultSwimPlayer2;
    private String resultJumpPlayer3;
    private String resultRunPlayer3;
    private String resultSwimPlayer3;
    private String resultJumpPlayer4;
    private String resultRunPlayer4;
    private String resultSwimPlayer4;


    public String getResultJumpPlayer1() {
        return resultJumpPlayer1;
    }

    public void setResultJumpPlayer1(String resultJumpPlayer1) {
        this.resultJumpPlayer1 = resultJumpPlayer1;
    }

    public String getResultRunPlayer1() {
        return resultRunPlayer1;
    }

    public String getResultJumpPlayer2() {
        return resultJumpPlayer2;
    }

    public void setResultJumpPlayer2(String resultJumpPlayer2) {
        this.resultJumpPlayer2 = resultJumpPlayer2;
    }

    public String getResultRunPlayer2() {
        return resultRunPlayer2;
    }

    public void setResultRunPlayer2(String resultRunPlayer2) {
        this.resultRunPlayer2 = resultRunPlayer2;
    }

    public String getResultSwimPlayer2() {
        return resultSwimPlayer2;
    }

    public void setResultSwimPlayer2(String resultSwimPlayer2) {
        this.resultSwimPlayer2 = resultSwimPlayer2;
    }

    public String getResultJumpPlayer3() {
        return resultJumpPlayer3;
    }

    public void setResultJumpPlayer3(String resultJumpPlayer3) {
        this.resultJumpPlayer3 = resultJumpPlayer3;
    }

    public String getResultRunPlayer3() {
        return resultRunPlayer3;
    }

    public void setResultRunPlayer3(String resultRunPlayer3) {
        this.resultRunPlayer3 = resultRunPlayer3;
    }

    public String getResultSwimPlayer3() {
        return resultSwimPlayer3;
    }

    public void setResultSwimPlayer3(String resultSwimPlayer3) {
        this.resultSwimPlayer3 = resultSwimPlayer3;
    }

    public String getResultJumpPlayer4() {
        return resultJumpPlayer4;
    }

    public void setResultJumpPlayer4(String resultJumpPlayer4) {
        this.resultJumpPlayer4 = resultJumpPlayer4;
    }

    public String getResultRunPlayer4() {
        return resultRunPlayer4;
    }

    public void setResultRunPlayer4(String resultRunPlayer4) {
        this.resultRunPlayer4 = resultRunPlayer4;
    }

    public String getResultSwimPlayer4() {
        return resultSwimPlayer4;
    }

    public void setResultSwimPlayer4(String resultSwimPlayer4) {
        this.resultSwimPlayer4 = resultSwimPlayer4;
    }




    public void setResultRunPlayer1(String resultRunPlayer1) {
        this.resultRunPlayer1 = resultRunPlayer1;
    }

    public String getResultSwimPlayer1() {
        return resultSwimPlayer1;
    }

    public void setResultSwimPlayer1(String resultSwimPlayer1) {
        this.resultSwimPlayer1 = resultSwimPlayer1;
    }





    public Team(String name, Animal player1, Animal player2, Animal player3, Animal player4) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
    }

    public void teamInfo() {
        System.out.println("Команду" + " " + getName() + " " + "представляют следующие участники:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
    }
    public void showResults(){
        System.out.printf("Результаты прохождения полосы припятствий команды %s:", getName());
        System.out.println();
        System.out.printf("%s прошел препядствия с результатми: прыжки - %s, бег - %s, заплыв - %s, %n", player1.getNikname(), resultJumpPlayer1, resultRunPlayer1, resultSwimPlayer1);
        System.out.printf("%s прошел препядствия с результатми: прыжки - %s, бег - %s, заплыв - %s, %n", player2.getNikname(), resultJumpPlayer2, resultRunPlayer2, resultSwimPlayer2);
        System.out.printf("%s прошел препядствия с результатми: прыжки - %s, бег - %s, заплыв - %s, %n", player3.getNikname(), resultJumpPlayer3, resultRunPlayer3, resultSwimPlayer3);
        System.out.printf("%s прошел препядствия с результатми: прыжки - %s, бег - %s, заплыв - %s, %n", player4.getNikname(), resultJumpPlayer4, resultRunPlayer4, resultSwimPlayer4);

    }




}
