package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;


@WebService(endpointInterface="pe.edu.upc.dsd.ws.ClienteService")
public class ClienteServiceImpl implements ClienteService
{
	private List<Cliente> clientes;
	
	public ClienteServiceImpl()
	{
		this.clientes = getClientesPrueba();
	}
	
	 @Override
    public Cliente consultarCliente(String codigoCliente)
    {
		for (Cliente cliente : clientes) 
		{
			if(cliente.getDocumentoIdentidad().equals(codigoCliente))
			{
				return cliente;
			}
		}

        return null;
    }
	 
	private List<Cliente> getClientesPrueba()
	{
		List<Cliente> clientesPrueba = new ArrayList<Cliente>();
		
        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("01");
        cliente1.setNombre("Alexander");
        cliente1.setApellidoPaterno("Paucara");
        cliente1.setApellidoMaterno("Larico");
        cliente1.setDireccion("Lejana");
        cliente1.setDocumentoIdentidad("44035731");
        cliente1.setTelefono("111111");
        cliente1.setTipoPersona("N");
		
        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("02");
        cliente2.setNombre("Lucia");
        cliente2.setApellidoPaterno("De la Cuz");
        cliente2.setApellidoMaterno("Soto");
        cliente2.setDireccion("Lejos");
        cliente2.setDocumentoIdentidad("45397453");
        cliente2.setTelefono("222222");
        cliente2.setTipoPersona("N");       
        

        
        
        clientesPrueba.add(cliente1);
        clientesPrueba.add(cliente2);
       
        
		return clientesPrueba;
	}
}