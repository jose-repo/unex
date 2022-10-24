
/**
 * Write a description of class Ciclista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

package ciclismo;
import Resultado.Resultado;

import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    private String nombreCiclista;

    private int habilidadCiclista;
    private double energiaCiclista;

    private List<Resultado> ResultadosCiclista = new ArrayList<>();
    private String equipoCiclista;


    public Ciclista() {

    }

    public Ciclista(String nombreCiclista, int habilidadCiclista, double energiaCiclista) {
        this.nombreCiclista = nombreCiclista;
        this.habilidadCiclista = habilidadCiclista;
        this.energiaCiclista = energiaCiclista;
        this.ResultadosCiclista = new ArrayList<Resultado>();
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public int getHabilidadCiclista() {
        return habilidadCiclista;
    }

    public void setHabilidadCiclista(int habilidadCiclista) {
        this.habilidadCiclista = habilidadCiclista;
    }

    public double getEnergiaCiclista() {
        return energiaCiclista;
    }

    public void setEnergiaCiclista(double energiaCiclista) {
        this.energiaCiclista = energiaCiclista;
    }

    public String getEquipoCiclista() {
        return equipoCiclista;
    }

    public void setEquipoCiclista(String equipoCiclista) {
        this.equipoCiclista = equipoCiclista;
    }


    public List<Resultado> getResultadosCiclista() {
        return ResultadosCiclista;
    }

    public void setResultadosCiclista(List<Resultado> resultadosCiclista) {
        ResultadosCiclista = resultadosCiclista;
    }

    public boolean abandonarEtapa() {
        boolean abandono = false;
        if (energiaCiclista <= 0) {
            abandono = true;
        }
        return abandono;


    }



    public int getTotalEtapas() {
        return ResultadosCiclista.size();
    }

    public void calcularResultado(Etapa e){
        Resultado r = new Resultado(e, 100);
        this.ResultadosCiclista.add(r);

    }

    public void mostrarResultadosCiclista(){
        for (Resultado r : ResultadosCiclista){
            System.out.println(r);
        }
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombreCiclista='" + nombreCiclista + '\'' +
                ", habilidadCiclista=" + habilidadCiclista +
                ", energiaCiclista=" + energiaCiclista +
                ", equipoCiclista='" + equipoCiclista + '\'' +
                '}';
    }
}


