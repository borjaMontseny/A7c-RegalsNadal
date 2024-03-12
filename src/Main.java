import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Empaquetador
		Empaquetador empaquetador = new Empaquetador();

		// Llibres
		Llibre llibre1 = new Llibre("El Quijote", "Miguel de Cervantes", 500, 15.0, 10.0, 1);
		Llibre llibre2 = new Llibre("Cien años de soledad", "Gabriel García Márquez", 400, 12.0, 8.0, 1);

		// Perfums
		Perfum perfum1 = new Perfum("Perfume Chanel No. 5", "Chanel", 50.0, 10.0, "Floral", 50.0);
		Perfum perfum2 = new Perfum("Perfume Acqua di Gio", "Giorgio Armani", 30.0, 8.0, "Cítrico", 30.0);

		// Sabates
		Sabates nike = new Sabates("Nike", "Air Max", 42, 28.0, 10.0);
		Sabates adidas = new Sabates("Adidas", "Superstar", 41, 27.5, 9.5);

		// ArrayList de Regals
		ArrayList<Regal> llistaRegals = new ArrayList<>();
		llistaRegals.add(llibre1);
		llistaRegals.add(llibre2);
		llistaRegals.add(perfum1);
		llistaRegals.add(perfum2);
		llistaRegals.add(nike);
		llistaRegals.add(adidas);

		double totalM2Paper = 0;

		for (Regal regal : llistaRegals) {
			totalM2Paper += empaquetador.calcularMetresPaperRegal(regal);
		}

		System.out.println("Et faràn falta " + String.format("%.2f", totalM2Paper) + " m2 de paper per embolicar tots els regals");

	}

}
