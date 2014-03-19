package mx.gob.sat.domain;

public class Entity
{

   /**
     * @return the identifier
     */
   public long getIdentifier()
   {
      return identifier;
   }

   /**
    * @param identifier the identifier to set
    */
   public void setIdentifier(long identifier)
   {
      this.identifier = identifier;
   }

   //Entity identifier
   private long identifier;

   //entity attirbutes
   private String fieldOne;

   private int fieldSecond;

   /**
    * @param fieldOne
    * @param fieldSecond
    */
   public Entity(String fieldOne, int fieldSecond)
   {
      super();
      this.fieldOne = fieldOne;
      this.fieldSecond = fieldSecond;
   }

   public Entity()
   {
      super();
      this.fieldOne = "";
      this.fieldSecond = 0;
   }

   /**
    * @return the fieldOne
    */
   public String getFieldOne()
   {
      return fieldOne;
   }

   /**
    * @param fieldOne the fieldOne to set
    */
   public void setFieldOne(String fieldOne)
   {
      this.fieldOne = fieldOne;
   }

   /**
    * @return the fieldSecond
    */
   public int getFieldSecond()
   {
      return fieldSecond;
   }

   /**
    * @param fieldSecond the fieldSecond to set
    */
   public void setFieldSecond(int fieldSecond)
   {
      this.fieldSecond = fieldSecond;
   }

}