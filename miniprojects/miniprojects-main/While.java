import java.util.Scanner;
/**
 * Cette application est un petit jeu où l'utilisateur inscrit infiniment (à cause du while loop) mais l'utilisateur va devenir ennuyé. Alors, comme ceci pour arrêter le tourment, il suffit d'inscrire le exitword qui est -99. 
 * @author James Malek
 * @version 19 avril 2022
 */

public class While
{
    public static void main( String[] args ) 
    {
        Scanner keyboard = new Scanner( System.in );
        String currentAnswer = "";
        String exitWord="out";
        String collector = "";

        System.out.println("Inscrit ici ce que vous voulez (si vous voulez arrêter, pitoner '" + exitWord + "') ");  
        currentAnswer=keyboard.nextLine(); 
        collector += currentAnswer;

        while (!currentAnswer.equalsIgnoreCase(exitWord))
        { 
            System.out.print("Quelque chose d'autre: ");
            currentAnswer=keyboard.nextLine();
            if (!currentAnswer.equalsIgnoreCase(exitWord))
            {
                collector += currentAnswer + " ";
            }
        }

        System.out.println("\nVoici l'intégalité de vos réponses: " + collector);
        System.out.println("\nBonne journée!");
        

    }   
}