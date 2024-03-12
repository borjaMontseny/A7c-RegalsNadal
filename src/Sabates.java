
public class Sabates extends Regal {

	// PROPIEDADES
	private String marca;
	private String model;
	private int talla;
	private double llargada;
	private double amplada;

	// CONSTRUCTORES
	public Sabates(String marca, String model, int talla, double llargada, double amplada) {
		super();
		this.marca = marca;
		this.model = model;
		this.talla = talla;
		this.llargada = llargada;
		this.amplada = amplada;
	}

	// MÉTODOS
	void probarTalla(int tallaPeus) {
		if (talla != tallaPeus) {
			System.out.println("Aquestes sabates no et van bé.");
		} else {
			System.out.println("Aquestes sabates et van bé.");
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public int getTalla() {
		return talla;
	}

	public double getLlargada() {
		return llargada;
	}

	public double getAmplada() {
		return amplada;
	}

}
