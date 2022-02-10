/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 *
 * @author Ivey
 */
public class RomanNumerals {
    //VARIABLES

    //holds the roman numerals in an array
    private List<Character> numerals;

    //CONSTRUCTORS
    public RomanNumerals(List<Character> numerals){
        this.numerals = numerals;
    }

    //GETTERS
    public List<Character> getNumerals(){
        return numerals;
    }

    //SETTERS
    public void setNumerals(List<Character> numerals){
        this.numerals = numerals;
    }
    
    //METHODS

    //converts list of Roman numerals into a decimal amount
    public int convertNumeral(List<Character> numerals){
        int totalValue = 0;
        int i = 0;
        int k = 1;
        int nextVal = 0;
        int currentVal = getRomanNumVal(numerals.get(i));
        ListIterator<Character> list = numerals.listIterator(k);
        
        if(!list.hasNext()){
            return totalValue =+ currentVal;
        }else{
            while(list.hasNext()){
                nextVal = getRomanNumVal(list.next());
                if(currentVal < nextVal){
                   totalValue += nextVal - currentVal;
                }else{
                    totalValue += currentVal + nextVal;
                }
                i++;
                currentVal = getRomanNumVal(numerals.get(i));
            }
        }
        return totalValue;
    }

    //returns the value of each Roman numeral
    private int getRomanNumVal(char letter){
        int value = 0;
        switch(letter){
                case 'M':
                    value = 1000;
                break;

                case 'D':
                    value = 500;
                break;

                case 'C':
                    value = 100;
                break;

                case 'L':
                    value = 50;
                break;

                case 'X':
                    value = 10;
                break;

                case 'V':
                    value = 5;
                break;
                
                case 'I':
                    value = 1;
                break;
        }
        return value; 
    }
}


    

    
    

