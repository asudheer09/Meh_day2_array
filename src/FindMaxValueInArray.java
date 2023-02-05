public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] numbers={11,2,31,14,156,687 };
        int max= numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){  //31>11
                max=numbers[i]; // max=31
            }
        }

        // i=1  1<5  numbers[1]>11 ---> 2>11 --->false
        // i=2  2<5  numbers[2]>11 ----> 31>11 --->true  max=numbers[2]=31
        // i=3  3<5  numbers[3]>31 ---> 14 >31 -->false
        // i=4  4<5  numbers[4]>31 ---> 156> 31 --->true  max=numbers[4]=156
        // i=5  5<5

        System.out.println("max value in the array is "+max);
    }
}
