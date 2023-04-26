// pwd OOP-2023-Starter/java/src/ie/tudublin

package ie.tudublin;

import java.io.File;
import java.io.Reader;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.TableRow;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	ArrayList<Word> word_array = new ArrayList<Word>();
	ArrayList<Follow> follow_array = new ArrayList<Follow>();


	public void loadFile(){

		String[] file = loadStrings("small.txt");
		for(String s:file){
			System.out.println("s");
			Word w = new Word(s);
			word_array.add(w);
		}


	}

    public String[] writeSonnet()
    {
		loadFile();
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
			System.out.println(w);
		}
	}

	void loadModel(){
		for (Word w: word_array){
			System.out.println(w);
		}
	}

	public void keyPressed() {
		if (keyCode == ' '){
			writeSonnet();
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		loadFile();
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
