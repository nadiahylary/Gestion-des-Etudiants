package gestion;

import java.util.List;

public interface IGestionEtudiants {
   public Etudiant ajouterEtudiant(Etudiant etudiant);
   public List<Etudiant> rechercherParMotcl(String motcl);
   public void trierListEtudiantParNom(List<Etudiant> etudiantList);
   public void listeDesEtudiants();



}
