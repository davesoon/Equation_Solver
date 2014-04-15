class Nomial{
  private float coefficient;
  private int power;
  
  Nomial(){
    this(0.0, 0);
  }
  
  Nomial(float coefficent, int power){
    this.coefficent = coefficent;
    this.power = power;
  }
  
  public float getCoefficent{
    return coefficent;
  }
  
  public int getPower{
    return power;
  }
  
  public boolean add(Nomial nomial){
    if(power == nomial.power){
      coefficent += nomial.coefficent;
      return true;
    }
    return false;
  }
  
  public boolean subtract(Nomial nomial){
    if(power == nomial.power){
      coefficent -= nomial.coefficent;
      return true;
    }
    return false;
  }
  
  public void multiply(Nomial nomial){
    power += nomial.power;
    coefficent *= nomial.coefficent;
  }
  
  public void divide(Nomial nomial){
    power -= nomial.power;
    coefficent /= nomial.coefficent;
  }
  
}
