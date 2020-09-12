
package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HuffmanTree {

    String str=""; 
    int countArraySize = 0;
    Node[] tempArr;
    String c ="";
   static Node[] arr;
   String s= "";
   int size;
   
   public String Decode(Node root, String s){
       // root arr.length-1
       System.out.println("root "+ root.ch );
       System.out.println("String s: "+ s);
       System.out.println("S length: "+ s.length());
       System.out.println("Size: "+ size);
       Node r = root;
       Node t = root;
         char c;
         String decode="";
       for(int i =size; i<s.length();){
           t = r;
           while(t.left !=  null && t.right != null){
               c = s.charAt(i);
           if(c == '0' && t.left != null){
                t = t.left;
                i++;
              }
           else if(c == '1' && t.right != null){ 
               t = t.right;
               i++;
           } 
           }
           if(t.left == null && t.right== null){
              decode = t.ch  + decode ;
           }
           
           }
           System.out.println("Decoded: "+ decode);
             
     return decode ;
     
     }
   
   
   
   
    
     
    public void encode( Node T,  String s){
         if (T.left != null && T.right != null) {
            encode( T.left, s + "0" );
            encode( T.right, s + "1");
        } 
         else {
           arr[(int)T.ch].code = s;
        }
    }
    
        
    public String buildTree(Node arr [])throws IOException{
        //Node[] arr = count(s);
        System.out.println("Building treee \n");
       //    Build_Heap(arr); 
        sort(arr);
        
        for (int i = 0; i < arr.length -1 ; i++) {
            Node node = new Node('*', arr[i].freq+ arr[i+1].freq );
            node.left=arr[i];
            node.right=arr[i+1];
            arr[i+1]=node;
           
          //  Build_Heap(arr);
            sort(arr);
        }
       
        encode(arr[arr.length-1], "");
        // display(arr);
         HuffCode(str);
                  System.out.println("Decode call");
       String xxx =  Decode(arr[arr.length-1],s);
         return xxx ;
      //  return arr[arr.length-1];
    }
    
    /*
    public void swap(Node[]arr , int L , int U){
       int temp = arr[L].freq ;
       arr[L].freq = arr[U].freq ;
       arr[U].freq = temp ;
       
    }
    public void reheap(Node[]arr , int L , int U){
        while(L<=0){
            int left = (2*L)+1 ;
            int right = (2*L)+2 ;
            if (left <= U && right <= U){
                if (arr[left].freq <arr[right].freq && arr[left].freq > arr[L].freq){
                    swap(arr,L,left);
                }
                else if (arr[right].freq <arr[left].freq && arr[right].freq > arr[L].freq){
                    swap(arr,L,right);
                }
                else {
                    return ;
                }
            }
            else if(left <=U && right <=U){
                if (arr[left].freq > arr[right].freq){
                    swap(arr,L,left);
                    L = left ;
                }
                else {
                    return ;
                }
            }
            else {
               return ; 
            }
        }
    } */
    
     void heapify(Node arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l].freq > arr[largest].freq)
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r].freq > arr[largest].freq)
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i].freq;
            arr[i].freq = arr[largest].freq;
            arr[largest].freq = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public void sort(Node arr[]){
      int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0].freq;
            arr[0].freq = arr[i].freq;
            arr[i].freq = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        } /* if (L<U){
            int p = partition(arr,L,U);
             if (L<p-1){
            sort(arr,L,p-1);
        }
             else if (U>(p+1)){
                 sort(arr.p+)
             }
        }
       */
        /*Heap sort : 
        int c, p ;
        for (int i = 1; i < arr.length; i++) {
            c =i ;
            p = (c-1)/2 ;
            while(c>0){
                if (arr[c].freq>arr[p].freq){
                    int temp = arr[c].freq ;
                    arr[c].freq = arr[p].freq ;
                    arr[p].freq = temp ;
                    
                }
                c = p ;
                p = (c-1)/2 ;
            }
        }
        for (int i = arr.length-1; i >0; i--) {
            swap(arr,0,i);
            reheap(arr,0,i-1);
        } */
       /* Bubble Sort  : 
        for (int i=0;i<arr.length;i++)
        {      
              Node temp =arr[i]; 
            for (int j= i-1; j>=0 && temp.freq<arr[j].freq ; j--)
            {
                arr[j+1]=arr[j]; 
                arr[j]=temp;
        }
        } */
    } 
    
    public void display(Node arr[] ){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != null && arr[i].code != null)
                System.out.println((char) i +" "+ arr[i].code);
        }
    }
    
    public String count(String s)throws IOException{
        str = s;
               arr = new Node[256];
        for (int i = 0; i < s.length() ; i++) {
            char cc = s.charAt(i);
            if(arr[(int) cc]== null) {
                Node n = new Node (cc,1);
                arr[(int) cc]=n;
                countArraySize++;
            }
            else{
                   arr[(int) cc].freq++;
            }
        }
     
        System.out.println("count "+ countArraySize);
        tempArr = new Node[countArraySize];
        int  k =0;
        for(int t =0; t<arr.length && k < tempArr.length ;t++){
             if(arr[t] != null){
               tempArr[k]= arr[t];
               k++;
             }
             
        }
        System.out.println("temparr");
         display(tempArr);
        String kk = buildTree(tempArr);
        return kk ;
    }
    
    
    
    public String HuffCode(String st)throws IOException{
         str = st;
         System.out.println(str);
       
        System.out.println("Display st arr");
       display(arr);
       for(int i =0; i< str.length();i++){
           char o= str.charAt(i);
         if(arr[(int) o] != null  &&   arr[(int) o].code != null){
             s = arr[(int) o].code+s; }
         else{
            String d =  Integer.toBinaryString(o);
             s= d+s;
         
            }
       }
       
       
        System.out.println("printing s "+ s);
        

   //     System.out.println("parse"+ Integer.parseInt(s, 8));
    // breaking string
    
    
    
    
    
        size = (8 - (s.length()%8) ); 
        System.out.println("Size: "+ size);        
      
        for (int i = 0; i < size; i++) {
            s= "0"+ s;
        } 
        
        System.out.println("s"+ s );
        System.out.println("s size"+s.length());
         String temp= "";
         String huff="";
         char c=' ';
         int i=0;
         
         while(i!=s.length()){
             
            temp= s.substring(i, i+8);
             System.out.println("temp"+temp);
            i=i+8; 
            c= (char) (Integer.parseInt(temp, 2)) ; 
            
            huff= huff+c;
        }
        
         temp= s.substring(s.length()-8);
             System.out.println("temp"+temp);
            
            c= (char) (Integer.parseInt(temp, 2)) ; 
            huff= huff+c;
            
            
         System.out.println("Huff: "+ huff);
            BinaryCount(huff);
         
    return huff ;
    
        
    }
    
    
    public int BinaryCount(String s)throws IOException{
        System.out.println("HuffMancoded length: " + s.length()*8);
        System.out.println("Original binary length: "+ str.length()* 8);
     str = s ;
        filing file = new filing();
     file.WriteTextFile(s);
     Huffman h = new Huffman();
       h.Chooser(s);
    return str.length()*8 ;
    }
}
