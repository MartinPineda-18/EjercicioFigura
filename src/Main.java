import java.util.*;

public class Main {
    public static void main(String[] args) {

        //3 objetos de cada figura

        Scanner teclado = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        List<Rectangulo> listaRec = new ArrayList<>();


        int opc;

        System.out.println("\tMenu\n" +
                "1) Triangulo\n" +
                "2) Rectangulo\n" +
                "3) Circulo\n" +
                "Ingrese su opcion: ");
        opc = teclado.nextInt();



        switch (opc) {

            case 1:

                rec.calcularArea();
                System.out.println(rec.getBase() * rec.getAltura());
                listaRec.add(rec);

        }

    }
}