package ciclismo;

/**
 * Creamos los constructores parametrizados
 */

public class Bicicleta {
    private String nombre;
    private double peso;
    private double velocidad;
    private int habilidad;
    private int dificultad;

    public Bicicleta(String nombre, double peso, double velocidad, int habilidad, int dificultad) {
        this.nombre = nombre;
        this.peso = peso;
        this.velocidad = velocidad;
        this.habilidad = habilidad;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public double hallarVelocidad(Ciclista c, Etapa e) {
        return (c.getHabilidadCiclista() * 100) / (peso * e.getDificultad());
    }

    public double tiempoNecesario(Ciclista c, Etapa e) {
        return ((e.getDistancia() / (hallarVelocidad(c, e))) * 60);

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                ", habilidad=" + habilidad +
                ", dificultad=" + dificultad +
                '}';
    }
}
