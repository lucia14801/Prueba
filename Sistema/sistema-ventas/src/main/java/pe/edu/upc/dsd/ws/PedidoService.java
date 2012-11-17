package pe.edu.upc.dsd.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Pedido;


@WebService
public interface PedidoService 
{
	/**
	 * Obtiene el pedido por el c&oacute;digo de este,
	 * 
	 * @param codigo
	 * @return
	 */
	public Pedido obtenerPedido(@WebParam(name = "codigo") String codigo);
	
	/**
	 * Registra el pedido enviado.
	 * 
	 * @param pedido
	 * @return
	 */
	public String registrarPedido(@WebParam(name = "pedido") Pedido pedido);
}