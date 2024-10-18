package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FileSample {
    static Scanner inputFile;
    static PrintWriter outputFile;
   static String rowData,lName,fName,name;
   static String [] specificRow = new String[6];
   static double q1,q2,q3,q4,agentSalesAve,totalSales=0,totalSalesAve;
   static int agentCounter =0; 
 static  DecimalFormat df = new DecimalFormat("$##,###.00");
	public static void main(String[] args) throws FileNotFoundException {
	 
	  openFile();
	  processFile();
	  closeFile();
	}
   static void openFile() throws FileNotFoundException {
	   inputFile = new Scanner(new FileReader("../first/src/fileHandling/SalesData.csv"));
	   outputFile = new PrintWriter("../first/src/fileHandling/SalesReport.txt");
   }
   static void closeFile() {
	   inputFile.close();
	   outputFile.close();
   }
   static void processFile() {
	   printHeader();
	   while(inputFile.hasNext()) {
		  rowData = inputFile.nextLine();
		  specificRow = rowData.split(",");
		  
		  lName = specificRow[0];
		  fName = specificRow[1];
		  name = lName +", " + fName;
		  
		  q1 = Double.parseDouble(specificRow[2]);
		  q2 = Double.parseDouble(specificRow[3]) ;
		  q3 = Double.parseDouble(specificRow[4]) ;
		  q4 = Double.parseDouble(specificRow[5]) ;
		  agentSalesAve = (q1+q2+q3+q4)/4;
		  totalSales +=agentSalesAve;
		 
		  outputFile.println(name+"\t"+df.format(q1)+"\t"+df.format(q2)+"\t"+df.format(q3)+"\t"+df.format(q4)+"\t"+df.format(agentSalesAve));
		  agentCounter++;
		  
	
	   }
	   totalSalesAve = totalSales/agentCounter;
	   outputFile.println("Overall Average Sales of Agent for the year: "+ df.format(totalSalesAve));
   }
   static void printHeader() {
	   outputFile.println("Moon Life");
	   outputFile.println("Agent's Quarterly Report");
	   outputFile.println("Agent Name\tQuarter1\tQuarter2\tQuarter3\tQuarter4\tAverage Sales");
	   outputFile.println();
   }
}
