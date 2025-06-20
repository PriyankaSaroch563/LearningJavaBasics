package ex_04_Operators;

public class Lab51_Interview_Tell_Bites_Bytes_of_Char {
    public static void main(String[] args) {
        long a = 10l; // how many bites  bytes and bits it will take

        // Size of long in bits
        int bits = Long.SIZE;

        // Size of long in Bytes
        int bytes = Long.BYTES;

        System.out.println("Value of A :- "+a);
        System.out.println("Value A Long Var in Bites :- "+bits);
        System.out.println("Value A Long Var in Bytes :- "+bytes);


    }
}
