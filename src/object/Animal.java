/*
 * Copyright (c) 2012 Anton Shekhov 
 * 
 */
package object;

public class Animal {
    
    // For the each animal there two main massives:
    // genom [][] and behav []
    // each string in them represent on option or range of options
    
    // Usefull variable shows the length of genom and behav
    private int lengthChain = 2;
    // The main unchanged set of data of any animal - genom.
    private double genom [][] = new double [lengthChain][];
    // The set of data that can be changed during the life
    private double behav [] = new double [lengthChain];
    
    // There are a big set of properties, ranges, options and so on.
    // 
    // Variables of massives used in the genom [][]
    private double rangeSize[] = new double[2];
    
    // Variables used in the behav[]
    private double size;
    private double speed;
    
    // Special variables
    private boolean alive;
    
    
    // Constructors of the class

    // Constructor for initialization - all genom is minus one
    public Animal (){
        action.Reproduction burn = new action.Reproduction();
        for (int i = 0; i < genom.length; i++){
           genom[i] = new double[2]; 
           for (int j = 0; j < genom[i].length; j++){
               genom[i][j] = -1;
           }
           behav[i] = burn.setValue(genom[i][0], genom[i][1]);
        }
    }    
	
    // Constructor for two-reproduction system
    // uses properties of objects
    public Animal (double genomX [][], double behavX[],
            double genomY [][], double behavY[] ) {
        action.Reproduction burn = new action.Reproduction();
        genom = burn.mixDNA(genomX, genomY);
        behav = burn.translation(genom, behavX, behavY);
    }

    // The same constructor but use objects in their parametres
    public Animal (Animal X, Animal Y){
         action.Reproduction burn = new action.Reproduction();
         genom = burn.mixDNA(X.getGenom(), Y.getGenom());

         behav = burn.translation(genom, X.getBehav(), Y.getBehav());
    }
    
    // Constructor for clones
    public Animal (Animal ob){
        genom = ob.genom;
        behav = ob.behav;
    }
    

    // Methods of the Superclass

    public void burn () {
        alive = true;
    }
    public void dead (){
        alive = false;
    }
    
    // methods thats returns values of class
    public double[][] getGenom () {
        return genom;
    }  
    public double[] getBehav () {
        return behav;
    }
    public double getSize (){
        return behav[0];
    }
    public double[] getRangeSize () {
        return genom[0] ;
    }
    public double getSpeed () {
        return behav[1];
    }
    public boolean isAlive() {
        return alive;
    }
}

