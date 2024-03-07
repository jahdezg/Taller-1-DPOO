package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente
{
	public static String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre)
	{
		this.nombre = nombre;
	}
	public String getIdentificador()
	{
		return super.getIdentificador();
	}
	public String getTipoCliente()
	{
		return NATURAL;
	}
}
