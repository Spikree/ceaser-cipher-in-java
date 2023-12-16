import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 'encode' to encrypt, type 'decode' to decrypt:");
        String direction = scanner.nextLine();
        System.out.println("Type your message:");
        String text = scanner.nextLine().toLowerCase();
        
        int shift;
        try {
            System.out.println("Type the shift number:");
            shift = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input for shift. Please enter an integer.");
            return;
        }

        scanner.nextLine();

        shift = shift % 26;

        if (direction.equals("encode")) {
            String cipherText = encrypt(text, alphabet, shift);
            System.out.println("The new encrypted message is " + cipherText);
        } else if (direction.equals("decode")) {
            String decryptedText = decrypt(text, alphabet, shift);
            System.out.println("The decrypted message is " + decryptedText);
        }

        System.out.println("Do you want to continue using the program? Type 'yes' or 'no': ");
        String userInput = scanner.next().toLowerCase();
        while (!userInput.equals("no")) {
            System.out.println("Type 'encode' to encrypt, type 'decode' to decrypt:");
            direction = scanner.next();
            scanner.nextLine(); 
            System.out.println("Type your message:");
            text = scanner.nextLine().toLowerCase();
            
            try {
                System.out.println("Type the shift number:");
                shift = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input for shift. Please enter an integer.");
                return;
            }

            scanner.nextLine(); 

            shift = shift % 26;

            if (direction.equals("encode")) {
                String cipherText = encrypt(text, alphabet, shift);
                System.out.println("The new encrypted message is " + cipherText);
            } else if (direction.equals("decode")) {
                String decryptedText = decrypt(text, alphabet, shift);
                System.out.println("The decrypted message is " + decryptedText);
            }

            System.out.println("Do you want to continue using the program? Type 'yes' or 'no': ");
            userInput = scanner.next().toLowerCase();
        }

        System.out.println("Goodbye!");
    }

    private static String encrypt(String plainText, char[] alphabet, int shiftAmount) {
        StringBuilder cipherText = new StringBuilder();
        for (char letter : plainText.toCharArray()) {
            if (Character.isLetter(letter)) {
                int position = new String(alphabet).indexOf(letter);
                int newPosition = (position + shiftAmount) % 26;
                char newLetter = alphabet[newPosition];
                cipherText.append(newLetter);
            } else {
                cipherText.append(letter);
            }
        }
        return cipherText.toString();
    }

    private static String decrypt(String cipherText, char[] alphabet, int shiftAmount) {
        StringBuilder decryptedText = new StringBuilder();
        for (char letter : cipherText.toCharArray()) {
            if (Character.isLetter(letter)) {
                int position = new String(alphabet).indexOf(letter);
                int newPosition = (position - shiftAmount + 26) % 26; 
                char newLetter = alphabet[newPosition];
                decryptedText.append(newLetter);
            } else {
                decryptedText.append(letter);
            }
        }
        return decryptedText.toString();
    }
}
