package javaapi1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

   public static void main(String[] args) throws IOException {
      String csvfile = "D:\\cyl\\test.csv";
      String csvsplit = ",";
      String line = "";
      BufferedReader br = new BufferedReader(new FileReader(csvfile));
      while((line = br.readLine()) != null){
         String[] a = line.split(csvsplit);
         for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
         }
      }
   }
}
