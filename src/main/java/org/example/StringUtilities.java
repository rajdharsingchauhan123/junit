package org.example;

import java.util.HashSet;

public class StringUtilities {

    HashSet<Character>lowerCaseVowel1=new HashSet<>();
    HashSet<Character>upperCaseVowels=new HashSet<>();

    public StringUtilities(){
        lowerCaseVowel1.add('a');
        lowerCaseVowel1.add('b');
        lowerCaseVowel1.add('c');
        lowerCaseVowel1.add('d');
        lowerCaseVowel1.add('e');
        lowerCaseVowel1.add('f');
        lowerCaseVowel1.add('g');
        upperCaseVowels.add('A');
        upperCaseVowels.add('B');
        upperCaseVowels.add('C');
        upperCaseVowels.add('D');



    }
    public int vowelCount(String s){
        int count =0;
        if(s==null){
            return 0;

        }
        for (int i=0;i<s.length();i++){
            if(lowerCaseVowel1.contains(s.charAt(i))){
                count++;
            } else if (upperCaseVowels.contains(s.charAt(i))) {
                count++;
                
            }
        }
        return count;
    }
    public boolean isCapitalized(String s){
        if(s==null || s.length()==0){
            return false;
        }
        else
            return (upperCaseVowels.contains(s.charAt(0)));
    }
    public static void main(String[] args) {

    }
}
