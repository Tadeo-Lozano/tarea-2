package uaslp.objetos.parcial2.Herencia;

abstract class Figure {
    private static int figuresCreated;
    private final String name;

    protected Figure(String name){
        this.name = name;

        figuresCreated++;
    }

    public static int getFiguresCreated(){
        return figuresCreated;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    public String getName(){
        return name;
    }
}
