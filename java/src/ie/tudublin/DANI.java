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

		int i = 0;

		String[] file = loadStrings("filename.txt");
		for( String s:file){
			Word w = new Word(s);
		}


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
}
