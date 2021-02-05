/*Создать два проекта, в которых продемонстрировать два 
способа создания линейного однонаправленного списка (с головы и с 
хвоста) согласно примеру 2 из второго раздела. Отработать код с 
помощью отладчика и привести скриншоты минимум трех точек 
обработанных отладчиком.*/
package example_02_85;
public class DSD_create {
    public static void main(String[] args) {
        // создание 1-го узла, который изначально является и головой, и хвостом списка
        Node head=new Node(0, null);
        Node tail=head;
// добавление элементов с наращиванием хвоста
        for (int i = 0; i <9; i++) {
            tail.next=new Node(i+1, null);
            tail=tail.next; // указатель на созданный элемент запоминается
        } // как указатель на новый хвост
// вывод элементов на экран
        Node ref = head; // ref – рабочая переменная для текущего узла
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }}}