package hope;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.lang.*;

public class openFile {

	private Formatter x;
	
	public void openFile() 
	{
		try
		{
			x = new Formatter("rgb.txt");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public void addRecords(int rgb1,int rgb2,int rgb3)
	{
		
		x.format(Integer.toString(rgb1)+" " +Integer.toString(rgb2)+" " + Integer.toString(rgb3), null);
	}
	public void closeFile()
	{
		x.close();
	}
}
