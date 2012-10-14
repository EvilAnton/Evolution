/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

/**
 * Copyright (c) Anton Shekhov 
 */
public class Reproduction {
    
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
    
    // Выполнение кроссинговера для двух родительских значений
    // Возвращает свойства нового объекта
    public double[][] crossingover (double rangeOptX [], double optX,
            double rangeOptY [], double optY){
        // mix two massives by mixRanges
        double newRange [] = new double [2];
        newRange = mixRanges (rangeOptX, rangeOptY);
       
        // create a new option by setValue
        // and compute the deviation of option
        double newOption = (setValue (newRange[0], newRange[1])) +
                devOpt(optX, optY);
        // return two-dimensional massive with new genotype and phenotype
        double options [][] = new double [2][];
        options [0] = new double [2];
        options [0][0] = newRange [0];
        options [0][1] = newRange [1];
        options [1] = new double [1];
        options [1][0] = newOption;
        
        return options;
    }
}
