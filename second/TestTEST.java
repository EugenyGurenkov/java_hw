import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestTEST {

    public static void main(String[] args) {
        //1. Напишите программу,записывающую 100раз слово ”ТЕST” в файл.
        //Слова должны чередоваться по формату – четная итерация большими буквами,нечетные – маленькими
        //Пример:TESTtestTESTtestTEST…

        Logger l1 = Logger.getLogger(TestTEST.class.getName());
        try (FileWriter fw = new FileWriter("C:/Users/User/Desktop/javaHW/1/second/testTEST.txt", true)) {
            String s = "Test";
            for (int i = 0; i < 100; i++)
                if (i % 2 == 0)
                    fw.write(s.toUpperCase());
                else
                    fw.write(s.toLowerCase());
            fw.flush();
            l1.log(Level.INFO, "Done");
        } catch (Exception e) {
            l1.log(Level.WARNING, e.getMessage());
        }
    }
}