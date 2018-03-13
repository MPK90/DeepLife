package Entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javafx.geometry.Point2D;

public class Human implements EntityInterface
{
  private  Point2D position;
  private double rotation;
  
  private int foodUnits;
  private final int maxFoodUnits = 10;
  private int stamina = 100;
  private final int maxStamina = 100;
  
  public Human(double x, double y)
  {
      position = new Point2D(x,y);
      rotation =0.0;
  }

@Override
public void update(double deltaTime)
{


}
  
@Override
public void draw()
{

    
}
    
    
    




@Override
public void setPosition(Point2D p)
{
    this.position = p;        
}

@Override
public void setRotation(double r)
{
    this.rotation = r;
}

@Override
public Point2D getPosition()
{
    // TODO Auto-generated method stub
    return this.position;
}

@Override
public double getRotation()
{
    // TODO Auto-generated method stub
    return this.rotation;
}


public int getFoodUnits()
{
    return this.foodUnits;
}

public void addFoodUnits(int amount)
{
    if((this.foodUnits+amount) >= this.maxFoodUnits)
        this.foodUnits = this.maxFoodUnits;
    else
        this.foodUnits += amount;
}

public void resetFoodUnits()
{
    this.foodUnits = 0;
}

public int getStamina()
{
    return this.stamina;
}

public void addStamina(int amount)
{
    if((this.stamina + amount) >= this.maxStamina)
        this.stamina = this.maxStamina;
    else 
        if((this.stamina + amount) <= 0)
            this.stamina = 0;
        else
            this.stamina += amount;
}

public void resetStamina()
{
    this.stamina = 100;
}

public int getMaxFoodValue()
{
    return this.maxFoodUnits;
}

}
