import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su nombre de usuario");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese su contrasenya");
        String contrasenya = scanner.nextLine();




        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.


        //Imprimir el siguiente resultado:
        System.out.println( "\nHola" + nombre + ""  + apellido + ", tu nombre de usuario es " + usuario + "y tu contraseña es " + contrasenya + ", gracias por registrarte.");


    }
}