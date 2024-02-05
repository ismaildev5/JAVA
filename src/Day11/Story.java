package Day11;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.PrintWriter;

// Classe représentant l'histoire
class Story implements Serializable {
    private ArrayList<String> sentences = new ArrayList<>();
    private ArrayList<String> authors = new ArrayList<>();

    // Méthode pour ajouter une phrase à l'histoire
    public void addSentence(String sentence, String author) {
        sentences.add(sentence);
        authors.add(author);
    }

    // Méthode pour afficher l'histoire actuelle
    public void displayStory() {
        System.out.println("\nCurrent Story:");
        for (int i = 0; i < sentences.size(); i++) {
            System.out.println(authors.get(i) + ": " + sentences.get(i));
        }
        System.out.println();
    }

    // Méthode pour sauvegarder les phrases dans un fichier texte
    public void saveSentencesToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("story.txt"))) {
            for (int i = 0; i < sentences.size(); i++) {
                writer.println(authors.get(i) + ": " + sentences.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour sauvegarder l'histoire dans un fichier (utilise FileHandler)
    public void saveToFile() {
        FileHandler.serializeStory(this);
    }
}
