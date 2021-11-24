package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocReader {

    public static List<String> nameReader(String filename) {
        try {
            List<String> list = new ArrayList<>();
            BufferedReader bf = new BufferedReader(new FileReader("src/resources/" + filename));

            for (String line; (line = bf.readLine()) != null; ) {
                if (line.length() > 1) {
                    list.add(line);
                }
            }
            return list;
        } catch (IOException e) {
            System.out.println("I love giraffes");
        }
        return null;
    }
}
