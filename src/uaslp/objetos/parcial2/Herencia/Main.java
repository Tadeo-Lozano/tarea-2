package uaslp.objetos.parcial2.Herencia;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figureList = new LinkedList<>();

        figureList.add(new Polygon(4, 5, 6.3f));
        figureList.add(new Polygon(4.5f, 8, 3.9f));
        figureList.add(new Rectangle(4, 5));
        figureList.add(new Rectangle(4.5f, 9.6f));
        figureList.add(new Circle(5.3f));
        figureList.add(new Circle(10.6f));

        for (Figure figure : figureList) {
            System.out.println(figure.getName() + ", Area: " + figure.getArea() + ", Perímetro: " + figure.getPerimeter());
        }

        if(Modifier.isAbstract(Figure.class.getModifiers())){
            System.out.println("Figure es abstracta");
        }

        System.out.println("Se generaron: " + Figure.getFiguresCreated() + " figuras");
    }/*Salida del programa:
        Polígono, Area: 63.0, Perímetro: 31.5
        Polígono, Area: 70.200005, Perímetro: 31.2
        Rectángulo, Area: 20.0, Perímetro: 18.0
        Rectángulo, Area: 43.2, Perímetro: 28.2
        Círculo, Area: 88.247345, Perímetro: 33.300884
        Círculo, Area: 352.98938, Perímetro: 66.60177
        Figure es abstracta
        Se generaron: 6 figuras
        */

}
