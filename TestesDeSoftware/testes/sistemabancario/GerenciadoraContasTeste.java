package sistemabancario;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTeste {
	@Test
	public void testTranfereValor(){
		ContaCorrente conta01 = new ContaCorrente(1, 100, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean resultado = gerContas.transfereValor(1, 70, 2);
		
		assertTrue(resultado);
		assertThat(conta01.getSaldo(), is(30.0));
		assertThat(conta02.getSaldo(), is(70.0));
	}
}
