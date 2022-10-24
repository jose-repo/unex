import Resultado.Resultado;
import ciclismo.Ciclista;
import ciclismo.Etapa;

public class CiclistaMain {
    public static void main(String args[]) {
        // crear datos ciclistas
        Ciclista ciclista1 = new Ciclista();
        Ciclista ciclista2 = new Ciclista();
        Ciclista ciclista3 = new Ciclista();
        // crear datos etapas
        Etapa etapa1 = new Etapa();
        etapa1.setNombre("Etapa 1");
        etapa1.setDificultad(150);
        etapa1.setDistancia(120);
        Etapa etapa2 = new Etapa();
        Etapa etapa3 = new Etapa();
        //resultado por etapa
        Resultado resultadoCiclista1 = new Resultado(etapa1, 100);

        // crear resultado por ciclista
        ciclista1.getResultadosCiclista().add(resultadoCiclista1);

        System.out.println(ciclista1.getTotalEtapas());


    }
}
