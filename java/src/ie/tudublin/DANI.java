package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

	public void loadFile(){

		String line = "";

		loadStrings("small.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words

		for (Follow f < )

		//w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		//s.toLowerCase() // Convert a string to lower case
	}

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
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
        
	}
}
