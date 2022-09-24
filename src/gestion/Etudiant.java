package gestion;

public class Etudiant implements Comparable<Etudiant>{
    private int id;
    private String nom;
    private String prénom;
    private char sexe;
    private String filière;
    private static int num;

    public Etudiant(int id, String nom, String prénom, char sexe, String filière){
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.sexe = sexe;
        this.filière = filière;

    }
    public Etudiant(String nom, String prénom, char sexe, String filière){
        id = ++num;
        this.nom = nom;
        this.prénom = prénom;
        this.sexe = sexe;
        this.filière = filière;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrénom(String prénom){
        this.prénom = prénom;
    }
    public void setSexe(char sexe){
        this.sexe = sexe;
    }

    public void setFilière(String filière) {
        this.filière = filière;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public char getSexe() {
        return sexe;
    }

    public String getFilière() {
        return filière;
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.nom.compareTo(o.nom);
    }

}
