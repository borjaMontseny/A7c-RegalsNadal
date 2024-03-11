
public class Perfum {
	String nom;
	String marca;
	double mililitres;
	double altura;
	String olor;
	double mililitresRestants = mililitres;

	void perfumar() {
		this.mililitresRestants -= 0.1;
	}
}