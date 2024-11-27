import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");
        String nombre = scanner.nextLine();

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("Hola "  + nombre + "Soy un Bot. ¿De qué ciudad eres?");



        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        String location = scanner.nextLine();
        System.out.println("He escuchado que "  + location + " es un encanto. Yo nací en Oracle city.");

        System.out.println("\n¿Cuántos años tienes?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        int edad = (4);
        int numero1 = 2;

        int result = numero1 / edad;
        System.out.println("Entonces me dices que tienes " + ((double)edad / numero1) + " años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + result + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        //Añade una nueva línea.


        String language = scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println( language + " ,  ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");


        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

    }
}
