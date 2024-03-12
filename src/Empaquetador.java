
public class Empaquetador {

	// PROPIEDADES

	// CONSTRUCTORES
	public Empaquetador() {

	}

	// MÉTODOS
	public double calcularMetresPaperRegal(Regal regal) {

		if (regal instanceof Llibre) {
			return ((Llibre) regal).getLlarg() * ((Llibre) regal).getAmple();
		} else if (regal instanceof Perfum) {
			double altura = ((Perfum) regal).getAltura();
			double mililitres = ((Perfum) regal).getMililitres();

			double amplada = Math.pow(mililitres / altura, 1.0 / 3.0);
			double llargada = altura + 2 * 0.1; // 0.1 vindira a ser el gruix del paper
			double areaLateral = 2 * altura * (amplada + amplada);
			double areaBaseTapa = amplada * llargada;
			double areaTotal = areaLateral + 2 * areaBaseTapa;

			return areaTotal / 10000; // m²

		} else if (regal instanceof Sabates) {
			return ((Sabates) regal).getLlargada() * ((Sabates) regal).getAmplada();
		} else {
			return 0.00;
		}

	}

}
