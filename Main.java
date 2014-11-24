import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		//Creacion de animales------------
		Leon ln1 = new Leon();
		Perro pr1 = new Perro();
		Toro tr1 = new Toro();

		int ladridos = 0;

		//Captura atributos animales

		//LEON----------------------
		ln1.setNombre(args[0]);
		ln1.setEdad(args[1]);
		ln1.setSexo(args[2]);

		//PERRO--------------------
		pr1.setNombre(args[3]);
		pr1.setEdad(args[4]);
		pr1.setSexo(args[5]);
		
		//TORO---------------------
		tr1.setNombre(args[6]);
		tr1.setEdad(args[7]);
		tr1.setSexo(args[8]);
		
		System.out.println("Nombre:" + ln1.getNombre() + " " + "Edad:" + ln1.getEdad() + " " + "Sexo:" + ln1.getSexo());
		System.out.println("Nombre:" + pr1.getNombre() + " " + "Edad:" + pr1.getEdad() + " " + "Sexo:" + pr1.getSexo());
		System.out.println("Nombre:" + tr1.getNombre() + " " + "Edad:" + tr1.getEdad() + " " + "Sexo:" + tr1.getSexo());
		
		System.out.println("Cuantas veces quieres que emitan sonido?:");
		ladridos = sc.nextInt();


		for(int i = 0; i < ladridos; i++){
		
			if( i <= (ladridos/2)){
				System.out.println(tr1.getemiteSonido() + " " +  pr1.getemiteSonido() + " " + ln1.getemiteSonido() );
			}else{
				System.out.println(ln1.getemiteSonido() + " " +  pr1.getemiteSonido() + " " + tr1.getemiteSonido() );
			}
		}
	}
}


//Clase León------------------------------------
class Leon{
	String sNombre;
	String sRaza;
	String sSexo;
	String sSonido = "Rawr";

	
	//Empiezan set-----------
	void setNombre(String sNombre){
	this.sNombre = sNombre;
	}

	void setEdad(String sRaza){
		this.sRaza = sRaza;
	}

	void setSexo(String sSexo){
		this.sSexo = sSexo;
	}

	//Empiezan get-----------
	String getNombre(){
		return sNombre;
	}

	String getSexo(){
		return sSexo; 
	}

	String getEdad(){
		return sRaza;
	}

	String getemiteSonido(){
		return sSonido;
	}
}

//Clase Perro------------------------------------
class Perro{
	String sNombre;
	String sRaza;
	String sSexo;
	String sSonido = "Woof";
	
	//Empiezan set-----------
	void setNombre(String sNombre){
	this.sNombre = sNombre;
	}

	void setEdad(String sRaza){
		this.sRaza = sRaza;
	}

	void setSexo(String sSexo){
		this.sSexo = sSexo;
	}

	//Empiezan get-----------
	String getNombre(){
		return sNombre;
	}

	String getSexo(){
		return sSexo; 
	}

	String getEdad(){
		return sRaza;
	}

	String getemiteSonido(){
		return sSonido;
	}
}


//Clase Toro--------------------------------------
class Toro{
	String sNombre;
	String sRaza;
	String sSexo;
	String sSonido = "MMMMMM";
	
	//Empiezan set-----------
	void setNombre(String sNombre){
	this.sNombre = sNombre;
	}

	void setEdad(String sRaza){
		this.sRaza = sRaza;
	}

	void setSexo(String sSexo){
		this.sSexo = sSexo;
	}

	//Empiezan get-----------
	String getNombre(){
		return sNombre;
	}

	String getSexo(){
		return sSexo; 
	}

	String getEdad(){
		return sRaza;
	}

	String getemiteSonido(){
		return sSonido;
	}
}
