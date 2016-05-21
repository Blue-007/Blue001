package com.blue.test;
import java.io.*;
public class FileToUnicode {
	public static void main(String[] args)throws IOException{
		String s;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		while((s=reader.readLine())!=null){
			System.out.println("echo:"+s);
		}
	}
}
