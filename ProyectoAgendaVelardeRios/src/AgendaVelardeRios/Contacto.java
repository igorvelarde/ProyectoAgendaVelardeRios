package AgendaVelardeRios;

public class Contacto {
	
		public String nombre;
		String telefono;
		public String email;	
		
		
		public Contacto(String nombre,String telefono,String email){
			this.nombre=nombre;
			this.telefono=telefono;
			this.email=email;
		}
		
	
		public Contacto(String nombre,String telefono){
			this.nombre=nombre;
			this.telefono=telefono;
			this.email="";
		}
		

		public Contacto(){		
		}
		
	
		public String getNombre(){		
			return this.nombre;
		}
		
		public String getTelefono(){		
			return this.telefono;
		}
		
		public String getEmail(){		
			return this.email;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}	
		
		public void setTelefono(String telefono){
			this.telefono=telefono;
		}
		
		public void setEmail(String email){
			this.email=email;
		}
			
		public void DatosContacto(){
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Telefono: "+ getTelefono());
			System.out.println("Email: "+this.getEmail());
		}	
		
		public static float suma(float a, float b){		
			return a+b;
		}
}
