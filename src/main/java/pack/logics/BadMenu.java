package pack.logics;

public class BadMenu {


    public static void badMenu(Integer wrongAnswer) {
            if (wrongAnswer == 1){
            System.out.println("\t\t\t ____________");
            forest();
            forest();
            forest();
        }
            if (wrongAnswer == 2){
            System.out.println("\t\t\t ____________");
            System.out.println("\t\t\t\t|\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
            forest();
        }
            if (wrongAnswer == 3){
            System.out.println("\t\t\t ____________");
            forest2();
            forest();
            forest();;
        }
            if (wrongAnswer == 4){
            System.out.println("\t\t\t ____________");
            forest2();
            System.out.println("\t\t\t\t|\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
        }
            if (wrongAnswer == 5){
            System.out.println("\t\t\t ____________");
            forest2();
            System.out.println("\t\t\t   /|\\\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
        }
            if (wrongAnswer == 6){
            System.out.println("\t\t\t ____________");
            forest2();
            System.out.println("\t\t\t   /|\\\t\t|");
            System.out.println("\t\t\t   / \\\t\t|");
            forest();
        }
    }
        private static void forest(){
            System.out.println("\t\t\t\t\t\t|");
            System.out.println("\t\t\t\t\t\t|");
        }
        private static void forest2(){
            System.out.println("\t\t\t\t|\t\t|");
            System.out.println("\t\t\t\tO\t\t|");
        }
}
