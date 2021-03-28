package org.learnGitIntellij;

public class Circle implements Drawable{
    private double x, y, radius;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(int color) {
        System.out.println("Circle drawn at (" + x + ", " + y +
                "), with radius " + radius + ", and color " + color);
    }
}
