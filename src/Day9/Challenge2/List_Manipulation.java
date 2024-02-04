package Day9.Challenge2;

import java.util.ArrayList;
import java.util.List;

public class List_Manipulation {
    public static void main(String[] args) {
    ArrayList<String> maliste = new ArrayList<>()  ;
   maliste.add("Lundi");
    maliste.add("Mardi");
     maliste.add("Mercredi");
        maliste.add("Jeudi");
        maliste.add("Vendredi");
        maliste.add("Samedi");

        //Affichage de la liste
        System.out.println(maliste);
 // supprimer Jeudi
 maliste.remove("Jeudi");
        System.out.println(maliste);
// Chercher Samedi
if (maliste.contains("Samedi")){  System.out.println("Samedi exist"); }
else {System.out.println("Samedi n\'exist pas"); }
    }}
