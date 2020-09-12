
package project;

import java.io.IOException;
import java.util.Arrays;

public class Project {

    public static void main(String[] args) throws IOException {
            
        HuffmanTree ht = new HuffmanTree();
   //     ht.count("I love you");

     //  filing file = new filing();
     //  file.ReadTextFile("file.txt");
        
       
        
       filing file = new filing();
        file.ReadTextFile("CSSample.txt");
         
    // Compression cp = new Compression();
     //   cp.ReadText("BioSample.txt");
     // cp.ReadText("CS.txt");
          FrontPage ff = new FrontPage();
          ff.setVisible(true);
    }
     
     
     
     
}
