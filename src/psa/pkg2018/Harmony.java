/*
 * this class contains all core harmony code, this will be used by the various
 * harmonic functions used for chord generation
 * IPORTANT :: any uses of the Key_Dict method must re-assign the object type 
 * when called, example : String s; s = (String) Key_Dict("A");
 */
package psa.pkg2018;
import java.util.*;

/**
 *
 * @author jackt
 */
public class Harmony {
    
    public Chord CChord ; // current chord 
    // public ChordProg Cprog; // wip
    
    // initialise method
    public Harmony(Chord chord)
    {
        CChord = chord;
    }
    /* object has been used as it allows for one function to both access chord
    * strings and numeric values 
    */    
    /* private */ Object Key_Dict(Object note) // to allow for both uses
    {          
        Map<String, Integer> NumKey = new HashMap(); // hash for numbers/keys
        
        // hash map Keys/ values assignment - lower case = natural
        // upper case = sharpened: A = A#, a = A
        NumKey.put("a", 1); // a natural
        NumKey.put("A", 2); // a#
        NumKey.put("b", 3); // b natural
        NumKey.put("c", 4); // etc..
        NumKey.put("C", 5);
        NumKey.put("d", 6);
        NumKey.put("D", 7);
        NumKey.put("e", 8);
        NumKey.put("f", 9);
        NumKey.put("F", 10);
        NumKey.put("g", 11);
        NumKey.put("G", 12); // g#   
        
        if (NumKey.get(note) == null) // switch to key obtain
        {
            for (Map.Entry<String, Integer> ent : NumKey.entrySet()) {
                if (ent.getValue().equals(note)) { 
                    return(Object) ent.getKey(); 
                }
            }
        }
        
        return (Object) NumKey.get(note);
    }
    
    
    
    
}
