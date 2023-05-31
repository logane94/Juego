package personaje;
import java.util.ArrayList;

public class Simulador {
    private ArrayList<Personaje> personajes;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;

    public Simulador() {
        personajes = new ArrayList<>();
        armas = new ArrayList<>();
        armaduras = new ArrayList<>();
    }

    public void crearPersonaje(String tipo, String nombre) {
        if (tipo.equals("Rango")) {
            personajes.add(new Rango(nombre));
        } else if (tipo.equals("Melee")) {
            personajes.add(new Melee(nombre));
        }
    }

    public void equiparPersonaje(int index, Arma arma, Armadura armadura) {
        personajes.get(index).equiparArma(arma);
        personajes.get(index).equiparArmadura(armadura);
    }

    // Implementar la lógica del combate...
    
    public void agregarArma(Arma arma) {
        armas.add(arma);
    }

    public void agregarArmadura(Armadura armadura) {
        armaduras.add(armadura);
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public ArrayList<Armadura> getArmaduras() {
        return armaduras;
    }
}