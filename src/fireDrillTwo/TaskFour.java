package fireDrillTwo;

public class TaskFour {
    public static void main(String[] args) {


        int even = 0;
        for (int count = 2; count <= 10; count++) {
            if (count%2 ==0) {
                even += count;


            }
        }System.out.println(even);
    }
}

