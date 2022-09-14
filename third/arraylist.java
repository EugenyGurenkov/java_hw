package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            int x = Integer.parseInt(s);
            if(x % 2 != 0){
                list.add(x);
            }
            /*else{
                list.add(0, x);
            }*/
        }
        System.out.println(list);
    }

}
