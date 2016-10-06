/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Model {
    private String text="";

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

  /* public int stringToInt(){
         try{
int number = Integer.valueOf(text);
           
      return number; // Integer.parseInt(num
   
  } catch (NumberFormatException e){
       
         return  -1; 
 }
    }

 
    public double stringToDouble(){
 //num = "9";
          try{
double number = Double.valueOf(text);
           
      return number;
        } catch (NumberFormatException e){
                  // int i=(int) number;
           return -1;
        }
   }
   
   
   public float stringToFloat(){
 // num = "12";
             try{
float number = Float.valueOf(text);
           
      return number;
    } catch (NumberFormatException e){
                
           return -1;
    }
   }
         
         
  public long stringToLong(){
     //num = "12";
                 try{
long number = Long.valueOf(text);
           
      return number;
    } catch (NumberFormatException e){
               
           return -1;
             }
  }


   public int stringToShort(){
         //        num = "12";
                    try{
short number = Short.valueOf(text);
      return number;
      } catch (NumberFormatException e){
                
           return -1;
             }
   }
                
                
                
                
  public byte stringToByte(){
     //        num = "12";
                       try{
byte number = Byte.valueOf(text);
           
      return number;
   } catch (NumberFormatException e){        
           return -1;
   }
   }

   public String stringToAscii(){
                       String ascii="";
            for(int i=0; i<text.length(); i++){
                                                
          int   p=(int)text.charAt(i);

                                              
ascii  += p;    
                         }
      return ascii;
    }
                   
 public int stringTocontar(){
                       
     int contar=(text.length());
    return contar;
                   
                   }*/
                   
}
