import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepositoTest {
	
	@Test
	void test1() {

		Deposito deposito1 = new Deposito();
		Deposito deposito = new Deposito(13, -13, "1231");

	}

	@Test
	void test2() {

		Deposito deposito = new Deposito();
		deposito.setValoresDeposito("001", 12, -4);

	}

	@Test
	void test3() {

		Deposito valorEsperado = new Deposito(4, 12, "000");
		Deposito deposito = new Deposito();
		deposito.setValoresDeposito("000", 4, 12);
		System.out.println("DEPOSITO:" + deposito.getIdDeposito() + " DIAMETRO:" + deposito.getDiametro() + " ALTURA:"
				+ deposito.getAltura());

		assertEquals(deposito, valorEsperado);

	}

	@Test
	void test4() {

		float valorEsperado = (float) 392.69995;

		Deposito deposito = new Deposito();

		assertEquals(valorEsperado, deposito.valorCapacidad());

	}

}
