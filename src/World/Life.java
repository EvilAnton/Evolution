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

        // Создание самки и самца
        object.Animal catM = new object.Animal();
        object.Animal catW = new object.Animal();
        // Создание ребенка
        object.Animal baby = new object.Animal (catM.getGenom(), catM.getBehav(),
                catW.getGenom(), catW.getBehav());
        
        System.out.println("Размер кошки = " + catW.getSize());
        System.out.println("Размер кошака = " + catM.getSize());
        System.out.println("Размер котенка = " + baby.getSize());
    }
}
