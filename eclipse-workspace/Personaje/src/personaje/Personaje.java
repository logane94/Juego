package personaje;

public abstract class Personaje {
    protected String nombre;
    protected int hp;
    protected int damage;
    protected int velocidad;
    protected int armadura;
    protected Arma arma;
    protected Armadura armaduraEquipo;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void equiparArmadura(Armadura armadura) {
        this.armaduraEquipo = armadura;
    }

    public String getNombre() {
        return nombre;
    }
}
