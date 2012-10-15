/**
 * Copyright (c) 2012 Anton Shekhov 
 * 
 * This class is used genetic methods to 
 * get new generation
 */
package action;

public class Reproduction {

    
    // mixDNA mixes two genom lines and return 
    // a new genom massive
    public double [][] mixDNA (double genomX[][], double genomY[][]){
        int lengthX = genomX.length;
        int lengthY = genomY.length;
        double stopGenom [][] = new double [1][2];        
        if (lengthX == lengthY) {
            double newGenom [][] = new double [lengthX][];
            for (int i = 0; i < lengthX; i++) {
                // different size of gen means different types of values
                int lengthGen = genomX[i].length;
                switch (lengthGen) {
                    // case with minimum and maximum values
                    case 2:
                        newGenom[i] = mixRanges (genomX[i], genomY[i]);
                        break;
                }
            }  
            return newGenom;
        }
        else return stopGenom;
    }
    
    // this method take genom and set new value, based on the 
    // range from the genom
    public double [] translation (double genom[][], 
            double behavX[], double behavY[] ){
        int length = genom.length;
        double behav [] = new double [length];
        for (int i = 0; i < length; i++) {
            behav[i] = setValue (genom[i][0], genom[i][1]) +
                    devOpt(behavX[i], behavY[i]);
        }      
        return behav;
    }
    
    // Возвращает случайное число в заданном диапазоне
    public double setValue (double minValue, double maxValue){
        double deviation = Math.random();
        double size = minValue + (deviation * (maxValue - minValue));
        return size;
    }
    
    // Берет два 2-элементных массива и создает из них третий
    // используя среднее значение родителей и возможность мутации
    public double [] mixRanges (double rangeX [], double rangeY []){
        int mutProb1 [] = mutProb();
        int mutProb2 [] = mutProb();
        double newRange [] = new double [2];
        newRange [0] = (0.5 * (rangeX[0] + rangeY[0])) + 
                (mutProb1[0] * (mutProb1[1] * Math.random() / 5));
        newRange [1] = (0.5 * (rangeX[1] + rangeY[1])) + 
                (mutProb2[0] * (mutProb2[1] * Math.random() / 5));  
        return newRange;
    }
    
    // Возможность мутации.
    // Возвращает четырехмерный массив
    public int [] mutProb () {
        int mutProb [] = new int [2];
        // A procent of mutation probability
        double mutationChance = 0.01; 
        double temp [] = {Math.random(), Math.random()};

        // If there is a chance for mutation
        if (temp[0] > 0 || temp[0] < mutationChance){
        // return true 1 and
            mutProb[0] = 1;
            if (temp[1] > 0.5) {
                // set positive changes
                mutProb[1] = 1;
            }
            else {
                // or set negative changes
                mutProb[1] = -1;
            }
        }
        return mutProb;
    }
    
    // Считает возможное отклонение конечного значения
    public double devOpt (double behavX, double behavY){
        int sign;
        // What will be the sign of deviation
        if (Math.random() > 0.5) {
            sign = 1;
        }
        else {
            sign = -1;
        }      
        double deviation = (sign * Math.abs(behavX - behavY) * Math.random() / 10);
        return deviation;
    }

}