/*Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_25
{
    public static void main(String[] args)//начало программы
    {
        Scanner in = new Scanner(System.in);//обращение ко вводу с клавиатуры
        System.out.println("Введите число:");//программа выводит на экран предложение ввести число
        int thousand = in.nextInt();//целочисленной переменной thousand присваивается значение,введённое с клавиатуры
        String str = Long.toString(thousand);//преобразование thousand из числа в строку
        char symbol = str.charAt(str.length() - 4);//присвоение переменной symbol значения 4-го символа справа в строке
        System.out.printf("Число тысяч в числе равно %s",symbol);// вывод строки с сообщением на экран
    }
}//конец программы