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

    private ArrayList<WordsPair> newWordList;

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
        Object obj = context.lookup;
                
    }

    @Override
    public boolean load(String filename) {

    }

    @Override
    public boolean save(String filename) {

    }

    @Override
    public void clear() {
        newWordList.clear();
    }

}
