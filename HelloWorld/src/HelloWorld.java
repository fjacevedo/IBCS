public class HelloWorld {
    public static void main(String[] args){
        String greeting = "Hello World from Java";
        System.out.println(greeting);
        System.out.println("greeting.toUpperCase() = " + greeting.toUpperCase());

        int number = 10;
        boolean isTrue = true;
        int number2 = 5;

        if(isTrue){
            number2 = 10;
            System.out.println("number = " + number2);
        }

        System.out.println("number2 = " + number2);

        var number3 = 15;

        String name;

        name = "Felipe";
    }
}
