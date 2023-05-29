package personaje;

public class Arma {
	private String nombre;
	private int damage;
	private String clase;
	
	Arma(){
		
	}
	Arma(String nombre, int damage, String clase){
		this.nombre = nombre;
		this.damage = damage;
		this.clase = clase;
		
	}
	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", damage=" + damage + ", clase=" + clase + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	

}
