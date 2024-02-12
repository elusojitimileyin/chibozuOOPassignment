package fireDrillTwo;

public class TaskTen {
    public static void main(String[] args) {


        int sum = 1;
        int average =1;
        for (int numbers = 1; numbers<=10;numbers++){
            sum +=numbers;
            average =sum/numbers;
        }System.out.println(sum);
        System.out.println(average);
    }
}
