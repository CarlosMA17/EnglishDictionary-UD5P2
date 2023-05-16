import Words.WordsClasificator.Words;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = {"hola q tal", "hola", "ola"};
        Words word = new Words(words);
        boolean exit = false;
        while (!exit) {
            System.out.println("bienvenido al programa, elija una de las opciones");
            System.out.println("1.- Añadir una palabra:" +
                    "\n2.- Eliminar una palabra:" +
                    "\n3.- Existe palabra:" +
                    "\n4.- Mostrar iniciales disponibles:" +
                    "\n5.- Ver palabras por la inicial:" +
                    "\n6.- Cerrar el programa:");
            Scanner scInt = new Scanner(System.in);
            int option = scInt.nextInt();
            Scanner scStr = new Scanner(System.in);

            switch (option) {
                case 1:
                    String newWord = scStr.nextLine();
                    word.addWord(newWord);
                    break;
                case 2:
                    String rmWord = scStr.nextLine();
                    word.removeWord(rmWord);
                    break;
                case 3:
                    String searchWord = scStr.nextLine();
                    word.searchWord(searchWord);
                    break;
                case 4:
                    String aviableWord = scStr.nextLine();
                    word.aviableInitialLetter(aviableWord);
                    break;
                case 5:
                    String sameInitial = scInt.nextLine();
                    word.sameInitialWords('h');
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}
