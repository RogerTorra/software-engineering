/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import dictionary.Dictionary;
import dictionary.DictionaryImpl;
import org.junit.Before;

/**
 *
 * @author rtv1
 */
public class OneWordDictionay {
    private  Dictionary dict;
    public OneWordDictionay() {}
    
    @Before
    void initDictionary(){
        dict = new DictionaryImpl();
        dict.defineWord("exist", "definition");
    }
    
    @Test
    void it_contains_the_added_word(){
        List<String> definitions = dict.getDefinitions("exist");
    }
}