package pack.menu;

import pack.game.Game;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static void menu() throws IOException {

        System.out.println("Меню \n 1 - Войти в игру \n 2 - Правила \n 3 - Выход");
        Scanner menu = new Scanner(System.in);

        if ( menu.hasNextInt() ) {
            int menuInt = menu.nextInt();

            if (menuInt == 1) {
                Game game = new Game();
                game.gameRun();

            } else if (menuInt == 2) {
                System.out.println("Виселица - игра, в которой вам нужно угадывать слово на тему африканских животных.");
                System.out.println("Ход игры:");
                System.out.println("1) Получаете количество букв в слове отмеченное звездочками");
                System.out.println("2) Угадываете слово по буквам");
                System.out.println("3) Если ошибётесь 6 раз - проиграете");

                menu();

            } else if (menuInt == 3) {
                System.out.println("Всего хорошего");
                System.exit(0);
            } else
                System.out.println("Нет такого пункта в меню");
            menu();
        }
        menu();
    }
}
