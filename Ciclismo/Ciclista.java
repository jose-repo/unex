
/**
 * Write a description of class Ciclista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
public class Ciclista
{
    private String nombreCiclista;
    private String bicicletaCiclista;
    private int habilidadCiclista;
    private double energiaCiclista;
    private  ArrayList<Integer> resultadosCiclista;
    private String equipoCiclista;
    
    
    public Ciclista()
    {
        this.nombreCiclista=""; 
        this.bicicletaCiclista=null; 
        this.habilidadCiclista=0; 
        this.energiaCiclista =0.0; 
        this.resultadosCiclista=null; 
        this.equipoCiclista=""; 
        
    }
    
    public Ciclista(String nombreCiclista, int habilidadCiclista, double energiaCiclista)
    {
        this.nombreCiclista=nombreCiclista;
        this.habilidadCiclista=habilidadCiclista;
        this.energiaCiclista=energiaCiclista;
    }
    
    public String getnombreCiclista(){
        return nombreCiclista; 
    }
    public String getbicicletaCiclista(){
        return bicicletaCiclista; 
    }
    public int gethabilidadCiclista(){
        return habilidadCiclista; 
    }
    public double getenergiaCiclista(){
        return energiaCiclista; 
    }
    public ArrayList getresultadosCiclista(){
        return resultadosCiclista; 
    }
    public String getequipoCiclista(){
        return equipoCiclista;
    }
    
    public void setnombreCiclista(String nombreCiclista){
        this.nombreCiclista=nombreCiclista ;
    }
    public void setbicicletaCiclista(String bicicletaCiclista){
        this.bicicletaCiclista= bicicletaCiclista;
    }
    public void sethabilidadCiclista(int habilidadCiclista){
        this.habilidadCiclista= habilidadCiclista; 
    }
    public void setenergiaCiclista(double energiaCiclista){
        this.energiaCiclista= energiaCiclista; 
    }
    public void setresultadosCiclista(ArrayList resultadosCiclista){
        this.resultadosCiclista= resultadosCiclista; 
    }
    public void setequipoCiclista(String equipoCiclista){
        this.equipoCiclista= equipoCiclista; 
    }
    
public boolean abandonarEtapa(){
boolean abandono = false;
if(energiaCiclista <= 0)   { 
    abandono= true;


}return abandono;

    
}

    public void gestionarResultados (Etapa e){ 
        if (resultadosCiclista != null) { 
            for (int i = 0;  i <= resultadosCiclista.size();i++){
            System.out.println (this.resultadosCiclista.get(i)+"Resultado de Estapa "+ e.getNombre());
            }
        }
    }
public int totalEtapas () {
   return this.resultadosCiclista.size (); 

}
public int totaltiempo () {
   for (
   
       
   } 

}
}




