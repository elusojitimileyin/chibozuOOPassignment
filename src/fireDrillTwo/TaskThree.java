package fireDrillTwo;

public class TaskThree {
    public static void main(String[] args) {

        int sum = 0;
        int average= 0;
        for (int count =1; count<= 10; count++){
            sum +=count;
            System.out.println(sum);

            average = sum/ count;
            System.out.println(average);
        }

    }

}
