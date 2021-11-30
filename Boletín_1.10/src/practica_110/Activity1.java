package practica_110;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String nombre;
		String apellido;
		int edad;
		String calle;
		int numero;
		int codigo_postal;
		String provincia;
		String estudiante;
		boolean a = true;
		float altura;

		System.out.println("escribe aqui el nombre: ");
		nombre = keyboard.next();
		System.out.println(nombre);

		System.out.println("escribe aqui tu apellido: ");
		keyboard.nextLine();
		apellido = keyboard.nextLine();
		System.out.println(apellido);

		System.out.println("escribe aqui tu edad: ");
		edad = keyboard.nextInt();
		System.out.println(edad);

		System.out.println("escribe aqui tus datos de dirección: ");
		System.out.println("escribe tu calle: ");
		calle = keyboard.next();
		System.out.println("escribe el numero de tu hogar: ");
		numero = keyboard.nextInt();
		System.out.println("escribe tu codigo postal: ");
		codigo_postal = keyboard.nextInt();
		System.out.println("escribe tu provincia");
		provincia = keyboard.next();
		System.out.println("tu direccion es: " + calle + " " + numero + " " + codigo_postal + " " + provincia);
		keyboard.nextLine();

		System.out.println("Eres estudiante? (escribe true para si y false para no)");
		a = keyboard.nextBoolean();
		estudiante = a ? "eres estudiante " : "no eres estudiante ";
		System.out.println(estudiante);

		System.out.println("escribe tu estatura(usa coma para separar): ");
		altura = keyboard.nextFloat();
		System.out.println(altura);

	}

}
