package fr.m2i.model;

import java.util.Objects;

public class Article {
    private Integer prix;
    private Integer id;
    private String description;

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Article() {
    }

    public Article(Integer prix, Integer id, String description) {
        this.prix = prix;
        this.id = id;
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(prix, article.prix) && Objects.equals(id, article.id) && Objects.equals(description, article.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prix, id, description);
    }

    @Override
    public String toString() {
        return "Article{" +
                "prix=" + prix +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
