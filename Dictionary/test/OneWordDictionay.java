/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import dictionary.Dictionary;
import dictionary.DictionaryImpl;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;

/**
 *
 * @author rtv1
 */
public class OneWordDictionay {
    private  Dictionary dict;
    public OneWordDictionay() {}
    
    @Before
    public void initDictionary(){
        dict = new DictionaryImpl();
        dict.defineWord("exists", "definition");
    }
    
    @Test
    public void it_contains_the_added_word(){
        List<String> definitions = dict.getDefinitions("exists");
        List<String> expected = Arrays.asList("definition");
        assertEquals(expected, definitions);
    }
}