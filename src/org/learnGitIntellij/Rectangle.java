package org.learnGitIntellij;

public class Rectangle implements  Drawable{
    private double x1,x2,y1,y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void draw(int color) {
        System.out.println("Rectangle drawn with upper-left corner at (" + x1 +
                ", " + y1 + ") and lower-right corner at (" + x2 +
                ", " + y2 + "), and color " + color);
    }
}
