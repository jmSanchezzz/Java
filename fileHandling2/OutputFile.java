package fileHandling2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputFile {
static Scanner reader;
static File file;
static FileWriter fw1,fw2;
static int wordCount = 0;
	public static void main(String[] args) {
		openFile();
		appendFile();
		printFile();
		writeFile();
		closeFile();

	}
	static void openFile() {
		try {
			file = new File("../first/SampleText.txt");
			reader = new Scanner(new FileReader(file));
			fw1 = new FileWriter("../first/src/SampleOutputText.txt",true);
			fw2 = new FileWriter(file,true);
		}catch(IOException e){
			 System.out.println("Reading the file failed.");
	           System.exit(0);
		}
	}
	static void printFile() {
		String perLine,words[];
		try {
		while(reader.hasNext()) {
			perLine = reader.nextLine();
			words = perLine.trim().split(" ");
			wordCount+=words.length;
		}	
		}catch(Exception e){
			 System.out.println("Reading the file failed.");
	           System.exit(0);	
		}
		System.out.printf("File length: %d%n",file.length());
		System.out.printf("Specific path: %s%n",file.getAbsolutePath());
		System.out.printf("Number of words: %d",wordCount);
		
	}
	static void writeFile() {
	    try {
	        fw1.write("File length: " + file.length() + "\n");
	        fw1.write("Specific path: " + file.getAbsolutePath() + "\n");
	        fw1.write("Number of words: " + wordCount + "\n");
	    } catch (IOException e) {
	        System.out.println("Writing the file failed.");
	        System.exit(0);
	    }
	}
	static void appendFile() {
		try {
			fw2.write("\nThis little light of mine, I’m gonna let it shine");
		} catch (IOException e) {
			System.out.println("Writing the file failed");
		}
	}
	static void closeFile() {
		reader.close();
		try {
			fw1.close();
			fw2.close();
		} catch (IOException e) {
		}
	}
	}

