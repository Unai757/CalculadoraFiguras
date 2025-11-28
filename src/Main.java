import java.util.Scanner;
import java.util.InputMismatchException;

/***
 * Creamos la clase Main para ejecutar el programa
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas figuras quieres crear:");
        int dimension=sc.nextInt();
        Figura[] Figuras = new Figura[dimension];
        int contador = 0;

        int opcion;
        /***
         * Creamos las variables Contador para que nos cuente cuantas figuras hay en el array sumandolo 1 cada vez que creamos.
         * una
         * Despues la opcion sera lo que usaremos en el menu switch.
         */


        do {
            System.out.println("-------------------------------------------");
            System.out.println("Que opcion quiere usar 1-Circulo, 2-Rectangulo 3-Triangulo 4-Salir y ver resumen de figuras");
            System.out.println("-------------------------------------------");
            opcion = sc.nextInt();
            /***
             *Hacemos un loop do while para crear el menu y utilizarlo, se usa el do-while para que al menos el menu
             * se ejecute una vez.
             */

            switch (opcion) {

                case 1:
                    /***
                     * creamos la variable entradaValida para utilizar los errores
                     * mientras EntradaValida sea false seguira el loop hasta que introduzcamos numeros validos.
                     */
                    boolean EntradaValida = false;
                    while (!EntradaValida) {
                        try {
                            System.out.println("Introduce el radio:");
                            double radio = sc.nextDouble();

                            Circulo circulo = new Circulo(radio);
                            circulo.setRadio(radio);
                            circulo.calcularArea();
                            circulo.calcularPerimetro();
                            System.out.printf("Área: %.2f | Perimetro: %.2f\n", circulo.calcularArea(), circulo.calcularPerimetro());
                            /***
                             * Creamos el objeto circulo lo añadimos al array y mostramos su informacion poniendo %.2f para que salga solo dos decimales
                             */
                            if (contador < Figuras.length) {
                                Figuras[contador] = circulo;
                                contador++;
                                System.out.println("Circulo guardado");
                            }
                            EntradaValida = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Tienes que poner un numero");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            /***
                             * Aqui existen los errores el primero por si no se introduce un numero y el segundo por si el numero es
                             * negativo
                             */

                        }
                    }
                    break;

                case 2:
                    /***
                     * Este es el triangulo usa basicamente las mismas funciones que el circulo
                     */
                    EntradaValida = false;
                    while (!EntradaValida) {
                        try {
                            System.out.println("Introduce la base:");
                            int base = sc.nextInt();
                            System.out.println("Introduce la altura:");
                            int altura = sc.nextInt();

                            Rectangulo rectangulo = new Rectangulo(base, altura);
                            rectangulo.setBase(base);
                            rectangulo.setAltura(altura);
                            rectangulo.calcularArea();
                            rectangulo.calcularPerimetro();
                            System.out.printf("Área: %.2f | Perimetro: %.2f\n", rectangulo.calcularArea(), rectangulo.calcularPerimetro());

                            if (contador < Figuras.length) {
                                Figuras[contador] = rectangulo;
                                contador++;
                                System.out.println("rectangulo guardado");
                            }
                            EntradaValida = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Tienes que poner un numero");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println( e.getMessage());
                        }
                    }
                    break;

                case 3:
                    /***
                     * Este es el rectangulo usa basicamente las mismas funciones que el circulo
                     */
                    EntradaValida = false;
                    while (!EntradaValida) {
                        try {
                            System.out.println("Introduce la base");
                            int baset = sc.nextInt();
                            System.out.println("Introduce la altura");
                            int alturat = sc.nextInt();
                            System.out.println("Introduce el lado que falta");
                            int lado1 = sc.nextInt();

                            Triangulo triangulo = new Triangulo(baset, alturat, lado1);
                            triangulo.setBaset(baset);
                            triangulo.setAlturat(alturat);

                            System.out.printf("Área: %.2f | Perimetro: %.2f\n", triangulo.calcularArea(), triangulo.calcularPerimetro());
                            if (contador < Figuras.length) {
                                Figuras[contador] = triangulo;
                                contador++;
                                System.out.println("triangulo guardado");
                            }
                            EntradaValida = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Tienes que poner un numero positivo");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 4:
                    /***
                     * Aqui saldremos ya no se cumple el loop al poner la opcion 4, para salir del menu
                     */
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 4);


        System.out.println("Resumen de las figuras");
        for (int i = 0; i < contador; i++) {
            System.out.println(Figuras[i]);
        }
        /***
         * Aqui hacemos el resumen de las figuras poniendo su nombre altura base etc..
         * Utilizando el contador como limite para que solo haga un loop hasta la cantidad de figuras creadas
         */
    }
}