package AgenciaAutos;
import java.io.*;
import java.util.*;

public class Autos {
	
	private int Id;
	private String marca;
	private String modelo;
	private String numSerie;
	private String color;
	private int anio;
	private double precio;
	Scanner sc= new Scanner (System.in);
	
	public Autos(int Id,String marca, String modelo, String numSerie, String color, int anio, double precio) {
		this.Id=Id;
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.color = color;
		this.anio = anio;
		this.precio=precio;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



	File archivo = new File("CatalogoAuto.txt");
	File dir = new File("C:\\Users\\ASUS LAP\\eclipse-workspace\\Proyecto");
	
	public void agregarAuto() {
		
		if(!archivo.exists()){
			try{
			archivo.canWrite();
			FileWriter so= new FileWriter(archivo, true);
			PrintWriter es=new PrintWriter(so);
			es.println(Id+" "+marca+" "+modelo+" "+numSerie+" "+color+" "+anio+" "+precio);
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
				es.println(Id+" "+marca+" "+modelo+" "+numSerie+" "+color+" "+anio+" "+precio);
				es.close();
				so.close();
				}catch(IOException o){
					System.out.println(o.getMessage());
				}
		}
	}
	
	public void mostrarCatalogo() {
		
		BufferedReader fd = null;
		String linea = "";
		try {
			fd = new BufferedReader (new FileReader ("CatalogoAuto.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println ("No pude abrir el archivo");
		}
		try {
			while ((linea = fd.readLine ()) != null)
			System.out.println (linea);
			fd.close ();
		}
		catch (IOException e) {
			System.out.println ("Error al leer");
		}
	}
	
	public void mostrarAuto(char c) {
		try {
			BufferedReader leer = new BufferedReader(new FileReader("CatalogoAuto.txt"));
			
			String  line ;
			while((line= leer.readLine() )!= null){
				if(line.indexOf(c)== 0){
					System.out.println(line);
				}else {
					System.out.println("Auto no existe");
				}
			}
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		}
	}

}
