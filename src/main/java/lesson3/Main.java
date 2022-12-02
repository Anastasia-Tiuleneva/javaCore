package lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyFruitsDataException {

        Box<Apple> box1  = new Box<Apple>( new Apple(3,0.200),new Apple(4,0.600));
        Box<Apple> box4  = new Box<Apple>( new Apple(3,0.200),new Apple(5,0.600));
        Box<Orange> box2 = new Box<Orange>(new Orange(1, 0.550), new Orange(6, 0.250), new Orange(45, 0.450));
        Box<Orange> box3  = new Box<Orange>( new Orange(3,0.200),new Orange(4,0.600));

        box1.addFruit(new Apple(3, 6.7));



        box2.addFruit(new Orange(3, 6.7));
        box2.addFruit(new Orange(3, 6.7));
        box2.addFruit(new Apple(3, 6.7));
        box1.moving(box4);



        System.out.println(box1.getW());
        System.out.println(box2.getW());
        System.out.println(box1.compare(box3));


         Object[] newArrObj = {1,2,3,4 ,"Поменяй меня", 9};
        myMas(newArrObj);


    }


    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static void myMas(Object[] a){
        Scanner sc = new Scanner(System.in);
        int minElement = sc.nextInt();  //номер элемента 1
        int maxElement = sc.nextInt();  //номер элемента 2
        Object [] newA = new Object[a.length];
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < newA.length; j++){
                if(i == minElement){
                    newA[minElement] = a[maxElement];
                }
                else if(i == maxElement){
                    newA[maxElement] = a[minElement];
                }
                else {newA[j] = a[i];}
                i++;
           }

     }
        a = newA;
        newA = null;
        System.out.printf(Arrays.toString(newA));

    }


}
