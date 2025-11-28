import java.util.Scanner;

/***
 * creamos la clase Rectangulo que extiende de figura con variables base y altura
 */
public class Rectangulo extends Figura{
    Scanner scanner = new Scanner(System.in);
    private double base;
    private double altura;

    /***
     *
     * @param base base del rectangulo
     * @param altura altura del rectangulo
     *               Creamos el constructor de la clase rectangulo
     */
    public Rectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("La base y la altura no deben ser negativo");
            /***
             * Con este if comprobamos que ningun numero este debajo del 0 para que no se pueda añadir numeros negativos
             */
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    @Override
    public double calcularArea() {

        double area = base*altura;
        return area;

    }

    /***
     *
     *  Hacemos el metodo de calcularPerimetro() haciendo la formula del perimetro que es (2*base)+(2*altura);
     */
    @Override
    public double calcularPerimetro() {
        double perimetro = (2*base)+(2*altura);

        return perimetro;

    }




    /*****
     *Creamos este toString() para mostrar la informacion de la forma ordenadamente
     */
    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "Area=" + calcularArea() +
                ", Perimetro=" + calcularPerimetro() +

                '}';

    }


}
