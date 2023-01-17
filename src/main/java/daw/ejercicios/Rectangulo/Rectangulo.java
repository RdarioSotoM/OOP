package daw.ejercicios.Rectangulo;

public class Rectangulo {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangulo(){
    }

    public Rectangulo(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return this.length * this.width;
    }

    public float getPerimeter(){
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangulo [length = " + length + ", width = " + width + "]";
    }

    
    
}
