package DAY1.H5;

public class HW5 {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please provide a number as argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        System.out.println("Given num is " + num);

        if(num % 2 == 0){
            System.out.println("Given num is a EVEN number");
        } else {
            System.out.println("Given num is an ODD number");
        }
    }
}
