public class VowelCountInStringUsingArray {
    public static void main(String[] args) {
        String str="hello world";
       char[] chars= str.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u'){
                count++;
            }
        }

        System.out.println("vowels count is "+count);
    }
}
