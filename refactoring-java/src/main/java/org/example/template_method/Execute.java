package org.example.template_method;

public class Execute {
    public static void main(String[] args) {
        var triangle = new Triangle(10L, 5L, 7L);
        var square = new Square(14L);

        System.out.println(triangle.getPerimeter());
        System.out.println(square.getPerimeter());
    }
}
