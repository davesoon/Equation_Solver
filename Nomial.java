class Nomial{
  private float coefficient;
  private int power;
  
  Nomial(){
    this(0, 0);
  }
  
  Nomial(float coefficent, int power){
    this.coefficient = coefficent;
    this.power = power;
  }
  
  public float getCoefficient(){
    return coefficient;
  }
  
  public int getPower(){
    return power;
  }
  
  public boolean add(Nomial nomial){
    if(power == nomial.power){
      coefficient += nomial.coefficient;
      return true;
    }
    return false;
  }
  
  public boolean subtract(Nomial nomial){
    if(power == nomial.power){
      coefficient -= nomial.coefficient;
      return true;
    }
    return false;
  }
  
  public void multiply(Nomial nomial){
    power += nomial.power;
    coefficient *= nomial.coefficient;
  }
  
  public void divide(Nomial nomial){
    power -= nomial.power;
    coefficient /= nomial.coefficient;
  }
  
}
