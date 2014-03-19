package mx.gob.sat.domain;

import mx.gob.sat.domain.Aggregate;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Repository
{
  private HashMap<String, Aggregate> collection;
  
  public Repository()
  {
    this.collection = new  HashMap<String, Aggregate>();
  }
  
  /**
   * Store an Aggregate Object 
   * @return aggregate identifier
   */
  public String add(Aggregate anAggregate)
  {
    //Generate UUID 
      final String generatedKey =
      UUID.randomUUID().toString().replaceAll("-", "");
    collection.put(generatedKey,anAggregate);
    anAggregate.setIdentity(generatedKey);
    return generatedKey;
  }
  
  public Collection<Aggregate> findAll() 
  {
    this.collection.values();
  }
  
  public Aggregate findById(String idAggregate )
  {
   return  collection.get(idAggregate);
  }
  
  
  /**
   *  Deletes an Aggregate Object
   */
  
  public boolean delete(String idAggregate, Aggregate anAggregate )
  {
    collection.remove(idAggregate);
    return true;
  }
  
  
    /**
   *  Updates an Aggregate Object
   */
  
  public boolean update(String idAggregate, Aggregate anAggregate )
  {
     collection.put(idAggregate,anAggregate);
     return true;
  }
  

  
  
}