package mx.gob.sat.domain;

import mx.gob.sat.domain.Entity;
import mx.gob.sat.domain.ValueObject;

import java.util.List;

public class Aggregate
{

   private String identity;
   private List<Entity> entities;

   private ValueObject value;
   
   

   /**
      * @param entities
      * @param value
      */
   public Aggregate()
   {
      super();
   }

   /**
      * @param entities
      * @param value
      */
   public Aggregate(List<Entity> entities, ValueObject value)
   {
      super();
      this.entities = entities;
      this.value = value;
   }

   /**
     *  @param identity
      * @param entities
      * @param value
      */
   public Aggregate(String identity, List<Entity> entities, ValueObject value)
   {
      super();
      this.identity = identity;  
      this.entities = entities;
      this.value = value;
   }

   public Aggregate(String identity){
     this.identity = identity;
   }


   public String getIdentity(){
     return this.identity;
   }

   public void setIdentity(String identity){
     return this.identity = identity;
   }
   /**
   * @return the vo
   */
   public ValueObject getValue()
   {
      return value;
   }

   /**
    * @param vo the vo to set
    */
   public void setValue(ValueObject vo)
   {
      this.value = vo;
   }
   
   public List<Entity> getEntities() 
   {
     return this.entities;
   }

}