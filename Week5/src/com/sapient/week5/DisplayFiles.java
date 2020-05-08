package com.sapient.week5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplayFiles {

	public void display(String path) throws IOException
	{
		Files.list(Paths.get(path)).forEach(System.out::println);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String p = s.next();
		DisplayFiles obj = new DisplayFiles();
		try{
			obj.display(p);
		}
		catch(IOException i)
		{
			System.out.println("Directory not found");
		}
		finally
		{
			s.close();
		}
	}

}
