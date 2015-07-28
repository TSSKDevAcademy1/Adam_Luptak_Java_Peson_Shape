package projekt;

import java.io.Console;
import java.util.Arrays;

public class Main {

	public static void main(String[] ar) {

		Person clovek = new Person();
		clovek.setName("marcom");

		Person p2 = new Person(12, "sdfsfd");

		System.out.println(clovek.setAge(50));//varati ci je zadany vek validny

		System.out.println(clovek.toString());// vypise meno a vek

		System.out.println(" ");
		
		Triangle tr = new Triangle();//vytvori isntanciu  trojuholnik

		tr.setSize(10);//nastavi trojuholnik z tr.setSize(pocetriadkov)

		System.out.println(tr.toString());//vykresli trojuholnik

		System.out.println(" ");

		Line l = new Line(10, true);// vytvori novu instanciu Line ciara

		System.out.println(l.toString());//vykresli vytvorenu instanciu

		Square s = new Square(5);//vytvori novu isntaciu stvorca

		System.out.println(s.toString());//vykresli stvorec

		Rectangle r = new Rectangle();// vytvori novu instaciu  obdlznik

		r.setHeight(10);// nastavi vysku obdlaznika
		r.setWidth(20);// nastavi sirku obdlznika

		System.out.println(r.toString());// vykreslenie obdlznika

	}

}

/*
 * 
 * experimenty s HelloWorld 3x vypis HelloWorld vynechat public, static run time
 * zmenit args na x zmenit main na start run time zmenit println na print zmenit
 * HelloWorld na Helloworld - compilation identifikovať, ktoré chyby boli
 * kompilačné a ktoré až pri spustení
 * 
 * 
 */




