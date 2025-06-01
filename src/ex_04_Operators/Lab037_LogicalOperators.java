package ex_04_Operators;

public class Lab037_LogicalOperators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a); //-> what is reverse of a that is false

        boolean b = true;
        System.out.println(!!b); // --> true , even odds cancel each others

        boolean c = true || false;
        System.out.println(c);
    }
}
