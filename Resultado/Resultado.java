package Resultado;

import ciclismo.Etapa;

public class Resultado {
    private Etapa etapa;
    private double tiempoEtapa;

    public Resultado(Etapa etapa, double tiempoEtapa) {
        this.etapa = etapa;
        this.tiempoEtapa = tiempoEtapa;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public double getTiempoEtapa() {
        return tiempoEtapa;
    }

    public void setTiempoEtapa(double tiempoEtapa) {
        this.tiempoEtapa = tiempoEtapa;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "etapa=" + etapa +
                ", tiempoEtapa=" + tiempoEtapa +
                '}';
    }
}


