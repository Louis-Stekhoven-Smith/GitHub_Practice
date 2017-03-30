public class Main {

    public static void main(String[] args) {
        sayHello();
    }

     /*change this to hello universe */
    private static void sayHello(){
        String newString;

        System.out.println("Hello universe!");
        newString = bugyMethod("Awesome");
        System.out.println(newString);
    }

    public static String bugyMethod(String input){
        return input + " Sauce";

    }
}
