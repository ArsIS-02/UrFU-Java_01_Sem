/*Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
*/
import java.util.Scanner;//в программе будет использоваться ввод с клавиатуры
public class example_02_32v2 {
    public static void main(String[] args)//начало программы
    {
        System.out.println("Введите название дня недели:");//вывод строки с предложением ввода пользователю
        Scanner in = new Scanner(System.in);
        String Day = in.nextLine();//строковой переменной Day присваивается значение,введённое с клавиатуры
        if (Day == "понедельник")//проверка истинности

            System.out.println("1 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day == "вторник")//проверка истинности

            System.out.println("2 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day == "среда")//проверка истинности

            System.out.println("3 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day =="четверг")//проверка истинности

            System.out.println("4 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day =="пятница")//проверка истинности

            System.out.println("5 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day == "суббота")//проверка истинности

            System.out.println("6 день недели");//вывод строки при совпадении со введёнными данными

        else if (Day == "воскресенье")//проверка истинности

            System.out.println("7 день недели");//вывод строки при совпадении со введёнными данными

         else System.out.println("Ошибка. Дня недели под таким номером не существует!");//вывод строки на экран при ошибке

        }

    }//конец программы