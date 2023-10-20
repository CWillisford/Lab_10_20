package Part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            String line;
            while((line = br.readLine())!=null){
                list.add(line);
            }
            readLines(list,list.size()-1);
        }
    }

    public static void readLines(List<String> lines, int index){
        while(index >= 0){
            System.out.println(lines.get(index));
            index--;
            //readLines(lines,index);
            //break;
        }
    }
}
