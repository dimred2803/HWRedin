package JsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {
    public static void main(String[] args) {
        String str = "";
        try (BufferedReader buffer = new BufferedReader(new FileReader("test.json"))) {
            int c;
            while ((c = buffer.read())!=-1) {
                if (c < 14 && c >8) continue;
                else str+=(char)c;
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str);
        JSONObj user = new JSONObj(str);

        System.out.println(user.getValue("from"));
        System.out.println(user.getValue("material"));
        System.out.println(user.getValue("color"));
        System.out.println(user.getValue("max-lifting-capacity"));
        System.out.println(user.getValue("cargo"));
        System.out.println(user.getValue("delivery-date"));
    }
}