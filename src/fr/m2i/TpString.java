package fr.m2i;

import fr.m2i.util.SaisieConsole;

import java.nio.charset.StandardCharsets;

public class TpString {

    public TpString(){

        /*
        String exemple = "un exemple";

        char monCarac = exemple.charAt(0);
        System.out.println(exemple.length());
        System.out.println(monCarac);


        // effectue une copie -> deconseillé car consomme de la ressource
        for(char element : exemple.toCharArray()){
            System.out.println((char)element);
        }
        // ouvre un flux/stream pas de copie de tableau synthax a preferer
        exemple.chars().forEach(c -> System.out.println((char)c));

        // equals equalsIgnoreCase
        System.out.println("test equals "+exemple.equals("un exemple"));
        System.out.println("test equals 2 "+exemple.equals("un Exemple"));
        System.out.println("test equals 3 "+exemple.equalsIgnoreCase("un Exemple"));


        // compare
        String test = "a";
        System.out.println("compare "+test.compareTo("A"));
        // -1 -> inferieur  (dans l'ordre de la table ascii
        // 0 -> equals
        // positif -> superieur

        // deux ecriture equivalente car '+' fait appel a concat
        String nouveau = exemple.concat("").concat(" ");
        String nouveau2 = exemple + "" + " ";


        // contains
        System.out.println("contains "+ exemple.contains("un"));
        System.out.println("ends " + exemple.endsWith("un"));
        System.out.println("starts " + exemple.startsWith("un"));

        exemple.isEmpty();

        System.out.println(exemple.replace('e','a'));
        System.out.println(exemple.replace("un","deux"));

        System.out.println(exemple.substring(exemple.indexOf('e'),exemple.length()));

        // fait une copie du string
        String nouveau3 = new String(exemple);

        char[] tab = { 'a','b','c'};
        String nouveau4 = new String(tab);
        System.out.println(nouveau4);

        String test2 = "un\nexemple";
        System.out.println(test2);
        System.out.println(test2.length());
    */



    


        SaisieConsole saisieConsole = new SaisieConsole();
        String test = "   cher mr [NOM], vous achetez [X] articles au prix de [PRIX]$";

        String nom;
        Integer quantite;
        Integer prixTotal;

        System.out.println("veuillez saisir votre nom ");
        nom = saisieConsole.text();
        System.out.println("veuillez saisir la quantité ");
        quantite = saisieConsole.entier();
        System.out.println("veuillez saisir le prix total ");
        prixTotal = saisieConsole.entier();

        test = test.trim().replace("[NOM]",nom).replace("[X]",quantite.toString()).replace("[PRIX]$",prixTotal+"€");
        test = test.substring(0,1).toUpperCase() + test.substring(1,test.length());
        System.out.println(test);

    




    }
}

