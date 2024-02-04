package Day9.Challenge1;

public class Array {
    public static void main(String[] args) {
        int[] tab = {1, 2, 7, 4, 5, 0, 0, 9};

//Affichage tableau
        System.out.print("Affichage Tableau: ");
        for (int element : tab) {
            System.out.print(element + " ");
        }
        int max = Max(tab);
        int min = Min(tab);
        int sum = Sum(tab);

        System.out.println("\n Affichage Max: " + max);
        System.out.println(" Affichage Max: " + min);
        System.out.println(" Affichage Sum: " + sum);
        System.out.println(" length: " + tab.length);
        System.out.print("Affichage Tableau inverse: ");
        Reverse(tab);

    }

        //find max
   static int Max (int[] Array ) {
        int max = Array[0];
        for (int element : Array) {

            if (element > max) max = element;
        }
        return max;
        }
        //find min
     static int Min(int[] array){
        int min = array[0];
        for (int element : array) {

            if (element<min) min = element;
        }


return min;

     }

    static int Sum(int[] array){
        int sum = 0;
        for (int element : array) {

             sum+=element;
        }
        return sum;

    }
    static void  Reverse(int[] array){
        int lenght = array.length;
        int[] tab2 = new int[lenght] ;

        for (int element : array) {

tab2[--lenght]= element;

        }
        System.out.print("Affichage Tableau inverse: ");
        for (int element : tab2) {
            System.out.print(element + " ");
        }

    }




}
