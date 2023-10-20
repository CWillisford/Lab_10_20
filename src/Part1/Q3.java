package Part1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) throws IOException {
        String filePath = "sample3";
        List<String> lines = fileReader(filePath);
        fileWriter("sample4", lines.toString());

    }
    public static List<String> fileReader(String filePath) throws IOException {
        List<String> line2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line2.add(line);
            }
        }
        return line2;
    }
    public static void fileWriter(String name,String content) throws IOException{
        try(FileWriter fw = new FileWriter(name);
            BufferedWriter br = new BufferedWriter(fw);
        ){
            br.write(content);
        }
    }
}
