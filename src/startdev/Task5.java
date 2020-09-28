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
public class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int [10][5] ;
        Random rand = new Random();            
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 5; j++){
                    myArr[i][j] = rand.nextInt(100-0);
                }
            }
        System.out.println("----- конец задачи 5 ------");
    }
}
