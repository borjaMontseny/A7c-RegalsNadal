
public class Llibre {

	// PROPIEDADES
	String titol;
	String autor;
	int numeroPagines;
	double llarg;
	double ample;
	int paginaActual = 0;

	// MÉTODOS
	void setMarcador(int pagina) {
		this.paginaActual = pagina;
	}

	// CONSTRUCTORES
	int paginesRestants() {
		return numeroPagines - paginaActual;
	}

}