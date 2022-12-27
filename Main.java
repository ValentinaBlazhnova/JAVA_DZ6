// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …вывести проходящие по условиям.
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 

package DZ6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteBook n1 = new NoteBook("1", "Air", "8", "256");
        NoteBook n2 = new NoteBook("2", "MagicBook", "16", "512");

        ArrayList<NoteBook> al = new ArrayList<NoteBook>();
        al.add(n1);
        al.add(n2);

        Scanner in = new Scanner(System.in);

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2);

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();

        NotebookContoller contoller = new NotebookContoller();
        /*
NotebookContoller - тип создаваемого объекта
contoller - название создаваемого объекта
 */
        System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));

    }
}
