package com.github.CaioWatzko.Aula05;

import java.io.FileWriter;
import java.io.IOException;

public class Editor {

	public static void main(String[] args) {
		
		try {
			FileWriter FReader = new FileWriter("pessoas.txt");
			BufferedReader Reader = new BufferedReader(FReader);
			FReader.append('m');
			FReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
