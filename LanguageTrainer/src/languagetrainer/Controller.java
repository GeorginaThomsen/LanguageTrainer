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
public class Controller {

//    Attributes:
    private ArrayList<WordsPair> newWordList;
//    Constructer:

    public Controller() {
        newWordList = new ArrayList<Word>();
        loadWordFromFile();

    }

    private void loadWordFromFile() {
        //Load words from the file.
        //Put the words in ArrayList of newWordList:
//        ??????????

    }

    public void saveWords() {

    }

    public ArrayList<Word> giveMeAllWordsList() {
        //loadPeopleFromFile();
        return newWordList;
    }

    public void createNewWord(String dkWord, String engWord) {

        Word w = new Word(dkWord, engWord);
        //Adding to the list:
        newWordList.add(w);
        //Save the list !!!!!!!!!!!
        Word w = new Word(dkWord, engWord);

        newWordList.add(w);
        
        FileHandlerStat.saveWords(newWordList);

    }
