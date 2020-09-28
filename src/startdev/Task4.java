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
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random rand =  new Random();
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = rand.nextInt(100-0) * 2;
            System.out.println(myArr[i]);
        }
        System.out.println("----- конец задачи 4 ------");
    }
}
