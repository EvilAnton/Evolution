/*
 * Copyright (c) Anton Shekhov
 * 
 */
package object;

public class Animal {
    // each animal has his genom-massive and behaviour massive
    // look like DNA and peptides in the our organisms
    // Thus, genom is a massiму with one key and 
    // two values min and max possible values(constants)
    // and behavour is two-size massive with 
    // one key and one variable of propriety of this spieces
    private double genom [][] = new double [1][2];
    private double behav [] = new double [2];
    private double rangeSize[] = new double[2];
    private double size;
    private double speed;
    private boolean alive;
    
   // Constructors of the class

    // Constructor for initialization
    public Animal (){
        genom [0][0] = 1;
        genom [0][1] = 4;
        action.Reproduction burn = new action.Reproduction();
        behav [0] = burn.setValue(genom[0][0], genom [0][1]);
    }
    // Constructor for new-borners
    public Animal (double genomX [][], double behavX[],
            double genomY [][], double behavY[] ) {
        action.Reproduction burn = new action.Reproduction();
        genom = burn.mixDNA(genomX, genomY);
        behav = burn.translation(genom, behavX, behavY);
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
        return behav[0];
    }
    public double[] getRangeSize () {
        return rangeSize ;
    }
    public double getSpeed () {
        return speed;
    }
    public double[][] getGenom () {
        return genom;
    }  
    public double[] getBehav () {
        return behav;
    }
    public boolean isAlive() {
        return alive;
    }
 //   public boolean isAgressor() {
  //      return agressor;
   // }
    
}

