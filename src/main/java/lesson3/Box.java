package lesson3;


import java.util.Arrays;

public class Box <T extends Fruit> {


    @Override
    public String toString() {
        return "Box{" +
                "boxFrut=" + Arrays.toString(boxFrut) +
                '}';
    }

    private T[] boxFrut;


    public Box(Apple... boxFrut) {
        this.boxFrut = (T[]) boxFrut;
    }
    public Box(Orange... boxFrut) {
        this.boxFrut = (T[]) boxFrut;
    }


    public T[] getBoxFrut() {
        return boxFrut;
    }

    public void setBoxFrut(T[] boxFrut) {
        this.boxFrut = boxFrut;
    }




    public double getW(){
        double sum = 0d;

        for (int i = 0; i < boxFrut.length; i++) {
            sum = boxFrut[i].getWeight() * boxFrut[i].getCount();

        }
        return sum;
    }

    public void addFruit (Fruit a) throws MyFruitsDataException  {

        try {
            if (a.getClass() == Orange.class) {
                System.out.println(this);
                Box<T> newbox = new Box<T>(new Orange[boxFrut.length + 1]);
                T b = (T) a;
                newbox.getBoxFrut()[newbox.getBoxFrut().length - 1] = b;
                System.arraycopy(boxFrut, 0, newbox.getBoxFrut(), 0, boxFrut.length);
                this.setBoxFrut(newbox.getBoxFrut());
                newbox = null;
                System.out.println(this);
            } else if (a.getClass() == Apple.class) {
                System.out.println(this);
                Box<T> newbox = new Box<T>(new Apple[boxFrut.length + 1]);
                T b = (T) a;
                newbox.getBoxFrut()[newbox.getBoxFrut().length - 1] = b;
                System.arraycopy(boxFrut, 0, newbox.getBoxFrut(), 0, boxFrut.length);
                this.setBoxFrut(newbox.getBoxFrut());
                newbox = null;
                System.out.println(this);
            }
        }
        catch (ArrayStoreException e) {
            throw new MyFruitsDataException("Яблоки нельзя положить в коробку с апельсинами, апельсины нельзя положить в коробку с яблоками");
        }


    }


    public void moving(Box <T> x) {
            if (x.getBoxFrut() instanceof Orange[]) {
                System.out.println(this);
                System.out.println(x);
                Box<T> newAll = new Box<T>(new Orange[boxFrut.length + x.getBoxFrut().length]);
                System.arraycopy(this.getBoxFrut(), 0, newAll.getBoxFrut(), 0, boxFrut.length);
                System.arraycopy(x.getBoxFrut(), 0, newAll.getBoxFrut(), boxFrut.length, x.getBoxFrut().length);
                System.out.println(newAll.toString());
                this.setBoxFrut(null);
                x.setBoxFrut(newAll.getBoxFrut());
                newAll = null;
                System.out.println(this);
                System.out.println(x);
            }
            if (x.getBoxFrut() instanceof Apple[]) {
                System.out.println(this);
                System.out.println(x);
                Box<T> newAll = new Box<T>(new Apple[boxFrut.length + x.getBoxFrut().length]);
                System.arraycopy(this.getBoxFrut(), 0, newAll.getBoxFrut(), 0, boxFrut.length);
                System.arraycopy(x.getBoxFrut(), 0, newAll.getBoxFrut(), boxFrut.length, x.getBoxFrut().length);
                System.out.println(newAll.toString());
                this.setBoxFrut(null);
                x.setBoxFrut(newAll.getBoxFrut());
                newAll = null;
                System.out.println(this);
                System.out.println(x);
            }
            //не смогла придумать как выйти на Exception, т.к. при передачи несовместимых типов выдает java: incompatible types, что не является Exception
    }


    public boolean compare(Box <?> x){
        return (this.getW() == x.getW());

    }


}
