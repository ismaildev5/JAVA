package Day11;
import java.util.Scanner;

// Classe principale pour l'interaction utilisateur
public class CollaborativeStoryteller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Story story = new Story();

        // Interaction avec l'utilisateur pour ajouter des phrases à l'histoire
        while (true) {
            System.out.print("Enter your sentence (type 'exit' to finish): ");
            String sentence = scanner.nextLine();

            if ("exit".equalsIgnoreCase(sentence.trim())) {
                break;
            }

            System.out.print("Enter your name: ");
            String author = scanner.nextLine();

            // Ajout de la nouvelle phrase à l'histoire et affichage
            story.addSentence(sentence, author);
            FileHandler.saveToFile(story);  // Sauvegarde dans un fichier après chaque ajout
            story.displayStory();  // Affiche l'histoire mise à jour
        }

        // Exemple de sérialisation et désérialisation
        Story deserializedStory = FileHandler.deserializeStory();
        deserializedStory.displayStory();
    }
}
