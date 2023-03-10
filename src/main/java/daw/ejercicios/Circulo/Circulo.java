package daw.ejercicios.Circulo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo {
    private double radio = 1.0;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return pow(this.radio, 2) * PI;
    }

    public double getCircunferencia() {
        return 2 * PI * this.radio;
    }

    @Override
    public String toString() {
        return "Cirulo [radio = " + radio + "]";
    }

    
}
