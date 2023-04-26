package ie.tudublin;

import java.util.ArrayList;

public class Word {


    ArrayList<Follow> follow_a = new ArrayList<Follow>();
    String word;

    void Word(String word, int count){
        for (Follow f:follow_a){
            System.out.println(f);
        }
    }

    public boolean foundFollow(String s){
        for (Follow f: follow_a){
            if (f.getWord() == s){
                return true;
            }
        }
        return false;
	}
}
