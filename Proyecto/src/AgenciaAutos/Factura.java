package AgenciaAutos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Factura {
	
	public static void main(String[] args) {

		ArrayList<Cliente> listaC= new ArrayList<>();
		ArrayList<Vendedor> listaV= new ArrayList<>();
		ArrayList<Agencia> listaA= new ArrayList<>();
		
		Autos au= new Autos(5,"Toyota","T24","1596A","Verde",2002,110000.0);
		Cliente c= new Cliente("Juan", "Perez", "Hernandez",25, "primera cerrda","15426878",null);
		Vendedor v= new Vendedor ("Sandy","Gonzales", "Paez", 521,"Vendedor");
		Agencia a= new Agencia("Willys","Ermita", "123456");
		
		Scanner sc= new Scanner(System.in);
		char caracter = 0;

		listaC.add(c);
		listaV.add(v);
		listaA.add(a);
	   //au.agregarAuto();

		int opc;
		do {
			System.out.println("1) Ver catalogo de Automoviles");
			System.out.println("2) Desea realizar una Factura");
			System.out.println("3) Ver factura");
			System.out.println("4) Salir");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1: 
				au.mostrarCatalogo();
				break;
			case 2:
					for(Cliente cliente: listaC) {
						System.out.println("--------Datos del cliente");
						cliente.pedirDatos();
					}
					for(Vendedor vendedor: listaV) {
						System.out.println("--------Datos del vendedor");
						 vendedor.pedirDatos();
					}
					for(Agencia agencia : listaA) {
						System.out.println("--------Datos de la Agencia");
						agencia.pedirDatos();
					}
					System.out.println("Eliga un auto");
					caracter=sc.next().charAt(0);
					
					File archivo = new File("Factura.txt");
					if(!archivo.exists()){
						try{
						archivo.canWrite();
						FileWriter so= new FileWriter(archivo, true);
						PrintWriter es=new PrintWriter(so);
						es.println("Factura");
						es.println("--------Datos del cliente");
						es.println("Nombre "+c.getNombre()+" "+c.getaPaterno()+" "+c.getaMaterno());
						es.println("Domicilio "+c.getDomicilio());
						es.println("Correo "+c.getCorreo());
						es.println("Telefono "+c.getTelefono());
						es.println("--------Datos del vendedor");
						es.println("\nNombre "+v.getNombre()+" "+v.getaPaterno()+" "+v.getaMaterno());
						es.println("\nPuesto "+v.getPuesto());
						es.println("\nNumero del empleado "+v.getNumEmpleado());
						es.println("\n--------Datos de la Agencia");
						es.println("\nNombre "+a.getNombre());
						es.println("\nDomicilio "+a.getDomicilio());
						es.println("\nTelefono "+a.getTelefono());
						es.close();
						so.close();
						}catch(IOException o){
							System.out.println(o.getMessage());
						}
					}else
					{
						try{
							FileWriter so= new FileWriter(archivo, true);
							PrintWriter es=new PrintWriter(so);
							es.println("\nFactura");
							es.println("--------Datos del cliente");
							es.println("Nombre "+c.getNombre()+" "+c.getaPaterno()+" "+c.getaMaterno());
							es.println("Domicilio "+c.getDomicilio());
							es.println("Correo "+c.getCorreo());
							es.println("Telefono "+c.getTelefono());
							es.println("--------Datos del vendedor");
							es.println("\nNombre "+v.getNombre()+" "+v.getaPaterno()+" "+v.getaMaterno());
							es.println("\nPuesto "+v.getPuesto());
							es.println("\nNumero del empleado "+v.getNumEmpleado());
							es.println("\n--------Datos de la Agencia");
							es.println("\nNombre "+a.getNombre());
							es.println("\nDomicilio "+a.getDomicilio());
							es.println("\nTelefono "+a.getTelefono());
							es.close();
							so.close();
							}catch(IOException o){
								System.out.println(o.getMessage());
							}
					}
					
				break;
			case 3:
				System.out.println(c.toString());
				System.out.println(v.toString());
				System.out.println(a.toString());
				System.out.println("Automovil");
				au.mostrarAuto(caracter);
			break;
				default: System.out.println("adios ");
				break;
			}
		}while(opc!=4);
	}

}
