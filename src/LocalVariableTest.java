public class LocalVariableTest {

    public LocalVariableTest(int a , int b){
        // here a, b are local varaibles
        System.out.println(a+b);
    }

    {
        int f=10;
        System.out.println(f);
    }

    public static void main(String[] args) {
        int d=10 ; // this is also local varaible
        System.out.println(d);

    }
    public static void helloTest(){
      //  System.out.println(d);
       // System.out.println(a+b);
       // System.out.println(f);
    }
}
