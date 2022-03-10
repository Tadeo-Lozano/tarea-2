package uaslp.objetos.parcial2.Herencia;

public class Polygon extends Figure{
    private float numLados, apotema, medLado;
    public Polygon(){
        super("Polígono");
    }

    public Polygon(float apotema, float numLados, float medLado){
        super("Poligono");

        this.apotema = apotema;
        this.numLados = numLados;
        this.medLado = medLado;
    }

    @Override
    public float getArea() {
        return getPerimeter()*apotema/2;
    }

    @Override
    public float getPerimeter() {
        return numLados*medLado;
    }
}
