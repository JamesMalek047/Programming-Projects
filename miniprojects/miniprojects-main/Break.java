import java.util.Scanner;
/**
 * Exactement même application que While.java mais la différence est avec l'exécution du loop while. Nous utilisons true pour remplacer !...equals.IgnoreCase("");. C'est une façon beaucoup plus simple à manipuler While loop/ 
 * @author James Malek
 * @version 19 avril 2022
 */

public class Break
{
    public static void main( String[] args ) 
    {
        Scanner keyboard = new Scanner( System.in );
        String currentAnswer = "";
        String exitWord="out";
        String collector = "";

        System.out.println("Inscrit ici ce que vous voulez (si vous voulez arrêter, pitoner '" + exitWord + "'') ");  
        currentAnswer=keyboard.nextLine(); 
        collector += currentAnswer;

        while (true)
        { 
            System.out.print("Quelque chose d'autre: ");
            currentAnswer=keyboard.nextLine();
            collector += currentAnswer + " ";
            if (currentAnswer.equalsIgnoreCase(exitWord))
            break;
        }
        
        System.out.println("\nVoici l'intégalité de vos réponses: " + collector);
        System.out.println("\nBonne journée!");

    }   
} 