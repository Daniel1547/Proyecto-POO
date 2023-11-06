package AgenciaAutos;
import java.util.Scanner;
public class Vendedor extends Persona {
	
	private int numEmpleado;
	private String puesto;
	
	Scanner sc= new Scanner(System.in);
	
	public Vendedor(String nombre, String aPaterno, String aMaterno,int numEmpleado, String puesto) {
		super(nombre, aPaterno, aMaterno);
		this.numEmpleado = numEmpleado;
		this.puesto = puesto;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void pedirDatos() {
		System.out.println("Nombre del Vendedor");
		setNombre(sc.nextLine());
		System.out.println("Apellido Paterno Vendedor");
		setaPaterno(sc.nextLine());
		System.out.println("Apellido Materno Vendedor");
		setaMaterno(sc.nextLine());
		System.out.println("Puesto");
		puesto=sc.nextLine();
		System.out.println("Numero del Empleado");
		numEmpleado=sc.nextInt();
	}
	
	public String toString() {
		return "Lo atendio: \n"+"Nombre: "+getNombre()+" "+getaPaterno()+" "+getaMaterno()+
				"\n"+"Numero empleado: "+numEmpleado+
				"\n"+"Puesto: "+puesto;
	}
}