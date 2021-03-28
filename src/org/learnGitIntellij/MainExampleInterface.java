package org.learnGitIntellij;

public class MainExampleInterface {
    public static void main(String[] args) {
        /*Circle circle=new Circle(4,4,2);
        Rectangle rectangle=new Rectangle(5,5,8,8);
        circle.draw(1);
        rectangle.draw(1);*/
        Drawable[] drawables = new Drawable[] { new Circle(10, 20, 15),
                new Circle(30, 20, 10),
                new Rectangle(5, 8, 8, 9) };
        for (int i = 0; i < drawables.length; i++)
            drawables[i].draw(Drawable.Red);

    }
}
