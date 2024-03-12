
public class Perfum extends Regal {
	
	// PROPIEDADES
	String nom;
	String marca;
	double mililitres;
	double altura;
	String olor;
	double mililitresRestants = mililitres;
	
	// CONSTRUCTORES
	public Perfum(String nom, String marca, double mililitres, double altura, String olor, double mililitresRestants) {
		super();
		this.nom = nom;
		this.marca = marca;
		this.mililitres = mililitres;
		this.altura = altura;
		this.olor = olor;
		this.mililitresRestants = mililitresRestants;
	}
	
	// MÉTODOS
	void perfumar() {
		this.mililitresRestants -= 0.1;
	}
	
	public double calcularAreaPaper() {
	    double amplada = Math.pow(mililitres / altura, 1 / 3);
	    double llargada = altura + 2 * 0.1; // 0.1 és el gruix del paper
	    double areaLateral = 2 * altura * (amplada + amplada);
	    double areaBaseTapa = amplada * llargada;
	    double areaTotal = areaLateral + 2 * areaBaseTapa;
	    return areaTotal / 10000; // Convertir a metres quadrats
	}

	public String getNom() {
		return nom;
	}

	public String getMarca() {
		return marca;
	}

	public double getMililitres() {
		return mililitres;
	}

	public double getAltura() {
		return altura;
	}

	public String getOlor() {
		return olor;
	}

	public double getMililitresRestants() {
		return mililitresRestants;
	}


}