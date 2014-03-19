package mx.gob.sat.domain;

public class ValueObject
{

   private String fieldThree;
   private boolean flag;
   private float fieldFour;
   
   public ValueObject() 
   {
     super();
     
   }
   /**
      * @param fieldThree
      * @param flag
      * @param fieldFour
      */
   public ValueObject(String fieldThree, boolean flag, float fieldFour)
   {
      super();
      this.fieldThree = fieldThree;
      this.flag = flag;
      this.fieldFour = fieldFour;
   }
   /**
    * @return the fieldFour
    */
   public float getFieldFour()
   {
      return fieldFour;
   }
   /**
    * @param fieldFour the fieldFour to set
    */
   public void setFieldFour(float fieldFour)
   {
      this.fieldFour = fieldFour;
   }
   /**
    * @return the fieldThree
    */
   public String getFieldThree()
   {
      return fieldThree;
   }
   /**
    * @param fieldThree the fieldThree to set
    */
   public void setFieldThree(String fieldThree)
   {
      this.fieldThree = fieldThree;
   }
   /**
    * @return the flag
    */
   public boolean isFlag()
   {
      return flag;
   }
   /**
    * @param flag the flag to set
    */
   public void setFlag(boolean flag)
   {
      this.flag = flag;
   }
   
   
   
   
}