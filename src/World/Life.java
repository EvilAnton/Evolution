/**
 *Copyright (c) 2012 Anton Shekhov 
 * 
 */
package World;

public class Life {
    public static void main (String args[]){

        // Определение стандартных значений экземпляра класса

        // Создание самки и самца
        object.Animal catM = new object.Animal();
        object.Animal catW = new object.Animal();
        // Создание ребенка
        object.Animal baby = new object.Animal (catM.getGenom(), catM.getBehav(),
                catW.getGenom(), catW.getBehav());
        

        object.Animal baby2 = new object.Animal (catM, catW);

        System.out.println("Размер кошки = " + catW.getSize());
        System.out.println("Размер кошака = " + catM.getSize());
        System.out.println("Размер котенка = " + baby.getSize());
        System.out.println("Размер котенка 2 = " + baby2.getSize());
    }
}
