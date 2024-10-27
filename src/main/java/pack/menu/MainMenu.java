package pack.menu;

import pack.game.Game;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static void Menu() throws IOException {

        System.out.println("Меню \n 1 - Войти в игру \n 2 - Правила \n 3 - Выход");
        Scanner o1 = new Scanner(System.in);
        int a1 = o1.nextInt();
        while (true) {
            if (a1 == 1) {

                Game game = new Game();
                game.GameRun();
                //убрать по завершении проекта, для возврата в главное меню
                System.exit(0);

            } else if (a1 == 2) {
                System.out.println("Виселица - игра, в которой вам нужно угадывать слово на тему африканских животных.");
                System.out.println("Ход игры:");
                System.out.println("1) Получаете количество букв в слове отмеченное звездочками");
                System.out.println("2) Угадываете слово по буквам");
                System.out.println("3) Если ошибётесь 6 раз - проиграете");

                Menu();

            } else if (a1 == 3) {
                System.out.println("Всего хорошего");
                System.exit(0);


            } else
                System.out.println("Нет такого пункта в меню");
                Menu();
        }

    }
}
