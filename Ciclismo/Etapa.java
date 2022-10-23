/**
 * Write a description of class Etapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Etapa extends bicicleta1
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double dificultad;
    private int distancia;
    

    /**
     * Constructor for objects of class Etapa
     */
    public Etapa()
    {
        this.nombre=" ";
        this.dificultad=0.0;
        this.distancia=0;
    }

    public String getNombre(){
        return nombre;
    }
    
    public double getDificultad(){
        return dificultad;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setDificultad(double dificultad){
        this.dificultad=dificultad;
    }
    
    public void setDistancia(int distancia){
        this.distancia=distancia;
    }
    

    public void mostrar(){
        System.out.println(getNombre());
        System.out.println(getDificultad());
        System.out.println(getDistancia());
    }
    
}
