package ex_03_Literals;

public class Lab029_Char_Literals {
    public static void main(String[] args) {
        char c1 ='A';// A-Z, a-z , all special symbols - !@#$%^&*()

        char c2 ='B';
        char c3 ='*';
        char c4 ='?';
        char c5 ='9';
        char c6 =' ';// blank space

        //escape characters
        char new_line ='\n'; // Used most often
        char tab_line ='\t'; // Used most often
        char backSpace ='\b'; // USed rarely
        char carriage_return ='\r'; // USed rarely -- never use in automation

        System.out.println("Priyanka Saroch");
        System.out.println("Priya "+new_line+" Saroch");
        System.out.println("Priyanka "+tab_line+" Swami");
        System.out.println("Priyanka "+backSpace+" Sharma");
        System.out.println("Priyanka is  "+carriage_return+" _Saroch");

        // characters are part of integral , according to the standard of ASCII
        // char c ='A';  ASCII char of A is 65
    }
}
