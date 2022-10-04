public class ejercicio_tema5 {

    public static void main(String[] args) {
        Persona persona = new Persona();
	
        persona.setEdad(39);
    
        int edad = persona.getEdad();
        System.out.println(edad);
	
        persona.setNombre("Lara");
    
        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setTelefono(1130111431);
        
        int telefono = persona.getTelefono();
        System.out.println(telefono);
        
    }

    

}

class Persona {
	private int edad;
	private String nombre;
	private int telefono;

	public void setEdad(int edad) {
		this.edad = edad;
    }

    public int getEdad() {
		return this.edad;
    }

    public void setNombre(String nombre) {
		this.nombre = nombre;
    }

    public String getNombre() {
		return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}