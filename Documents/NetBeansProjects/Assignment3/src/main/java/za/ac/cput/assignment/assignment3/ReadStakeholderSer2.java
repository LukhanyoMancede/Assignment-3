package za.ac.cput.assignment.assignment3;

/**
 * Lukhanyo Mancede
 * 217139205
 * ADP 2 Assignment 3
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadStakeholderSer2 {
         public static void main(String args[])  {
    File f = new File("supplierOutFile.txt");
    try{
        FileInputStream fiS = new FileInputStream(f);
        ObjectInputStream oiS = new ObjectInputStream(fiS);
        ArrayList<Supplier> deserializedSupplier = (ArrayList<Supplier>) oiS.readObject();
        System.out.println("====================SUPPLIERS=====================");
        System.out.println(" ID "+"  Name  "+"   Prod Type   "+"  Discription  ");
        System.out.println("==================================================");
       
       
        Iterator<Supplier> iter = deserializedSupplier.iterator();
        while (iter.hasNext()){
            Supplier b = iter.next();
            System.out.println(b.toString());
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

