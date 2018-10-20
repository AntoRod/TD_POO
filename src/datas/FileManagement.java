package datas;

import java.io.*;

public class FileManagement {
	
	//ATTRIBUTS
	//??
	
	/*CONSTRUCTEURS*/
	public FileManagement() {
		
	}
	/*FIN CONSTRUCTEURS*/
	/*PAS DE GETTERS*/
	/*PAS DE SETTERS*/
	/*PAS DE TOSTRING*/
	/*AUTRES METHODES*/
	//Permet d'�crire une phrase dans un fichier et permet de choisir si on doit �crire par dessus ou � la fin du fichier
	public void writeInFile(File file, String sentence, Boolean append) throws IOException {
		//On utilise un BufferedWriter pour �crire dans le fichier
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, append));
		//On �crit la phrase
		bw.append(sentence);
		//On peut pr�ciser ou non ce qui a �t� �crit
		System.out.println("Added \n  "+sentence+"    to the file '"+file+"'");
		//Ne pas oublier de flush/close le Buffer
		bw.flush();
		bw.close();
	}
	//Permet d'�crire une phrase dans un fichier en r��crivant par dessus
	public void writeInFile(File file, String sentence) throws IOException {
		writeInFile(file, sentence, false);
	}
	//Permet d'�crire une phrase dans un fichier en donnant le nom du fichier
	public void writeInFile(String fileName, String sentence) throws IOException {
		writeInFile(new File(fileName), sentence, false);
	}
	//Permet d'�crire une phrase dans un fichier en donnant le nom du fichier et permet de choisir si on doit �crire par dessus ou � la fin du fichier
	public void writeInFile(String fileName, String sentence, Boolean append) throws IOException {
		writeInFile(new File(fileName), sentence, append);
	}
	//Permet de lire le contenu d'un fichier ligne par ligne
	public void readFile(File file) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
	
	
	/*FIN AUTRES METHODES*/

}
