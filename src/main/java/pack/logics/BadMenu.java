package pack.logics;

public class BadMenu {


    public static void Badder1( Integer NeVerno) {
            if (NeVerno == 1){
            System.out.println("\t\t\t ____________");
            forest();
            forest();
            forest();
        }
            if (NeVerno == 2){
            System.out.println("\t\t\t ____________");
            System.out.println("\t\t\t\t|\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
            forest();
        }
            if (NeVerno == 3){
            System.out.println("\t\t\t ____________");
            forest2();
            forest();
            forest();;
        }
            if (NeVerno == 4){
            System.out.println("\t\t\t ____________");
            forest2();
            System.out.println("\t\t\t\t|\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
        }
            if (NeVerno == 5){
            System.out.println("\t\t\t ____________");
            forest2();
            System.out.println("\t\t\t   /|\\\t\t|");
            System.out.println("\t\t\t\t\t\t|");
            forest();
        }
            if (NeVerno == 6){
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
