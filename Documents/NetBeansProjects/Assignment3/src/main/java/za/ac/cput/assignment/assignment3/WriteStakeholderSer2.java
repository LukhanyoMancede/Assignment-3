package za.ac.cput.assignment.assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Lukhanyo Mancede
 * 217139205
 * ADP 2 Assignment
 */
public class WriteStakeholderSer2 {
     public static void main(String args[])  {    
       
        Supplier a;
        
        ArrayList<Supplier> vec = new ArrayList<>();
        
        vec.add(new Supplier(" S270 ", " Grand Theft Auto ", " Toyota ", " Mid-size sedan "));
        vec.add(new Supplier(" S400 ", " Prime Motors ", " Lexus ", " Luxury sedan "));
        vec.add(new Supplier(" S300 ", " We got Cars ", " Toyota ", " 10-seater minibus "));
        vec.add(new Supplier(" S350 ", " Auto Delight ", " BMW ", " Luxury SUV "));
        vec.add(new Supplier(" S290 ", " MotorMania ", " Hyundai ", " compact budget "));
         
         
        File s = new File(" supplierOutFile.txt ");
        try {
            FileOutputStream foS = new FileOutputStream(s);
            ObjectOutputStream ooS = new ObjectOutputStream(foS);
            ooS.writeObject(vec);
            ooS.close();
            System.out.println("Data inputed successfully");
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
    
       }
}
