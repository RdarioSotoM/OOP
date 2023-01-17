package daw.ejercicios.Empleado;

public class Empleado {
    private int id;
    private String Nombre;
    private String Apellido;
    private int Salario;

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public String NombreCompleto(){
        return this.Nombre + " " + this.Apellido;
    }

    public int getSalario() {
        return this.Salario;
    }

    public void setSalario(int salario) {
        this.Salario = salario;
    }

    public int SalarioAnual(){
        return this.Salario * 12;
    }

    public int IncrementoSalario(int porcentaje){
        this.Salario += this.Salario * porcentaje;
        return this.Salario;
    }

    @Override
    public String toString() {
        return "Empleado [id = " + id + ", Nombre = " + Nombre + ", Apellido = " + Apellido + ", Salario = " + Salario + "]";
    }

        
    
}
