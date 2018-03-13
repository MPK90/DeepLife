package Entities;

import javafx.geometry.Point2D;


public interface EntityInterface
{
    public void update(double deltaTime);
    public void draw();
    
    public void setPosition(Point2D p);
    public void setRotation(double r);
    public Point2D getPosition();
    public double getRotation();
}
