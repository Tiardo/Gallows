package pack.logics;
import pack.menu.MainMenu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pack.logics.BadMenu.badMenu;

public class Letters {

    public void letters() throws IOException {

        FileParser fp = new FileParser();
        String name = fp.readers();

        Scanner keys = new Scanner(System.in);
        List<Character> playSay = new ArrayList<>();
        stars(name,playSay);

        int wrong = 0;

        while (true) {

            badMenu(wrong);
            if (wrong >= 6) {
                System.out.println("Проигрыш");
                System.out.println("Слово было " + name);
                break;
            }
            if (!enterletters(keys,name,playSay)){
                wrong++;
                System.out.println("Нет такой буквы. \nОсталось " + (6 - wrong) + " попытки");
                }
            if (stars(name,playSay)) {
                System.out.println("Победа");
                break;
            }
        }
        MainMenu.menu();
    }

        private static boolean enterletters(Scanner keys,String name, List<Character> playSay){

        System.out.println("Введите буковку");
        String letsKey = keys.nextLine();
        String toUpLetsKey = letsKey.toLowerCase();

        if (letsKey == ""){
            System.out.println("Буковку то введи");
        }else

            playSay.add(toUpLetsKey.charAt(0));
            return name.contains(letsKey);
    }

        private static boolean stars(String name, List<Character> playSay ) {
            int right = 0;
            for (int i = 0; i < name.length(); i++) {
                if (playSay.contains(name.charAt(i))) {
                    System.out.print(name.charAt(i));
                    right++;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            return (name.length() == right);
        }
}
