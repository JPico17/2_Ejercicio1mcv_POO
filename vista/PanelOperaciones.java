package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //--------------
    // Atributos
    //--------------
    private JButton btHallar;
    private JButton btBorrar;
    private JButton btSalir;

    //--------------
    // Metodos
    //--------------

    /*Metodo constructor*/
    public PanelOperaciones()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.white);

        //Crear y agregar boton hallar
        btHallar = new JButton("Hallar");
        btHallar.setBounds(45, 40,100,20);
        this.add(btHallar);
        btHallar.setActionCommand("hallar");

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(190, 40,100,20);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        btSalir = new JButton("Salir");
        btSalir.setBounds(335, 40,100,20);
        this.add(btSalir);
        btSalir.setActionCommand("salir");

        //Borde y titulo al panel
        TitledBorder borde= BorderFactory.createTitledBorder("Datos de Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
        
    }
}