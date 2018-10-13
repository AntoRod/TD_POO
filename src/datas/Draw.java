package datas;

import java.util.ArrayList;
import java.util.Iterator;

public class Draw {
	
	//ATTRIBUTS
	//Une ArrayList pour stocker les figures abstraites
	ArrayList<AbstractFigure> draw;
	
	/*CONSTRUCTEURS*/
	public Draw() {
		draw = new ArrayList<AbstractFigure>();
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public ArrayList<AbstractFigure> getDraw() {
		return draw;
	}
	public AbstractFigure getFigure(int indice) {
		return draw.get(indice);
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS*/
	/*TOSTRING*/
	public String toString() {
		String string = "List:\n";
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			string+= "{"+iterator.next().toString()+"}";
		}
		string+="\n";
		return string;
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Ajouter une figure à la liste
	public void addFigure(AbstractFigure newFigure) {
		draw.add(newFigure);
	}
	//Enlever une figure de la liste
	public void removeFigure(int indice) {
		//Si la figure existe, l'enlever
		if(!draw.get(indice).equals(null)) draw.remove(indice);
		//Plus tard ?? (sinon lancer une erreur)
	}
	//Calcul de la somme des surfaces de la liste
	public double calculateSumArea() {
		double sum = 0;
		//Utilisation d'Itérator (while hasNext: Next)
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			//Ajout du calcul de la surface de chaque figure à la somme
			sum+=iterator.next().calculateArea();
		}
		return sum;
	}
	//Calcul de la somme des périmètres de la liste
	public double calculateSumPerimeter() {
		double sum = 0;
		//Utilisation d'Itérator (while hasNext: Next)
		Iterator<AbstractFigure> iterator = draw.iterator();
		while(iterator.hasNext()) {
			//Ajout du calcul du périmètre de chaque figure à la somme
			sum+=iterator.next().calculatePerimeter();
		}
		return sum;
	}
	/*FIN AUTRES METHODES*/
}
