/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;
import java.util.Random;
/**
 *
 * @author user
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random rand = new Random();
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = rand.nextInt(100-0+1)-0;
            System.out.println(myArr[i]);
        }
        
        int summe = myArr[0];
        for (int i : myArr) {
        summe = summe + i;
            }
        System.out.println("Сумма всех чисел массива: "+ summe);
        int min = myArr[0];
        for (int i : myArr) {
        if (i < min) {
            min = i;
        }
    }
        System.out.println("min = " + min);
        int max = myArr[0];
        for (int i : myArr) {
        if (i > max) {
            max = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("----- конец задачи 3 ------");
        
    }
}