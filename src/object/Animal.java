/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Антон
 */
public class Animal {
    // Any animal has some size,
    // speed, agressor or not
    private double rangeSize[] = new double[2];
    private double size;
    private double speed;
    private boolean alive;
    
   // Constructor of the class
    public Animal (double rangeSizes[] ){
        rangeSize = rangeSizes;
        action.Reproduction burn = new action.Reproduction();
        size = burn.setValue(rangeSize[0], rangeSize[1]);            
    }
    // Constructor for initialization
    public Animal (){
        rangeSize[0] = -1;
        rangeSize[1] = -1;
        size = -1;
    }
    // Constructor for new-borners
    public Animal (double genotypeX [], double phenotypeX,
            double genotypeY [], double phenotypeY ) {
        action.Reproduction burn = new action.Reproduction();
        double options [][];
        options = burn.crossingover(genotypeX, phenotypeX, genotypeY, phenotypeY);
        rangeSize[0] = options [0][0];
        rangeSize[1] = options [0][1];
        size = options[1][0];
    }
    

    // Also there are some base methods
    
    public void speedUp (double increment){
        speed += increment;
    }
    public void slowDown (double decrement){
        speed -= decrement;
    }
    public void setSize (double newSize){
        size = newSize;
    }
    public void incSize (double increment){
        size += increment;
    }
    public void decSize (double decrement){
        size -= decrement;
    }
    public void burn () {
        alive = true;
    }
    public void dead (){
        alive = false;
    }
    
    // methods thats returns values of class
    public double getSize (){
        return size;
    }
    public double[] getRangeSize () {
        return rangeSize ;
    }
    public double getSpeed () {
        return speed;
    }
    public boolean isAlive() {
        return alive;
    }
 //   public boolean isAgressor() {
  //      return agressor;
   // }
    
}

