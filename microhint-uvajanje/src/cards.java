/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 7.9.2013
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        String deck;

        GraphicsDemo demo= new GraphicsDemo();

        System.out.println("Welcome to the card shuffler \n Please type: 1 for tarot deck | 2 for gypsy deck");

        Scanner reader = new Scanner(System.in);
        int selectedcards=reader.nextInt();


            if(selectedcards==1)
            {
                deck="tarot";
                System.out.println("Tarot deck");
            }
            else if (selectedcards==2)
            {
                deck="Gypsy";
                System.out.println("Gypsy deck");
            }
            else
            {
                System.out.println("Deck you entered does not exists");
            }
    }
}
