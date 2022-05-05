package vista;

import static javax.swing.BorderFactory.createTitledBorder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //--------------
    // Atributos
    //--------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    //--------------
    // Metodos
    //--------------

    /*Metodo constructor*/
    public PanelResultados()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.white);

        //Crear y agregar area de texto 
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,460,100);
        this.add(spResultado);

        //Borde y titulo al panel
        TitledBorder borde= createTitledBorder("Datos de Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
        
    }
    //Metodos de acceso a la informacion 
    public void mostrarResultado(int pmayor)
    {
        taResultado.setText("El numero mayor es: " + pmayor);
    }

    //Borrar los resultados
    public void borrar()
    {
        taResultado.setText("");
    }
}
