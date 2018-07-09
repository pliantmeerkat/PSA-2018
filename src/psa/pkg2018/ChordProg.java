/*
 * this class conatins all code for the ChordProg (chord progression) object
 * any chordprog object must contain at least 4 chords and a fixed length
 */
package psa.pkg2018;

/**
 *
 * @author jack branch
 */
public class ChordProg {
    
    //instance vars
    public String [] Chords; //array of chords - may include pointers to chords
    public int Length; // total length of progression
    public int Quantize; // represents the step - ie 1/8, 1/4, 1/2, 1, bars 
    
    public ChordProg(String [] chords, int length, int quant)
    {
        Chords = chords;
        Length = length;
        Quantize = quant;
    }
    
    
}
