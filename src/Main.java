import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figura[] Figuras = new Figura[10];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        do {
            System.out.println("------------");
            System.out.println("Que opcion quiere usar 1-Circulo, 2-Rectangulo 3-Triangulo 4-Mostrar informacion 5-salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el radio:");
                    double radio = sc.nextDouble();

                    Circulo circulo = new Circulo(radio);
                    circulo.setRadio(radio);
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    System.out.printf("Área: %.2f | Perimetro: %.2f\n", circulo.calcularArea(), circulo.calcularPerimetro());
                    if (contador < Figuras.length) {
                        Figuras[contador] = circulo;
                        contador++;
                        System.out.println("Circulo guardado");
                    }

                    break;
                case 2:
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


                        break;
                    }


                        case 3:
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


                                opcion = 3;
                            break;
                        case 4:

                            for (int i = 0; i < contador; i++) {
                                System.out.println(Figuras[i]);
                            }
                            break;
                        case 5:
                            System.out.println("Saliendo...");


            }
        } while (opcion != 5);

    }

}
