package DAY1.H7;

public class HW7 {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please provide two characters as arguments.");
            return;
        }

        char ch1 = args[0].charAt(0);
        char ch2 = args[1].charAt(0);

        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }
    }
}

