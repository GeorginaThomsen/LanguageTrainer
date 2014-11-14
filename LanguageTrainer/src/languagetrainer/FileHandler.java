package languagetrainer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cookie
 */
public class FileHandler {
    
    public static ArrayList <WordsPair> load(String newfile){
        ArrayList<WordsPair> temp = new ArrayList();
        ArrayList<String> tempLoad = new ArrayList();
        
        try {
            FileReader fileReader = new FileReader(newfile);// a BufferedReader needs a FileReader
            BufferedReader br = new BufferedReader(fileReader);
            
            String line;
            while((line = br.readLine())!= null){
               tempLoad.add(line);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for (String stringWord : tempLoad) {
            String[] words = stringWord.split(",");
            WordsPair tempPerson = new WordsPair( words[0], words[1]);
            temp.add(tempPerson);
        }
        
        
        
        return temp;
    }
    public static boolean saveNewWord(ArrayList<WordsPair> stringArray, String filename) {
        if (stringArray == null) {
            return false;
        }  //Checking parameter for null.
        FileWriter output;  //Creating reference for filewriter.

        try {
            output = new FileWriter(new File(filename));  //Opening connection to file.
            for (WordsPair pair : stringArray) {   //running through the ArrayList.                    
                output.write(pair.toString() + "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
    }
    
    
//    public ArrayList<WordsPair>Save(String filename){
//        ArrayList<WordsPair> temp = new ArrayList();
//        ArrayList<String> tempLoad = new ArrayList();
//        
//        try{ FileWriter fileWriter = new FileWriter(new File(newfile);
//            for (String stringWord : tempLoad) {
//                String[] words = stringWord.split(",");
//            WordsPair tempPerson = new WordsPair( words[0], words[1]);
//            temp.
//            }
//        
//        }
//        
//        
//        
//        
//        
//        return temp;
//        
//    }
}
