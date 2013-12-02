/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.List;

/**
 *
 * @author rtv1
 */
public interface Dictionary {
    void defineWord(String word, String definition);
    List<String> getDefinitions(String word);
    
    
}
