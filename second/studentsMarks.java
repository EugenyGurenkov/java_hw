import static java.lang.Character.isDigit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class studentsMarks {
    public static void main(String[] args) {
        //Задание 2
        //Напишите программу, которая считает, распарсит и выведет в логгер заранее созданный файл с именами,
        // предметами и оценками студентов
        Logger l2 = Logger.getLogger(studentsMarks.class.getName());
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/User/Desktop/javaHW/1/second/students.txt"))) {
            String s;
            String s2 = "";
            char[] s1;
            int grade = 0;
            while ((s = br.readLine()) != null) {
                s1 = s.toCharArray();
                for (char i : s1) {
                    if (isDigit(i)) {
                        grade = Character.digit(i, 10);
                    } else if (!isDigit(i) && i != ' ') {
                        s2 += i;
                    }
                }
                System.out.printf("Ученик %s получил сегодня %d.\n", s2, grade);
                s2 = "";
            }
            l2.log(Level.INFO, "Done");
        } catch (Exception ex) {
            l2.log(Level.WARNING, ex.getMessage());
        }
    }
}

