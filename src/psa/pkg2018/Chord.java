/*
 * This Class contains all created methods for the Chord object, and is intended
 * to handle any harmonic chord movments
 * chords will take the following format :
 *          - tonic - see tonic key for full formatting
 *          - tonality - "m" for major ; "M" for minor
 *          - modifier - 7th, 9th etc - see modifiers for full formatting
 * chords will use the modal system cerated in PSA-Express, see mode files 
 * for more infomation
 */
package psa.pkg2018;

/**
 *
 * @author Jack Branch
 */
public class Chord {
    
    // instance / intialization variables
    public String Tonic;
    public String Tonality;
    public String Modifier;
    
    // insatnce variable assign method
    public Chord (String Key, String Tone, String Mod)
    {
        Tonic = Key;
        Tonality = Tone;
        Modifier = Mod;
    }
}
