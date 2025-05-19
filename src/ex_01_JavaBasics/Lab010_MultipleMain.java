package ex_01_JavaBasics;

public class Lab010_MultipleMain {
    public static void main(String[] args) {
        System.out.println("Java only recognises the first main method.");

    }
    public static void main(int args) {
        System.out.println("this is not recognised by JVM");

    }
    public static void main(String args) {
        System.out.println("this is called as MAin method overloading but not recognized");

    }
    /*
     * > There can be multiple main methods, but only one main method with JVM Recognize.
     *
     * You can have multiple main functions, but only one function of main which is recognized by
     * JVM should be present.
     * The concept of multiple main function in the program is called as main method overloading.
     * > Functions == Methods(class) in Java
     *
     * #### Can we run a program without a main method?
     * 1. Java < 7 - Yes ( if yes static block)
     * 2. 8 to 21 JDK - it was not possible
     * 3. 21-> there is way.  (static)

     */

}
