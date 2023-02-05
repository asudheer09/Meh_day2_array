public class SearchValueInTheArray {
    public static void main(String[] args) {
        int[] numbers={11,143,12,14,28,16};

        int input=21;

        for (int i = 0; i < numbers.length; i++) {
           if( numbers[i]==input){
               System.out.println("value is present");
           }
        }
    }
}
