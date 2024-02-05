package Day11;
import java.io.*;
import java.util.ArrayList;

// Classe pour gérer l'entrée/sortie de fichiers
class FileHandler {
    // Méthode pour sauvegarder l'histoire dans un fichier texte
    public static void saveToFile(Story story) {
        story.saveSentencesToFile();
        story.saveToFile();
    }

    // Méthode pour sérialiser l'histoire dans un fichier
    public static void serializeStory(Story story) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializedStory.ser"))) {
            oos.writeObject(story);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour désérialiser l'histoire depuis un fichier
    public static Story deserializeStory() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializedStory.ser"))) {
            return (Story) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
