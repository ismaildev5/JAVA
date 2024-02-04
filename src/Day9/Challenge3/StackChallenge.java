package Day9.Challenge3;
import java.util.*;
public class StackChallenge {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Lundi");
        stack.push("Mardi");
        stack.push("Mercredi");
        stack.push("Jeudi");
//affichage
        System.out.println("Stack elements: ");
        for(String str: stack){
            System.out.println(str);
        }

stack.pop();

//affichage apres suppression du top
        System.out.println("------------------------------------------");
        System.out.println("Stack elements: ");
        for(String str: stack) {
            System.out.println(str);
        }
        System.out.println("------------------------------------------");
        System.out.println("Afficher top element: ");
        System.out.println(stack.peek());

        System.out.println("------------------------------------------");
        System.out.println("Verifier si la stac est vide: ");
       if (stack.empty())  System.out.println("La stack est vide ");
        else  System.out.println("La stack n est pas vide ");

    }
}
