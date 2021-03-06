/*Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.*/
import java.util.Arrays;  // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Random; // пакет для подключения класса Random и создания объекта для генерации случайного числа
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class example_02_40 {
    public static void main(String[] args)//начало программы
    {
        Scanner id = new Scanner(System.in);          // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива:");// Сообщение пользователю "для красоты и понимания"
        int Size = id.nextInt();                     // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        System.out.println("Размер массива равен "+ Size); // Сообщение пользователю "для красоты и понимания"
        //Создаем массив случайных чисел
        Integer arr[] = new Integer[Size];//заполняем массив размера Size случайными числами
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 10000);
            System.out.print(arr[i] + "  ");//вывод элементов массива в одну строку
        }
        System.out.print("\nотсортированный массив: \n");//Сортируем массив
        int a=0;//введём промежуточную переменную для перебора методом "пузырька"
        for(int i = 0; i < arr.length; i++){//перебираем массив по всей длине
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++ ){//вывод на экран отсортированного массива
            System.out.println("Элемент массива ["+i+"] после сортировки = " + arr[i]);// Сообщение пользователю "для красоты и понимания"
        }
    }
}//конец программы