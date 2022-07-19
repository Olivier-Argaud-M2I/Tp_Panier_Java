package fr.m2i.model;

import java.util.Arrays;

public class Panier implements Cloneable{

    private Article[] listeArticle;

    public Article[] getListeArticle() {
        return listeArticle;
    }

    public void setListeArticle(Article[] listeArticle) {
        this.listeArticle = listeArticle;
    }

    public Panier() {
    }

    public Panier(Article[] listeArticle) {
        this.listeArticle = listeArticle;
    }

    public Integer prixTotal(){
        Integer total = 0;
        for (Article article: listeArticle) {
            total+=article.getPrix();
        }
        return total;
    }

    public Integer nbrArticle(){
        return listeArticle.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panier panier = (Panier) o;
        return Arrays.equals(listeArticle, panier.listeArticle);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Panier{" +
                "listeArticle=" + Arrays.deepToString(listeArticle) +
                " montant " + prixTotal() +
                " nombre d'article " + nbrArticle() +
                '}';
    }
}
