public class Result {
    public static void main(String[] args){
        int a , b;
        a=10;
        b=20;
        System.out.println(a+"   " + b);

        int temp;
        temp =a ;
        a = b ;
        b =temp;
        System.out.println(a+"   " + b);

        a = a + b;
        b =  a - b;
        a = a - b;

        System.out.println(a+"   " + b);
    }
}
