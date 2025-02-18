package thema3.schleifen.aufgaben;

import utils.IO;

public class Aufgabe22Programm {

	public static void main(String[] args) {

		double d = Double.POSITIVE_INFINITY; 
		while(d == d+1) {
			IO.writeln("läuft");
		}
	}
}
