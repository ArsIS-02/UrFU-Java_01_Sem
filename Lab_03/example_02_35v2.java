/*Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.*/
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class example_02_35v2 {
    public static void main(String[] args) // начало программы
    {
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите количество чисел num для выполнения условий num%5==2 и num%3==1:");// Сообщение пользователю "для красоты и понимания"
        int Size = id.nextInt();// Запись в переменную Size (нужная для того чтобы задать размер массива) значения введенного в консоль
        System.out.println("Размер массива чисел равен " + Size);// Сообщение пользователю "для красоты и понимания"
        int[] Nums;//объявление массива
        Nums = new int[Size];//объявление и инициализация переменной массива чисел
        int Max = 2147483647, Num1 = 0, sum = 0;//обьявление крайних точек перебора целых чисел
        int i = 0;//объявление начала отсчёта индексов ячеек массива
        while (i <= Size) {//перебор чисел в массиве  по одному со счётчиком
            for (Num1 = 0; Num1 <= Max; Num1++) {//заполнение ячеек массива
                if (Num1 % 5 == 2 && Num1 % 3 == 1)//нахождение каждого элемента массива
                {
                    Nums[i] = Num1;
                    sum += Nums[i];
                    System.out.println("Элемент массива [" + i + "] = " + Nums[i]);// Сообщение пользователю "для красоты и понимания"}
                    Num1++;
                    i++;//приращение значений счётчика и шаг к следующему числу
                    if (i == Size) {
                        System.out.println("Сумма " + Size + " элементов массива равна: " + sum);
                    }
                }
            }
        }
    }
}//конец программы