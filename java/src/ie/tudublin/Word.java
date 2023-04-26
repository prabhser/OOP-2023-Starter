package ie.tudublin;

import java.util.ArrayList;

public class Word {


    ArrayList<Follow> follow_array = new ArrayList<Follow>();
    String word;

    //@Override
    public String toString(){
        for(Follow f:follow_array)
            System.out.println("IN WORD: follow = " + f + ", word = " + word);
            return "done"; 
    }

    public Word(String w){

    }

    public Word(String w, Follow f){
        this.word = word;
        this.follow_array = follow_array;
    }


    public String getWord(){
        return word;
    }

    public void setWord(){
        this.word = word;
    }

    public ArrayList getFollowArray(){
        return follow_array;
    }

    public void setFollowArray(){
        this.follow_array = follow_array;
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
