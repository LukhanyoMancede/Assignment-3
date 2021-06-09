package za.ac.cput.assignment.assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *Lukhanyo Mancede
 *217139205
 *ADP 2 Assignment 3
 */
public class ReadStakeholderSer {
         public static void main(String args[])  {
    File f = new File("customerOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Customer> deserializedCustomer = (ArrayList<Customer>) ois.readObject();
        
        System.out.println("==========================CUSTOMERS===================================================================================================");
        System.out.println("  ID   "+"          Name   "+"         Surname   "+ "      Address   "       + "      Date of birth "+"  Credit "+ "         Can't Rent");
        System.out.println("======================================================================================================================================");
        
        Iterator<Customer> iter = deserializedCustomer.iterator();
        while (iter.hasNext()){
            Customer a = iter.next();
            System.out.println(a.toString());
        }
           
     
        
      
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
    }      catch (IOException ex) {
               ex.printStackTrace();
           } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
           }
}
}