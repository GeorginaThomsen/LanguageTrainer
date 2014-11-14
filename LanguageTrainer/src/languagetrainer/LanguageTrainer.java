/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package languagetrainer;

import java.util.ArrayList;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Cookie
 */
public class LanguageTrainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WordPairController wordPairController = new WordPairController();
//        private ArrayList<WordsPair> newWordList;
//        WordsPair wordspair;
        
        
        wordPairController.load("newfile.txt");
        
    }
    }
         
       
    

