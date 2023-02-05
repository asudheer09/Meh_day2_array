public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] numbers={11,2,31,14,156,68,1 };
        int min= numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min){  //31>11
                min=numbers[i]; // max=31
            }
        }

        System.out.println("the min value in the array is "+min);
    }
}
