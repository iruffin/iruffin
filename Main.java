/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
/**
 *
 * @author Ivey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Character> l = new ArrayList();
        l.add('M');
        l.add('D');
        RomanNumerals r = new RomanNumerals(l);
        System.out.println(r.convertNumeral(l));  
    }

}
