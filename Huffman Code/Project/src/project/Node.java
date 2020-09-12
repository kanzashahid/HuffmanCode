
package project;

public class Node  {
    
    Node left;
    Node right;
    int freq;
    char ch;
    String code;
    
    public Node( char c, int f){
        freq=f;
        ch=c;
    }
    
    public void display(){
        System.out.println("char "+ ch + " freq "+ freq);
    }
     
}
