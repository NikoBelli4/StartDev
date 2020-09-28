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
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random rand = new Random();
        int[][] myArr = new int [10][];
        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < 10; n++) {
                switch (i) {
                    case 0: i=rand.nextInt(100-0); n=-5;break;
                    case 1: i=rand.nextInt(100-0); n=6;break;
                    case 2: i=rand.nextInt(100-0); n=7;break;
                    case 3: i=rand.nextInt(100-0); n=8;break;
                    case 4: i=rand.nextInt(100-0); n=9;break;
                    case 5: i=rand.nextInt(100-0); n=1;break;
                    case 6: i=rand.nextInt(100-0); n=1;break;
                    case 7: i=rand.nextInt(100-0); n=1;break;
                    case 8: i=rand.nextInt(100-0); n=1;break;
                    case 9: i=rand.nextInt(100-0); n=1;break;
                
                }
                myArr[i] = new int[n];
                for (int j = 0; j < 10; j++) {
                    myArr[i][j] = rand.nextInt(100-0);
                    System.out.printf("%4d",myArr[i][j]);
                }
            }
            
        }
        System.out.println("----- конец задачи 6 ------");
    }
}
