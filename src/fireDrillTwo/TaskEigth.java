package fireDrillTwo;

public class TaskEigth {
    public static void main(String[] args) {


        int sum = 0;

        for (int count = 0; count <= 100; count++) {
            for (int numbers = count; numbers<10;numbers++){
                sum +=numbers;
                System.out.println(sum);
            }
}
        System.out.println(sum);
    }
}
