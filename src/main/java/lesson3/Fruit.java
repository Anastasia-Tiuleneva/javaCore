package lesson3;

public  class Fruit {

    public Fruit(int count, double weight) {
        this.count = count;
        this.weight = weight;
    }

    private int count;

    private double weight;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "count=" + count +
                ", weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
