package uaslp.objetos.parcial2.Herencia;

public class Rectangle extends Figure{
    private float base;
    private float height;
    public Rectangle(){
        super("Rectangulo");
    }

    public Rectangle(float base, float height){
        super("Rectangulo");

        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return base*height;
    }

    @Override
    public float getPerimeter() {
        return base*2+height*2;
    }
}
