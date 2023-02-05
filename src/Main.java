public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s="hello world";
        //charAt(), toCharArray()
        int vowelCount=0;
        for (int i = 0; i < s.length(); i++) {
           char ch= s.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               vowelCount++;
           }

        }
        System.out.println("vowel count in the given String is "+vowelCount);

    }
}