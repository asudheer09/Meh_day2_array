public class SumOfTheArray {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }

        // i=0   0<4 -->true  sum= 0+numbers[0]=0+1=1
        // i=1   1<4 --> true sum= 1+numbers[1]=1+2=3
        // i=2   2<4 --> true sum= 3+numbers[2]=3+3=6
        // i=3   3<4 -->true  sum= 6+numbers[3]=6+4=10
        // i=4   4<4 ---> false ---> exit from for loop
        System.out.println("sum of the numbers in the array is "+sum);
    }
}
