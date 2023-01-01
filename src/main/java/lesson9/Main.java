package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Марина", Arrays.asList(new Course("Математика"),
                new Course("Биология"), new Course("Информатика"))));
        studentList.add(new Student("Федор", Arrays.asList(new Course("Математика"))));
        studentList.add(new Student("Петр", Arrays.asList(new Course("Биология"),
                new Course("Экономика"))));
        studentList.add(new Student("Иван", Arrays.asList(new Course("Математика"),
                new Course("Биология"), new Course("Информатика"),
                new Course("Психология"), new Course("Экономика"))));

        //1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
        // на которые подписаны студенты.

        System.out.println(studentList.stream()
                .map(s -> s.getCourseList())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));


        //2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых
        //любознательных (любознательность определяется количеством курсов).

        System.out.println(studentList.stream()
                .sorted((s1, s2) -> s2.getCourseList().size() - s1.getCourseList().size())
                .map(s -> s.getName())
                .limit(3)
                .collect(Collectors.toList()));

        //3. Написать функцию, принимающую на вход список Student и экземпляр Course,
        // возвращающую список студентов, которые посещают этот курс.

        Course course1 = new Course("Информатика");
        System.out.println(studentList.stream()
                .filter(s -> s.getCourseList().contains(course1))
                .map(s -> s.getName())
                .collect(Collectors.toList()));




    }
}
