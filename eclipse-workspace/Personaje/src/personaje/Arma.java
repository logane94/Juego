package personaje;

public class Arma {
    private String nombre;
    private int damage;

    public Arma(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = damage;
    }

    public String getNombre() {
        return nombre;
    }

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
}