import java.util.Scanner;

public class CeaserCipher {
    char[] letters = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    String choice;
    String direction;
    String text;
    int shift;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you wanna encrypt or decrypt your message?");
        String choice = sc.nextLine();
        String lowerChoice = choice.toLowerCase();

        if (lowerChoice == "encrypt") {
            System.out.println("What direction do you wanna encrypt your text in? (left or right)");
            String direction = sc.nextLine().toLowerCase();

            System.out.println("Enter the text you wanna encrypt");
            String text = sc.nextLine();

            System.out.println("Enter the Shift amount");
            int shift = sc.nextInt();

        } else if (lowerChoice == "decrypt") {
            System.out.println("What direction do you wanna decrypt your text in (must be the same that you used while encryypting)");
            String direction = sc.nextLine().toLowerCase();

            System.out.println("Enter the text you want to encrypt");
            String text = sc.nextLine();

            System.out.println("Enter the Shift amount");
            int shift = sc.nextInt();
        }

        static String ceaser(String lowerChoice, String direction, String text, int shift) {

        }
    }
}
