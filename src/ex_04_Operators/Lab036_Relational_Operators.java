package ex_04_Operators;

public class Lab036_Relational_Operators {
    public static void main(String[] args) {
        //< Less than
        // <=   ->> Less than equal to
        // > Greater than
        // >=  ->> Greater than equal to
        // == --> Equal to (but checking)
        // !=   ->> Not equal to

        // All of them will result in boolean output

        int a = 10;
        int b = 20;
        boolean c = a>b;  // 10 > 20  -- > false
        System.out.println(c);


        int mamts_age = 39;
        int My_Age = 34;
        boolean result = mamts_age>= My_Age;
        System.out.println(result);



    }
}
