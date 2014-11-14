/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagetrainer;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cookie
 */
public class WordPairController implements WordPairControlInterface {

    public ArrayList<WordsPair> newWordList;
    
//test
    @Override
    public void add(String question, String answer) {
        WordsPair w1 = new WordsPair(answer, question);
        newWordList.add(w1);
    }

    @Override
    public int size() {
        return newWordList.size();

    }

    @Override
    public String getRandomQuestion() {
        Random generator = new Random();
        int randomQ =  generator.nextInt(newWordList.size()-1);
        return newWordList.get(randomQ).getEngWord();

    }

    @Override
    public boolean checkGuess(String question, String quess) {

        for (WordsPair pair : newWordList) {
            if (pair.getEngWord() == question) {
                if (pair.getDkWord() == quess) {
                    return true;
                }
                return false;
            }
        }
        return false;

    }

    @Override
    public String lookup(String question) {
           for (WordsPair pair : newWordList) {
            if(pair.getEngWord()==question){
                return pair.getDkWord();
            }
        }
        return question;
                
                
    }

    @Override
    public boolean load(String filename) {
       newWordList = FileHandler.load(filename);
 
        return true;
    }
            
    @Override
    public boolean save(String filename) {
        return FileHandler.saveNewWord(newWordList, filename);

    }
    
    @Override
    public void clear() {
        newWordList.clear();
    }
        
}
