package alishev.parseJson;

import alishev.parseJson.model.Root;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonSimpleParser {
    Root root = new Root();
public Root parse() throws FileNotFoundException {
    FileReader reader = new FileReader(new File("files/test.json"));

    return null;
}
     public static void truncate(int index, String value){
        String text = value.substring(0,index);
        System.out.println(text+"...");

    }
    public static String truncate1(int index, String value){
        return  value.substring(0, index) + "...";

    }

    @Test
    void test0(){
        System.out.println(truncate1(4,"Пивецукцв"));
    }
}
