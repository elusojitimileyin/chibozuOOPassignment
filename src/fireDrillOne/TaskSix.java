package fireDrillOne;

public class TaskSix {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count % 4 == 0) {
                int multiple =1;
                for (int count2 = 1; count2 <=5; count2++) {
                     multiple = multiple * count;
                    System.out.println(multiple);


                }
            }
        }
    }
}
