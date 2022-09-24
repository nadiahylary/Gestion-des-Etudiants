package gestion;

import java.util.*;
import java.util.ArrayList;

public class GestionEtudiants implements IGestionEtudiants {
    List<Etudiant> listeEtudiants = new ArrayList<>();

    public GestionEtudiants() {
    }

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        if(etudiant != null){
            listeEtudiants.add(etudiant);
        }
        return etudiant;
    }

    @Override
    public List<Etudiant> rechercherParMotcl(String motcl) {
        List<Etudiant> listeEtudiants = new ArrayList<>();
        for (Etudiant et:
             listeEtudiants) {
            if (et.getNom().contains(motcl) || et.getPrénom().contains(motcl)){
                listeEtudiants.add(et);
            }
        }
        return listeEtudiants;
    }

    @Override
    public void trierListEtudiantParNom(List<Etudiant> etudiantList) {
        Collections.sort(etudiantList, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
    }

    @Override
    public void listeDesEtudiants() {
        //listeEtudiants.iterator().toString();
        for (Etudiant e:
             listeEtudiants) {
            e.toString();
        }
       /* for (Etudiant et:
             listeEtudiants) {
            return "[Id = "+ et.getId() +
                    "Nom = "+et.getNom() +
                    "Prénom = "+et.getPrénom()+
                    "Sexe = "+et.getSexe()+
                    "Filière = "+et.getFilière()+
                    "]";
        }*/
    }

}
