import java.util.Scanner;
/**
 * Ce projet s'agit de demander des questions à l'utilisateur et le traiter pour retourner un énoncé. 
 * @author James Malek
 * @version 19 avril 2022
 */

public class Question
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in); 
        String answer, answer2, answer3;

        System.out.println("Est-ce que tu te rappelles de la parabole?");
        System.out.println("A: Oui");
        System.out.println("B: Non");
        answer=keyboard.next();

        if (answer.equalsIgnoreCase("A")|| answer.equalsIgnoreCase("oui"))
        {
            System.out.println("\nOkay, maintenant résous ce problème.");

            System.out.println("\nTrouve la/les abcisses à l'origine de l'équation");
            System.out.println("\ny=(x-35)^2-80\n");

            System.out.println("A: 26,56");
            System.out.println("B: 43,95");
            System.out.println("C: -26.56");
            System.out.println("D: -43.95");
            System.out.println("E: impossible");
            System.out.println("F: A et D");
            System.out.println("G: A et B\n");
            answer2=keyboard.next();

         while (true){
            if (answer2.equalsIgnoreCase("G"))
            {
                System.out.println("\nBRAVO!");
                break;
            }
            
            if (answer2.equalsIgnoreCase("A")|| answer2.equalsIgnoreCase("B"))
            {
                System.out.println("Presque");
                answer2=keyboard.next();
            }

            if (answer2.equalsIgnoreCase("C") || answer2.equalsIgnoreCase("D"))
            {
                System.out.println("Devrait être positif");
                answer2=keyboard.next();
            }

            if (answer2.equalsIgnoreCase("E") || answer2.equalsIgnoreCase("F"))
            {
                System.out.println("Refais la question");
                answer2=keyboard.next();
            }
        }
    }
     
        else if (answer.equalsIgnoreCase("B")|| answer.equalsIgnoreCase("non"))
        {
            System.out.println("Retour à ta dixième année.");
        }
        
        else 
        {
            System.out.println("Relis les réponses");
        }
    
        System.out.println("\nMaintenant, aimes-tu les mathématiques?");
        System.out.println("A: Beaucoup");
        System.out.println("B: Oui, j'aime les maths.");
        System.out.println("C: Neutre.");
        System.out.println("D: Non, je n'aime pas les maths.");
        System.out.println("E: Je déteste les maths.");
        answer3=keyboard.next();

        if (answer3.equalsIgnoreCase("A"))
        {
            System.out.println("C'est superbe. Je suis aussi passioné des maths.");   
        }
        
        else if (answer3.equalsIgnoreCase("B"))
        {
            System.out.println("C'est bien.");
        }
    
        else if (answer3.equalsIgnoreCase("C"))
        {
            System.out.println("Dommage.");
        }

        else if (answer3.equalsIgnoreCase("D"))
        {
            System.out.println("Pourquoi pas?");
        }

        else if (answer3.equalsIgnoreCase("E"))
        {
            System.out.println("Ne me parle plus. ");
        }
  
        else
        {
            System.out.println("Relis les réponses");
        }
    }
}   