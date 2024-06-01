package Javascript;

public class MinMaxDiffer {
    public int[] differ(int[] array){

        int largest = array[0];
        int lowest = array[0];

        for (int num : array) {
            if (num < lowest) {
                lowest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }return new int[]{largest - lowest};
    }
}



