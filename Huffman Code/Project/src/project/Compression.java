
package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Compression {
    String x ;
    int t ;
    public void ReadText(String file) throws IOException{
         java.io.File fi = new java.io.File(file);
        Scanner input = new Scanner(fi);
         String s="";
     String line = input.nextLine();
     while(input.hasNext())
     {
      s += line;
      line = input.nextLine();
     }
      System.out.println("Read from File: ");
        System.out.println(s);
        HuffmanTree HT = new HuffmanTree();
         x = HT.HuffCode(s);
         t=  HT.BinaryCount(s) ;
         input.close();
   /*    
   BufferedReader reader = new BufferedReader(new FileReader(file));
   
     String s="";
     String line = reader.readLine();
     while(line != null)
     {
      s += line;
      line = reader.readLine();
     }
        System.out.println(s);
       
     HuffmanTree ht = new HuffmanTree();
  //   ht.HuffCode(s); 
   x =  ht.HuffCode(s) ;
    reader.close();
   t= ht.BinaryCount(s) ; */
    }
    
    
    
    
}
