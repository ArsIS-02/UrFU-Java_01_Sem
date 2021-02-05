/*Напишите программу, в которой создается двумерный массив,
который выводи прямоугольник из цифр 2.*/
import java.util.Scanner;
public class example_02_43 {
    public static void main(String[] args) {//начало программы
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите величину первой стороны прямоугольника:");// Сообщение пользователю "для красоты и понимания"
        int a = id.nextInt();// Запись в переменную a (нужная для того чтобы задать размер массива) значения введенного в консоль
        System.out.println("Введите величину второй стороны прямоугольника:");// Сообщение пользователю "для красоты и понимания"
        int b = id.nextInt();// Запись в переменную a (нужная для того чтобы задать размер массива) значения введенного в консоль
        for (int i = 0; i<=a; i++) {// формируем цикл перебора строк
            for (int q = 0; q <= b; q++) {
                if (q == 0 || i == 0 || i == a|| q == b){
                    System.out.print("2");// печать символа "*" в строке при выполнении условия
                }else System.out.print("2");
            }
            System.out.println(" ");

        }
        System.out.printf("Построен прямоугольник с заданными сторонами %d * %d", +a, +b);// сообщение на экран после построения фигуры
    }
}//конец программы

