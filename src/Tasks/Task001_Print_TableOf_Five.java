package Tasks;

import java.io.PrintStream;

public class Task001_Print_TableOf_Five {
    /*Table of 5 using %d (only use the printf)
     5x1=1
     5x2=10
     ......
     5x10=50
    */
    public static void main(String[] args) {

        int num=5;
        System.out.printf("%d x %d = %d%n ",num,1,num);
        System.out.printf("%d x %d = %d%n ",num,2,num*2);
        System.out.printf("%d x %d = %d%n ",num,3,num*3);
        System.out.printf("%d x %d = %d%n ",num,4,num*4);
        System.out.printf("%d x %d = %d%n ",num,5,num*5);
        System.out.printf("%d x %d = %d%n ",num,6,num*7);
        System.out.printf("%d x %d = %d%n ",num,8,num*8);
        System.out.printf("%d x %d = %d%n ",num,9,num*9);
        System.out.printf("%d x %d = %d%n ",num,10,num*10);

    }
}
