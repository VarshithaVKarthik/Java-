package com.Exception.Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Buffer { 
 public void bf()
 {
	 try {
		BufferedReader bf=new BufferedReader(new FileReader("c:txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	public static void main(String[] args) {
		Buffer t=new Buffer();
		t.bf();

	}

}
