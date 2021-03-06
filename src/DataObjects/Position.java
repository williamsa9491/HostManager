/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataObjects;

/**
 * This Class stores the data about a Position
 * 
 * @author garreola-gutierrez, mtdargen
 */
public class Position {
    Runway parent;
    int positionMaximumLength;
    float positionSlope;
    float positionCenterlineOffset;
    
    public Position(){
    }
    @Override
    public String toString(){
        return String.valueOf(positionMaximumLength);
    }
    
    public Position(Runway parent1, int positionMaximumLength1, float positionSlope1, 
                    float positionCenterlineOffset1){
       parent = parent1;
       positionMaximumLength = positionMaximumLength1;
       positionSlope = positionSlope1;
       positionCenterlineOffset = positionCenterlineOffset1;
    }
        
   /**
    * This method can change the Runway that a Position object
    * belongs to.
    * This method always works, only if airfield already
    * exists.
    *
    * @param  parent1  the Runway this position belongs to
    */
    public void setParent(Runway parent1){
        parent = parent1;
    }

   /**
    * Returns the Runway object this Position belongs to
    * This method always returns immediately,only if airfield exists. 
    * @return      the position of Airfield object
    */
    public Runway getParent(){
       return parent; 
    }

   /**
    * This method can change the position maximum length and makes the 
    * position Maximum Length part of the Airfield object.
    * This method always works, only if airfield already
    * exists.
    *
    * @param  positionMaximumLength1  the String that is 
    *                                 designated to position maximum 
    *                                 length of the Airfield object
    */
    public void setPositionMaximumLength(int positionMaximumLength1){
        positionMaximumLength= positionMaximumLength1;
    }
       /**
    * Returns an Airfield object position maximum length to be displayed. 
    * This method always returns immediately,only if airfield exists. 
    * @return      the designator of Airfield object
    */ 
    public int getPositionMaximumLength(){
       return positionMaximumLength; 
    }

/**
 * This method can change the position slope and makes the 
 * position slope part of the Airfield object.
 * This method always works, only if airfield already
 * exists.
 *
 * @param  positionSlope1  the String that is designated to
 *                         position slop of the Airfield object
 */
    public void setPositionSlope(float positionSlope1){
            positionSlope= positionSlope1;
    }
    
   /**
    * Returns an Airfield object position slope to be displayed. 
    * This method always returns immediately,only if airfield exists. 
    * @return      the position slope of Airfield object
    */    
    public float getPositionSlope(){
           return positionSlope; 
    }
    
   /**
    * This method can change the position centerline offset and 
    * makes the position centerline offset part of the Airfield object.
    * This method always works, only if airfield already
    * exists.
    *
    * @param  positionCenterlineOffset1  the String that is 
    *                                    designated to position slope of 
    *                                    the Airfield object
    */
    public void setPositionCenterlineOffset(int positionCenterlineOffset1){
        positionCenterlineOffset = positionCenterlineOffset1;
    }
    
   /**
    * Returns an Airfield object position centerline offset to be displayed. 
    * This method always returns immediately,only if airfield exists. 
    * @return      the position centerline offset of Airfield object
    */   
    public float getPositionCenterlineOffset(){
       return positionCenterlineOffset; 
    }
}

    
