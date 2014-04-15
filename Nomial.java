class Nomial{
  private boolean isPositive;
  private float coefficient;
  private int power;
  
  Nomial(){
    this(true, 0.0, 0);
  }
  
  Nomial(boolean p, float c, power p){
    isPositive = p;
    coefficent = c;
    power = p;
  }
  
  public boolean getIsPositive{
    return isPositive; 
  }
  
  public float getCoefficent{
    return coefficent;
  }
  
  public int getPower{
    return power;
  }
}
