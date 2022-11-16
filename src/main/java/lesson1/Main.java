package lesson1;


public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Команда 1", new Cat("Мурзик", 5, 10, 5), new Dog("Рекс", 6, 50, 20), new Fish("Золотая", 0, 0, 100), new Turtle("Черепашка", 0, 0, 10)); //
        Course course1 = new Course(4, 7, 10);

        team1.teamInfo();
        course1.doIt(team1);
        team1.showResults();




    }



}