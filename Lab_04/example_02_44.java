/* Напишите программу, которая выводит в консольное окно
прямоугольный треугольник*/
import java.util.Scanner;
public class example_02_44 {
    public static void main(String[] args) {//начало программы
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите величину первой стороны треугольника:");// Сообщение пользователю "для красоты и понимания"
        int a = id.nextInt();// Запись в переменную a (нужная для того чтобы задать размер массива) значения введенного в консоль
        System.out.println("Введите величину второй стороны треугольника:");// Сообщение пользователю "для красоты и понимания"
        int b = id.nextInt();// Запись в переменную a (нужная для того чтобы задать размер массива) значения введенного в консоль
        for (int i = 0; i<=(a+1); i++) {//создание количества массивов-строк
            for (int q =1; q <b; q++) {
                if (q == 0 || (i ==b || q<i )){
                    System.out.print("*");//печать символов в строки
                }else if (i == q) {
                    System.out.print(" ");
                }else 	System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.printf("Построен прямоугольный треугольник со сторонами %d и %d",+a,+b);
    }
}//конец программы
