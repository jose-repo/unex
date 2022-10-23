/*
 * Calcular la velocidad de un ciclista en una etapa en concreto 
 * 
 */
import java.util.Arrays; 
public class bicicleta1
{
    private String nombreBicicleta ; 
    private int pesoBicicleta; 
    
    public int getpesoBicicleta(){
        return pesoBicicleta; 
    }

    public double hallarVelocidad(Ciclista c, Etapa e){
          return (c.gethabilidadCiclista() *100)/(getpesoBicicleta()* e.getDificultad());
    }
    
    public double tiempoNecesario(Ciclista c, Etapa e){
        return ((e.getDistancia()/(hallarVelocidad(c,e)))*60);
        
    }
    
}