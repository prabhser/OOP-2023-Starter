package ie.tudublin;

import java.io.File;
import java.util.ArrayList;

import processing.data.TableRow;



public class Follow {

    private String word;
    private int count;

    @Override
    public String toString(){
        return "word = " + word + ", count = " + count;
    }

    public Follow(DANI d){

        this(
            d.getWord(),
            d.getFollow()
        );
    }

    public Follow(String word, int count){
        this.word = word;
        this.count = count;
    }

    public String getWord(){
        return word;
    }

    public void setWord(){
        this.word = word;
    }

    public int getCount(){
        return count;
    }

    public void setCount(){
        this.count = count;
    }
}
