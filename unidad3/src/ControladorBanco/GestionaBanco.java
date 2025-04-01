package ControladorBanco;

import java.time.LocalDate;

public class GestionaBanco {

	public static void main(String[] args) {
		Personas titular = new Personas("12345678A", "Pepe", "López",LocalDate.of(2000, 12, 12) );

		CuentaBanco cuenta = new CuentaBanco(0.0, "ES123456789123456789123456", titular);

	}

}
