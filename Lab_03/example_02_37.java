/*Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.*/
public class example_02_37 {
    public static void main(String[] args) {// начало программы
        String abc[] = new String [10];// создание массива abc из 10 элементов
        abc[0] = "a";// заполнение каждой ячейки
        abc[1] = "c";
        abc[2] = "e";
        abc[3] = "g";
        abc[4] = "i";
        abc[5] = "k";
        abc[6] = "m";
        abc[7] = "o";
        abc[8] = "q";
        abc[9] = "s";
        System.out.println("Прямой порядок элементов алфавита");// Сообщение пользователю "для красоты и понимания"}
        for (int i = 0; i <= 9; i++)
        {
            System.out.print(abc[i] + " ");//вывод элементов с 1 по 10 в прямом порядке с шагом +1
        }
        System.out.println("\nОбратный порядок элементов алфавита");// Сообщение пользователю "для красоты и понимания"}
        for (int i = 9; i >= 0; i--){
            System.out.print(abc[i] + " ");//вывод элементов с 1 по 10 в обратном порядке с шагом -1
        }
        }
}// конец программы