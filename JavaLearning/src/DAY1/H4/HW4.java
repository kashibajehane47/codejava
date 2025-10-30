package DAY1.H4;

public class HW4 {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please provide a number as argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        System.out.println("Given num is " + num);

        if(num == 0){
            System.out.println("Given num is ZERO");
        } else if (num > 0){
            System.out.println("Given num is POSITIVE");
        } else {
            System.out.println("Given num is NEGATIVE");
        }
    }
}
