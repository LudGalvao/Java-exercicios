package sistemabancario;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTeste {
	@Test
	public void testPesquisaCliente() {
		
		Cliente cliente01 = new Cliente(1,"João da Silva", 47, "joaosilva@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2,"Maria da Silva", 44, "mariasilva@gmail.com", 2, true);
		Cliente cliente03 = new Cliente(3,"Vasco da Silva", 12, "vascosilva@gmail.com", 3, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("joaosilva@gmail.com"));
	}
	
	@Test
	public void testRemoveCliente() {
		Cliente cliente01 = new Cliente(1,"João da Silva", 47, "joaosilva@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2,"Maria da Silva", 44, "mariasilva@gmail.com", 2, true);
		Cliente cliente03 = new Cliente(3,"Vasco da Silva", 12, "vascosilva@gmail.com", 3, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		boolean clienteRemovido = gerClientes.removeCliente(3);
		
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(2));
	}
}
