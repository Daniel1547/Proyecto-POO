package AgenciaAutos;
import java.util.Scanner;
public class Cliente extends Persona {
	
	private String domicilio;
	private String telefono;
	private String correo;
	
	Scanner sc= new Scanner(System.in);
	
	public Cliente(String nombre, String aPaterno, String aMaterno, int edad,String domicilio, String telefono, String correo) {
		super(nombre, aPaterno, aMaterno);
		this.domicilio=domicilio;
		this.telefono=telefono;
		this.correo=correo;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void pedirDatos() {
		System.out.println("Nombre Cliente");
		setNombre(sc.nextLine());
		System.out.println("Apellido Paterno Cliente");
		setaPaterno(sc.nextLine());
		System.out.println("Apellido Materno Cliente");
		setaMaterno(sc.nextLine());
		System.out.println("Domicilio Cliente");
		domicilio=sc.nextLine();
		System.out.println("Telefono Cliente");
		telefono=sc.nextLine();
		System.out.println("Correo Cliente");
		correo=sc.nextLine();
	}
	
	public String toString() {
		return "------Datos del cliente\n"+
				"Nombre del Cliente: "+getNombre()+" "+getaPaterno()+" "+getaMaterno()+
				"\n"+"Domicilio: "+domicilio+
				"\n"+"Telefono: "+telefono+
				"\n"+"Correo Electronico: "+correo;
	}
}