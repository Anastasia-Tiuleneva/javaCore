package lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {

        String[][] twoDimArray = {
                {"1","2","3","5"},
                {"6","5","4","3"},
                {"0","6","g","4"},
                {"8","3","1","8"}
        };
        String[][] c = new String[10][15];
        String[][] my= {
                {"8","2","3","5"},
                {"6","6","6","h"},
                {"0","6","g","4"},
                {"8","3","1","8"}
        };

        checkArrays(twoDimArray);
        checkArrays(c);
        checkArrays(my);



    }

    public static void checkArrays (String[][] x) throws MyArraySizeException {
        if(x.length != 4 || x[0].length != 4) {
            throw new MyArraySizeException ("Размер массива не равен 4х4");
        }
        int res = 0;
        for (int i = 0; i < x.length; i++ ){
            for (int j = 0; j < x[0].length; j++ ) {
                try {
                res += Integer.parseInt(x[i][j]);
            }
                catch (NumberFormatException e) {
                    throw new MyArraySizeException ("В массиве присутствуют неприводимые типы данных, к ошибке привела ячейка  " + i + j);
                }
        }
        System.out.println(res);
    }
    }




}
