package fr.m2i;

import fr.m2i.model.Article;
import fr.m2i.model.Panier;

public class TpEquals {

    public TpEquals() {

        Panier panier1 = new Panier();
        Panier panier2 = new Panier();

        Article article1 = new Article(2,1,"maxime");
        Article article2 = new Article(10,2,"melvin");
        Article article3 = new Article(5,3,"olivier");
        Article article4 = new Article(99,4,"fred");

        panier1.setListeArticle(new Article[]{article1, article2, article3});
        panier2.setListeArticle(new Article[]{article1, article2, article3, article4});

        System.out.println(panier1);
        System.out.println(panier2);
        System.out.println("premier test equals : " +panier1.equals(panier2));

        try{
            Panier panier3 = (Panier) panier2.clone();
            System.out.println(panier2);
            System.out.println(panier3);
            System.out.println("test equals clone : " +panier2.equals(panier3));

        }catch(CloneNotSupportedException e){
            System.out.println("probleme de clonage");
        }




    }
}
