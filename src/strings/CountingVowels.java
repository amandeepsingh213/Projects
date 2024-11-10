import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //char[] vowels = { 'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something and we'll count the number of vowels for you");
        String str = scanner.nextLine().toLowerCase();
        int total = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < vowels.length; i++) {
                if (str.charAt(j) == vowels[i] ) {
                    total ++;
                    break;
                }
            }

        }System.out.println("The number of vowels in the given statement is " + total);
    }
}