package personaje;

public abstract class Personaje {
	
	protected int hp;
	protected int damage;
	protected int velocidad;
	private String nombre;
	
	
	Personaje(){

		
	}
	
	protected Personaje(String nombre, int hp, int damage, int velocidad){
		this.nombre = nombre;
		this.hp = hp;
		this.damage = damage;
		this.velocidad = velocidad;

		
		
	}
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}



	@Override
	public String toString() {
		return "Personaje [hp=" + hp + ", damage=" + damage + ", nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void atacar();
	public abstract void defender();
	public abstract void equiparArma();
	public abstract void equiparArmadura();
	
	

}
