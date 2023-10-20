package Part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            String line;
            while((line = br.readLine())!= null) {
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


