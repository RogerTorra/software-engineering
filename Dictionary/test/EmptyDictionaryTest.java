/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import dictionary.DictionaryImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import dictionary.Dictionary;
import dictionary.*;

/**
 *
 * @author rtv1
 */
public class EmptyDictionaryTest {
        
    @test(expected= NotDefinedExeption.class)
       public void it_contains_no_words(){
           Dictionary dict = new DictionaryImpl();
           dict.getDefinitions("");
       }
}