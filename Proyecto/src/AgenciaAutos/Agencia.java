package AgenciaAutos;
import java.util.*;

public class Agencia {
	
	private String nombre;
	private String domicilio;
	private String telefono;
	Scanner sc= new Scanner (System.in);
	public Agencia(String nombre, String domicilio, String telefono) {
		this.nombre=nombre;
		this.domicilio=domicilio;
		this.telefono=telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void pedirDatos() {
		System.out.println("Nombre de la Agencia");
		nombre=sc.nextLine();
		System.out.println("Direccion de la Agencia");
		domicilio=sc.nextLine();
		System.out.println("Telefono de la Agencia");
		telefono=sc.nextLine();
		
	}
	
	public String toString() {
		return "--------Datos de la agencia\n"+
				"Nombre de la Agencia: "+nombre+
				"\n"+"Domicilio: "+domicilio+
				"\n"+"Telefono: "+telefono;
	}
}
