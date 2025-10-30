package DAY1.H8;

public class HW8 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide a character.");
            return;
        }

        char ch = args[0].charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}

