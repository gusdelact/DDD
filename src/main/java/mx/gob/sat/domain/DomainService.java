package mx.gob.sat.domain;

public class DomainService
{

   public String logic01(Aggregate aggr) 
   {
   
     String result="";
     //simple logic, needs to use more entity and valueobjec fields
     for ( Entity entity : aggr.getEntities()  ) 
     {
       String temp= 
        entity.getFieldOne() + aggr.getValue().getFieldThree();
        
       float number = entity.getFieldSecond() + aggr.getValue().getFieldFour();
       
       temp = temp + number;
       
       result= result + temp + ',';
       
     }   
     
     return result;
   }
}