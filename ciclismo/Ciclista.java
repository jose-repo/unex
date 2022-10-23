package ciclismo;
/**
 * Write a description of class Ciclista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashMap;
import java.util.Map;

public class Ciclista {
    private String nombreCiclista;
    private String bicicletaCiclista;
    private int habilidadCiclista;
    private double energiaCiclista;

    private Map<Etapa, Integer> mapEtapasResultado = new HashMap<>();
    private String equipoCiclista;


    public Ciclista() {

    }

    public Ciclista(String nombreCiclista, int habilidadCiclista, double energiaCiclista) {
        this.nombreCiclista = nombreCiclista;
        this.habilidadCiclista = habilidadCiclista;
        this.energiaCiclista = energiaCiclista;
    }

    public String getNombreCiclista() {
        return nombreCiclista;
    }

    public void setNombreCiclista(String nombreCiclista) {
        this.nombreCiclista = nombreCiclista;
    }

    public String getBicicletaCiclista() {
        return bicicletaCiclista;
    }

    public void setBicicletaCiclista(String bicicletaCiclista) {
        this.bicicletaCiclista = bicicletaCiclista;
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

    public boolean abandonarEtapa() {
        boolean abandono = false;
        if (energiaCiclista <= 0) {
            abandono = true;
        }
        return abandono;


    }

    public void gestionarResultados(Etapa e) {
        Integer resultado = mapEtapasResultado.get(e);
        System.out.println("El tiempo resultado de la etapa " + e.getNombre() + "es " + resultado);
    }

    public int totalEtapas() {
        return mapEtapasResultado.size();

    }

    public int totaltiempo() {
        int totalTiempo = 0;
        for (Map.Entry<Etapa, Integer> entry : mapEtapasResultado.entrySet()) {
            System.out.println(entry.getKey().getNombre() + " : " + entry.getValue());
            totalTiempo += entry.getValue();
        }
        return totalTiempo;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombreCiclista='" + nombreCiclista + '\'' +
                ", bicicletaCiclista='" + bicicletaCiclista + '\'' +
                ", habilidadCiclista=" + habilidadCiclista +
                ", energiaCiclista=" + energiaCiclista +
                ", mapEtapasResultado=" + mapEtapasResultado +
                ", equipoCiclista='" + equipoCiclista + '\'' +
                '}';
    }
}




