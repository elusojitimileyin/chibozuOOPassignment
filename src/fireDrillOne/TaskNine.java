package fireDrillOne;

public class TaskNine {
    public static void main(String[] args) {
        int sum =0;
        int square = 0;
        for (int count = 1; count <= 10; count++) {
            if (count % 4 == 0) {
                int multiple =1;
                int multiple2 =0;
                for (int count2 = 1; count2 <= 5; count2++) {
                    multiple = multiple * count;
                    multiple2 += multiple;


                }
                sum += multiple2;
                square = sum* sum;
                System.out.println(square );
            }
        }
    }
}
