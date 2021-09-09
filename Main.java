import java.awt.EventQueue;
import java.util.Scanner;

import com.darkprograms.speech.translator.GoogleTranslate;

public class Main {
    void run() {
        System.out.println(">>WELCOME TO CLI TRANSLATOR PROGRAM");

        Scanner sc = new Scanner(System.in);
        String input = null;
        System.out.println("Enter input:\t>>");
        input = sc.nextLine();
        System.out.println("Select Language");
        System.out.println("1.Hindi");
        System.out.println("2.Telugu");
        System.out.println("3.Tamil");
        System.out.println("4.German");
        System.out.println("5.bangali");
        System.out.println("6.Chinese");
        System.out.println("7.JAPANESE");
        System.out.println("8.Marati");
        int select = sc.nextInt();
        String[] split = input.split("\\s");
        try {
            switch (select) {
                case 1:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("en", "hi", animal));
                    }
                    break;
                case 2:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "te", animal));
                    }
                    break;
                case 3:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "ta", animal));
                    }
                    break;
                case 4:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "Ge", animal));
                    }
                    break;
                case 5:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "ba", animal));
                    }
                    break;
                case 6:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "ch", animal));
                    }
                    break;
                case 7:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "", animal));
                    }
                    break;
                case 8:
                    for (String animal : split) {
                        System.out.println(GoogleTranslate.translate("hi", "marati", animal));
                    }
                    break;
                default:
                    System.out.println("try again wrong input");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
