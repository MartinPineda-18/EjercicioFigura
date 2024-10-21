import java.util.Scanner;

public class Rectangulo extends Figura {

    Scanner teclado = new Scanner(System.in);

    private double altura;
    private double base;
    private double area;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

    @Override
    public void calcularArea() {

        System.out.println("Ingrese la base del rectangulo: ");
        setBase(teclado.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        setAltura(teclado.nextDouble());

    }

    @Override
    public void calcularPerimetro() {

    }


    //Base por altura (area)
    // 2 por base mas altura (perimetro)

}
