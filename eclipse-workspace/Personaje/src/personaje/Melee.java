package personaje;

public class Melee extends Personaje {
    public Melee(String nombre) {
        super(nombre);
        hp = 200;
        damage = 20;
        velocidad = 3;
        armadura = 5;
    }
}
