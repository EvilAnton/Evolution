/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

/**
 * Copyright (c) Anton Shekhov 
 */
public class Reproduction {

    
    // mixDNA mixes two genom lines and return 
    // a new genom massive
    public double [][] mixDNA (double genomX[][], double genomY[][]){
        int length = genomX.length;
        double newGenom [][] = new double [length][2];

        for (int i = 0; i < length; i++) {
            newGenom[i] = mixRanges (genomX[i], genomY[i]);
        }
        return newGenom;
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
        int mutProb [] = mutProb();
        double newRange [] = new double [2];
        newRange [0] = (0.5 * (rangeX[0] + rangeY[0])) + 
                (mutProb[0] * (mutProb[1] * Math.random() / 5));
        newRange [1] = (0.5 * (rangeX[1] + rangeY[1])) + 
                (mutProb[2] * (mutProb[3] * Math.random() / 5));  
        return newRange;
        
    }
    
    // Возможность мутации.
    // Возвращает четырехмерный массив
    public int [] mutProb () {
        
        int mutProb [] = new int [4];
        double temp [] = new double [4];
        
        for (int i = 0; i < 4; i++ ){
            temp[i] = Math.random();
        }
        
        // для первой величины логическая 1 или 0,
        // и изменение в + или -
        if (temp[0] > 0.5 || temp [0] < 0.55){
            mutProb [0] = 1;
            if (temp [1] > 0.5) { mutProb[1] = 1;}
            else { mutProb[1] = -1; }
            }
        else {
            mutProb [0] = 0;
        }
        
        // для второй величины логическая 1 или 0,
        // и изменение в + или -
        if (temp[2] > 0.5 || temp [2] < 0.55){
            mutProb [2] = 1;
            if (temp [3] > 0.5) { mutProb[3] = 1;}
            else { mutProb[3] = -1; }
            }
        else {
            mutProb [2] = 0;
        }
    
        return mutProb;
    }
    
    // Считает возможное отклонение конечного значения
    public double devOpt (double optX, double optY){
        int sign;
        if (Math.random() > 0.5) {
            sign = 1;
        }
        else {
            sign = -1;
        }
        double deviation = (sign * 0.5 * (optX + optY)) * Math.random() / 10;
        //System.out.println("Прибавка к весу равна "+deviation);
        return deviation;
    }

}