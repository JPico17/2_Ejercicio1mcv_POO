package modelo;

public class Mayor2Enteros 
{
    //----------
    // Atributos
    //----------
    private int x;
    private int y;
    private int mayor;

    //--------
    // Metodos
    //--------
    public Mayor2Enteros(int pX, int pY)
    {
        this.x = pX;
        this.y = pY;
        this.mayor = 0;
    }
    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setY(int y)
    {
        this.y=y;
    }
    public int getY()
    {
        return y;
    }
    public int getMayor()
    {
        return mayor;
    }
    public void hallarMayor()
    {
        if(x > y){
            mayor = x;
        }else{
            mayor = y;
        }
    }
}
