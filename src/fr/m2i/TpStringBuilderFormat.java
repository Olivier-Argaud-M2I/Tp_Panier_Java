package fr.m2i;

import java.time.LocalDate;
import java.util.regex.Pattern;

import fr.m2i.util.SaisieConsole;

public class TpStringBuilderFormat
{

    public static final Pattern EMAIL;

    static{
        // pattern compile donc plus rapide qu'un string quand on veux s'en resservir
        EMAIL = Pattern.compile("^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$");
    }

    public TpStringBuilderFormat(){


    	/*

//		        StringBuilder

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello world!");
        stringBuilder.append(" Comment allez vous?");
        stringBuilder.insert(0,">>");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        String test = "Hello";
        String test2 = ",";
        String test3 = " there";

        String test4 = test + test2 + test3;
        String test5 = new StringBuilder().append(test).append(test2).append(test3).toString();

        System.out.println(test4);
        System.out.println(test5);

//		        String.format()

        String exemple = "the world";
        String message = String.format("Hello %s",exemple);
        
        */
    	
    	
    	
//        SaisieConsole saisieConsole = new SaisieConsole();
//        String test = "   cher mr [NOM], vous achetez [X] articles au prix de [PRIX]$";
//
//        String nom;
//        Integer quantite;
//        Integer prixTotal;
//
//        System.out.println("veuillez saisir votre nom ");
//        nom = saisieConsole.text();
//        System.out.println("veuillez saisir la quantité ");
//        quantite = saisieConsole.entier();
//        System.out.println("veuillez saisir le prix total ");
//        prixTotal = saisieConsole.entier();
//
//        StringBuilder sb = new StringBuilder();
//
//
//        String test2 = String.format("   cher mr %s, vous achetez %s articles au prix de %S$",nom,quantite,prixTotal);
//
//
//        System.out.println(test2);

        
        String sortie = String.format("%1$tB %1$tY", LocalDate.now());
    	System.out.println(sortie);
    	
    	String test7 = "world";
    	test7.matches("world");
    	
    	String test8 = "woold";
    	// character o , r ou x 
    	test8.matches("wo[orx]ld");
    	// n'importe quel character entre a et z
    	test8.matches("wo[a-z]ld");
    	// pour exclure tous les charcarter entre a et z ( chiffre autorisé
    	test8.matches("wo[^a-z]ld");

    	
    	String test9 = "world truc";

        System.out.println(test9.matches("world\\Struc"));
        // doit avoir autant de character que de point
        System.out.println(test9.matches(".........."));
        // doit avoir 10 character quelqu'ils soient
        System.out.println(test9.matches(".{10}"));
        // doit contenir dix lettre entre a et z
        System.out.println(test9.matches("[a-z]{10}"));

        String test10 = "olivier@gmail.com";
        System.out.println(test10.matches("^[\\w-\\.]+@([\\w-\\.])+[\\w-]{2,4}$"));

        System.out.println(test10.matches(EMAIL.toString()));

    }
	
}
