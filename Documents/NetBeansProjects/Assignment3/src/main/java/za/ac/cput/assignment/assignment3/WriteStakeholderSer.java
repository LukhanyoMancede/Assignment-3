package za.ac.cput.assignment.assignment3;

/**
 *Lukhanyo Mancede
 * 217139205
 * ADP Assignment 3
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class WriteStakeholderSer {
    public static void main(String args[])  {
        Customer c;
        ArrayList<Customer> vec = new ArrayList<>();
         vec.add(new Customer(" C150 ", " Luke ", " Atmyass ", " Bellville ", " 27 Jan 1981 ", 1520.50, false));
         vec.add(new Customer(" C130 ", " Stu ", " Padassol ", " Sea Point ", " 18 May 1987 ", 645.25, true));
         vec.add(new Customer(" C100 ", " Mike ", " Rohsopht ", "`Bellville ", "24 Jan1993", 975.10, true));
         vec.add(new Customer(" C300 ", " Ivana.B ", " Withew ", " Langa ", " 16 Ju 1998 ", 1190.50, false));
         vec.add(new Customer(" C250 ", " Eileen ", " Sideways ", " Nyanga ", " 27 Nov 1999 ", 190.85, true));
         vec.add(new Customer(" C260 ", " Ima ", " Stewpidas  ", " Atlantis ", " 27 Jan 2001 ", 1890.70, true));
      
         File d = new File("customerOutFile.txt");
        try {
            FileOutputStream foS = new FileOutputStream(d);
            ObjectOutputStream ooS = new ObjectOutputStream(foS);
            ooS.writeObject(vec);
            ooS.close();
            System.out.println("Data Inputed Successfully");
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
          ex.printStackTrace();
        }   
    }
}

    
