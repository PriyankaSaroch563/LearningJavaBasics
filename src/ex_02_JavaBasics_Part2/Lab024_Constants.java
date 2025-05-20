package ex_02_JavaBasics_Part2;

public class Lab024_Constants {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);

        final int b =99;
    // b=11; java: cannot assign a value to final variable b
        System.out.println(b);
        //Also b=b=1;  will also not work
        // we can create any no. of final variable but cannot duplicate the one that is already
        //- Value of the **final variable can not** be changed.
        //- Value of the **variable can be changed** any number of times during program execution.
        final float PI = 3.14f;
        final float PI2 = 3.14f;
        final float PI3 = 3.14f;
        final float PI4 = 3.14f;
    }
}
