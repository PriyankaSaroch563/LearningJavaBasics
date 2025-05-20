package ex_02_JavaBasics_Part2;

public class Lab026_MultipleVariables {
    public static void main(String[] args) {
        int a=10, b= 20, c = 30, R;
        float f = 20.78F, G= 3.567F, t;
        System.out.printf("A= %d, B= %d",a,b);
        System.out.printf("\nf=%f,G=%f",f,G);
        R = a+b;
        t = f+G;

        System.out.println("\nValue of Int Sum = "+ R );
        System.out.println("Value of Float Sum =  "+ t);
    }
}
