package ex_02_JavaBasics_Part2;

public class Lab023_printF {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        System.out.printf("Your Variable is %d",a);
        //%d -> int,byte,long,short,- datatype, it replaces the value
        //%s-> string
        // %f -> float,double
        //%b-> boolean

        int b=20;
        System.out.printf("Value of A is %d , Value of B is %d",a,b);
        System.out.println();
        System.out.printf("a = %d ,  b = %d ",a,b);

    }
}
