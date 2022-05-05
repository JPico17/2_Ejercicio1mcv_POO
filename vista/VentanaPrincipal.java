package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;

    //--------
    // Metodos
    //--------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200);
        this.add(miPanelEntradaDatos);
        // Caracteristicas de la ventana
        this.setTitle("Mayor de 2 enteros");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public PanelEntradaDatos getMiPanelEntradaDatos() {
        return miPanelEntradaDatos;
    }

    public void setMiPanelEntradaDatos(PanelEntradaDatos miPanelEntradaDatos) {
        this.miPanelEntradaDatos = miPanelEntradaDatos;
    }
}