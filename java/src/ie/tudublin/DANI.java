// pwd OOP-2023-Starter/java/src/ie/tudublin

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	ArrayList<Word> word = new ArrayList<Word>();


	public void loadFile(){

		String line = "";

		loadStrings("small.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		//w.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
		//s.toLowerCase() // Convert a string to lower case
	}

    public String[] writeSonnet()
    {
        return null;
    }

	public boolean foundWord(String s){
		for (Word w: word){
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
		for (Word w: word){
			System.out.println(w);
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

		text("HELLO!", x, y);
        
	}

    public String getWord() {
        return null;
    }

    public int getFollow() {
        return 0;
    }
}
