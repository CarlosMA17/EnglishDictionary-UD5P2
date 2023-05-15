import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("bienvenido al programa, elija una de las opciones");
        System.out.println("1.- Añadir una palabra:" +
                "\n2.- Eliminar una palabra:" +
                "\n3.- Existe palabra:" +
                "\n4.- Mostrar iniciales disponibles:" +
                "\n5.- Ver palabras por la inicial:" +
                "\n6.- Cerrar el programa:");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                String[] words = {"hola q tal", "hola"};
                Words word = new Words(words);
                word.aviableInitialLetter("hola");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
}
