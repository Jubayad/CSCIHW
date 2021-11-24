package HW1;
//import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    
    {
        //Scanner scanner = new Scanner(System.in);
    

        System.out.println("Start of Main");

        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        //Object name (name for object) = new Object name
        Pyramid.Output();

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs a = new Adlibs();
        String answer = a.story("Jubayad", 18, "red");
        System.out.println(answer);

        //input
        // System.out.println("Type in your name");
        // name = scanner.nextLine();
        // System.out.println("Type in your age");
        // age = scanner.nextInt();
        // System.out.println("Type in your favorite color");
        // color = scanner.next();
        // //output
        // System.out.println("Hello! My name is " + name + " and I am " + age + " and my favorite color is " + color + ".");


        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Replace b = new Replace();
        System.out.println(b.charReplace("Minecraft", 4, 's'));


    }

}
