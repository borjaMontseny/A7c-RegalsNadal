
public class Llibre extends Regal {

	// PROPIEDADES
	String titol;
	String autor;
	int numeroPagines;
	double llarg;
	double ample;
	int paginaActual = 0;

	// CONSTRUCTORES
	public Llibre(String titol, String autor, int numeroPagines, double llarg, double ample, int paginaActual) {
		super();
		this.titol = titol;
		this.autor = autor;
		this.numeroPagines = numeroPagines;
		this.llarg = llarg;
		this.ample = ample;
		this.paginaActual = paginaActual;
	}

	// MÉTODOS
	void setMarcador(int pagina) {

		if (pagina > numeroPagines) {
			System.out.println("El llibre " + titol + " no té pàgina número " + pagina);
		} else {
			this.paginaActual = pagina;
		}
	}

	int paginesRestants() {
		return numeroPagines - paginaActual;
	}

	public String getTitol() {
		return titol;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroPagines() {
		return numeroPagines;
	}

	public double getLlarg() {
		return llarg;
	}

	public double getAmple() {
		return ample;
	}

	public void setAmple(double ample) {
		this.ample = ample;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

}