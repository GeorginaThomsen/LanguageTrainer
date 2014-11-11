/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagetrainer;

import java.util.ArrayList;

/**
 *
 * @author Cookie
 */
public class WordsPair {

    private String dkWord;
    private String engWord;
    
    public WordsPair(String dkWord, String engWord) {
        this.dkWord = dkWord;
        this.engWord = engWord;
    }

    @Override
    public String toString() {
        return dkWord + "," + engWord;
    }

    public String getDkWord() {
        return dkWord;
    }

    public String getEngWord() {
        return engWord;
    }
    
    

}