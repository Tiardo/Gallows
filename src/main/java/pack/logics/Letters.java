package pack.logics;


import pack.menu.MainMenu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pack.logics.BadMenu.Badder1;

public class Letters {

    public void LettersM() throws IOException {

        // рандомное слово в name
        fileParser fp = new fileParser();
        String name = fp.readers();
        //подсказка для себя
        //System.out.println(name);

        Scanner keys = new Scanner(System.in);
        List<Character> playSay = new ArrayList<>();
        Stars(name,playSay);

        int NeVerno = 0;





        while (true) {

            Badder1(NeVerno);

            if (NeVerno >= 6) {
                System.out.println("Проигрыш");
                System.out.println("Слово было " + name);
                break;
            }

            //
            if (!Enterletters(keys,name,playSay)){
                NeVerno++;
                System.out.println("Нет такой буквы. \nОсталось " + (6 - NeVerno) + " попытки");
                }


            if (Stars(name,playSay)) {
                System.out.println("Победа");
                break;
            }

        }
        MainMenu.Menu();
    }


        private static boolean Enterletters(Scanner keys,String name, List<Character> playSay){

        System.out.println("Введите буковку");
        String letsKey = keys.nextLine();
        String toUpLetsKey = letsKey.toLowerCase();

        if (letsKey == ""){
            System.out.println("Буковку то введи");
        }else

            playSay.add(toUpLetsKey.charAt(0));
            return name.contains(letsKey);

    }


        // подсчет букв в слове и вывод ****
        private static boolean Stars(String name, List<Character> playSay ) {
            int Verno = 0;


            for (int i = 0; i < name.length(); i++) {

                if (playSay.contains(name.charAt(i))) {
                    System.out.print(name.charAt(i));
                    Verno++;
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
            return (name.length() == Verno);
        }
}
