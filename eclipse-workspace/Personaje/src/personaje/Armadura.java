package personaje;

public class Armadura {
    private String nombre;
    private int armadura;

    public Armadura(String nombre, int armadura) {
        this.nombre = nombre;
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

   
}