package gestion;

public class Test {
    public static void main(String[] args){
        GestionEtudiants gest =  new GestionEtudiants();
        Etudiant et = new Etudiant("nadia", "hylary", 'f', "info");
        Etudiant et1 = new Etudiant("Christine", "hylary", 'f', "info");
        et.compareTo(et);
        gest.listeEtudiants.add(et);
        gest.listeEtudiants.add(et1);
        gest.listeDesEtudiants();

    }
}
