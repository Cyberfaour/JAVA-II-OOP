/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writedatawithautoclose;

/**
 *
 * @author Cyberfaour
 */
public class WriteDataWithAutoClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        java.io.File file=new java.io.File("Scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
            
        }
        
        try
            (java.io.PrintWriter output=new java.io.PrintWriter(file);){
            output.print("Ali Faour");
            output.print(21);
           } 
        }
    }
    

