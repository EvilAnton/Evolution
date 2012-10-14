/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

/**
 *
 * @author Антон
 */
public class Life {
    public static void main (String args[]){
        // Определение стандартных значений экземпляра класса
        double standartValues [] = new double [2];
        standartValues[0] = 3; //
        standartValues[1] = 4;
        // Создание самки и самца
        object.Animal catM = new object.Animal(standartValues);
        object.Animal catW = new object.Animal(standartValues);
        object.Animal baby = new object.Animal (catM.getRangeSize(), catM.getSize(),
                catW.getRangeSize(), catW.getSize());
        System.out.println("Размер кошки = " + catW.getSize());
        System.out.println("Размер кошака = " + catM.getSize());
        System.out.println("Размер котенка = " + baby.getSize());
    }
}
