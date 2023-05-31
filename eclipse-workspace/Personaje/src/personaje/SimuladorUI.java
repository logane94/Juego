package personaje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimuladorUI {
    private Simulador sim;
    private JFrame frame;

    public SimuladorUI() {
        sim = new Simulador();
        sim.agregarArma(new Arma("Espada", 10));
        sim.agregarArmadura(new Armadura("Escudo", 10));

        frame = new JFrame("Simulador de Combate");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Container pane = frame.getContentPane();
        pane.setLayout(new GridLayout(8, 2));

        JButton crearPersonajeButton = new JButton("Crear personaje");
        JTextField nombrePersonajeTextField = new JTextField();
        JComboBox<String> tipoPersonajeBox = new JComboBox<>(new String[]{"Rango", "Melee"});

        JButton equiparPersonajeButton = new JButton("Equipar personaje");
        JComboBox<Personaje> personajeBox = new JComboBox<>(sim.getPersonajes().toArray(new Personaje[0]));
        JComboBox<Arma> armaBox = new JComboBox<>(sim.getArmas().toArray(new Arma[0]));
        JComboBox<Armadura> armaduraBox = new JComboBox<>(sim.getArmaduras().toArray(new Armadura[0]));

        JButton combateButton = new JButton("Inicio del combate");
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        crearPersonajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombrePersonajeTextField.getText();
                String tipo = (String) tipoPersonajeBox.getSelectedItem();
                sim.crearPersonaje(tipo, nombre);
                personajeBox.addItem(sim.getPersonajes().get(sim.getPersonajes().size() - 1));
            }
        });

        equiparPersonajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Personaje personaje = (Personaje) personajeBox.getSelectedItem();
                Arma arma = (Arma) armaBox.getSelectedItem();
                Armadura armadura = (Armadura) armaduraBox.getSelectedItem();
                personaje.equiparArma(arma);
                personaje.equiparArmadura(armadura);
            }
        });

        combateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes añadir la lógica del combate
            }
        });

        pane.add(crearPersonajeButton);
        pane.add(nombrePersonajeTextField);
        pane.add(tipoPersonajeBox);
        pane.add(equiparPersonajeButton);
        pane.add(personajeBox);
        pane.add(armaBox);
        pane.add(armaduraBox);
        pane.add(combateButton);
        pane.add(new JScrollPane(outputArea));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimuladorUI();
    }
}

