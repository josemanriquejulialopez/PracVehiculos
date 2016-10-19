/**
 * Created by dam on 13/10/16.
 */
public class Coche {

    private String Matricula;
    private String Marca;
    private String Modelo;
    private double Precio;

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio=" + Precio +
                '}';
    }




    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public Coche(String matricula, String marca, String modelo, double precio) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
        Precio = precio;
    }


}
