package pack.logics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;

public class FileParser {

    public String readers() throws IOException {



        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/ListAnimal.txt"));
        String str;
        ArrayList<String> list = new ArrayList<>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }


        var random = new SecureRandom();
        String randomList = list.get(random.nextInt(list.size()));
        return randomList;


    }

}
