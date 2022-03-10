package uaslp.objetos.parcial2.Herencia;

public class Circle extends Figure{
    private float radio;

    public Circle(){
        super("Circulo");
    }

    public Circle(float radio){
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * radio *radio);
    }

    @Override
    public float getPerimeter() {
        return (float) (2*Math.PI*radio);
    }
}
