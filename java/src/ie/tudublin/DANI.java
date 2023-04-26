// pwd OOP-2023-Starter/java/src/ie/tudublin

package ie.tudublin;

import java.io.File;
import java.io.Reader;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	String[] file;
	ArrayList<Word> word_array = new ArrayList<Word>();
	ArrayList<Follow> follow_array = new ArrayList<Follow>();


	public void loadFile(){

		String line = "";

		file = loadStrings("small.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		//word_array.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
		//word_array.word.toLowerCase(); // Convert a string to lower case
	}

    public String[] writeSonnet()
    {
        return null;
    }

	public boolean foundWord(String s){
		for (Word w: word_array){
			if (w.word == s){
				return true;
			}
		}
		return false;
	}

	public void setup() {
		colorMode(HSB);

       
	}

	void printModel(){
		for (Word w: word_array){
			System.out.println(w, Follow);
		}
	}

	void loadModel(){

	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		printModel();
		loadModel();

		float x = 500, y = 200;

		int i = 0;

        //text(sonnet[1], x, y);
	}

    public String getWord_array() {
        return null;
    }

    public int getFollow() {
        return 0;
    }
}
