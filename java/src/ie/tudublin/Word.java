package ie.tudublin;

import java.util.ArrayList;

public class Word {


    ArrayList<Follow> follow_array = new ArrayList<Follow>();
    String word;

    @Override
    public String toString(){
        return "IN WORD: follow = " + follow_array + ", word = " + word;
    }

    void Word(String word, int count){
        for (Follow f:follow_array){
            System.out.println(f);
        }
    }

    public boolean foundFollow(String s){
        for (Follow f: follow_array){
            if (f.getWord() == s){
                return true;
            }
        }
        return false;
	}
}
