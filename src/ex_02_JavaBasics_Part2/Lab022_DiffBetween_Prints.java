package ex_02_JavaBasics_Part2;

public class Lab022_DiffBetween_Prints {
    public static void main(String[] args) {

        /*
         *println -> it will adda extra line in the end
         * print -> it will not add the line
         * printf -> Printf basically adds formatting to the output.
         */
        int a =10;
        System.out.println(a);

        System.out.print("Your variable is"+a);// after this will print no space will be added

        System.out.printf("**Your variable is %d",a); // %d will print the int vale of a

    }
}
