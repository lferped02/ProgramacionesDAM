package EjemploEnum;

public class Reserva {
	private enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}

	Mes mes = Mes.ENERO;
	Mes mes2 = Mes.valueOf("FEBRERO");

	public static void main(String[] args) {

		System.out.println();

	}

}
