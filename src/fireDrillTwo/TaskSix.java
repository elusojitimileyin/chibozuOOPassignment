package fireDrillTwo;

public class TaskSix {
    public static void main(String[] args) {


        int even = 0;
        int average=0;
        for (int count = 1; count <= 10; count++) {
            if (count % 2 == 0 ) {
                even += count ;
                 average = even/count;

            }

        }   System.out.println(average);

    }

}
