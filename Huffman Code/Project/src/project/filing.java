
package project;

import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;


public class filing {
    Node[] arr;
    
    public String ReadTextFile(String file) throws IOException{
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
        String x = HT.count(s);
       
         input.close();
          return x ;
     /*  
   BufferedReader reader = new BufferedReader(new FileReader(file));
     String s="";
     String line = reader.readLine();
     while(line != null)
     {
      s += line;
      line = reader.readLine();
     }
        System.out.println("Read from File: ");
        System.out.println(s);
        HuffmanTree HT = new HuffmanTree();
         HT.count(s);
      reader.close(); */
   }
    
    public void WriteTextFile(String s) throws IOException{
    java.io.File file = new java.io.File("huffcode.txt");
//    if (file.exists()) {  System.out.println("File already exists");
//      System.exit(0);
//    }
 java.io.PrintWriter output = new java.io.PrintWriter(file);
    // Write formatted output to the file
    output.print(s);
    // Close the file
    output.close();
    }
    
    
    
    
    }
    

