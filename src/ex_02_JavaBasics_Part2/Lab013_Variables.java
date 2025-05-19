package ex_02_JavaBasics_Part2;

public class Lab013_Variables {
    public static void main(String[] args) {

        /* To create a variable you need
        *  data_type variable_name =  variable_value
        */
        byte age = 65;
        // byte-> date type - type of container
        // age -> variable Name | identifier
        // = -> Assignment operator ?
        // 65 -> Variable Value | Literal
        // Maximum long human life span was 22 years old , hence age is within the range if Byte
        // Range of byte is --->>>***(-128 to 127 ) ***
        // if short is used then memory will be wasted
        age=66;
        System.out.println(age);
    }
}
