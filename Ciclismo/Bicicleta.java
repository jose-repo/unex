/**
 * Creamos los constructores parametrizados -
 */

public class Bicicleta extends Bicicleta1
{
    private String nombre;
    private double peso;
    private double velocidad; 
    private int habilidad; 
    private int dificultad; 

public Bicicleta(String nombre, double peso, double velocidad, int habilidad, int dificultad)
{
    this.nombre = nombre;
    this.peso = peso;
    this.velocidad = velocidad; 
    this.habilidad = habilidad; 
    this.dificultad = dificultad;
}

public String getNombre()
{
  return this.nombre;   
}

public double getPeso()
{
    return this.peso;
}
public double getVelocidad()
{
    return this.velocidad;
}
public int getHabilidad ()
{
    return this.habilidad;
}
public int getDificultad()
{
    return this.dificultad; 
}
public void setNombre(String nombre)
{
    this.nombre= nombre;
}
public void setPeso(double peso)
{
    this.peso = peso; 
}
public void setVelocidad(double velocidad)
{
    this.velocidad = velocidad; 
}
public void setHabilidad(int habilidad)
{
    this.habilidad = habilidad; 
}
public void setDificultad(int dificultad)
{
    this.dificultad = dificultad; 
}

}
