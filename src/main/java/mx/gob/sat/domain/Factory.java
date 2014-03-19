package mx.gob.sat.domain;

public class Factory
{


/*
 * TO BE Improved
 */ Factory.getFactory().create( 
  
  new ValueObject("la cadena",true, 1.45678F)
)
*/
  public Aggregate create(List<Entity> entities, ValueObject vo) 
  {
    
    return new Aggregate(entities ,vo );
  }
}