package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {
            if (count % 4 == 0) {
                int multiple =1;
                int multiple2 =0;
                for (int count2 = 1; count2 <= 5; count2++) {
                    multiple = multiple * count;
                     multiple2 += multiple;



                }
                System.out.println(multiple2);

            }
        }
    }
}


