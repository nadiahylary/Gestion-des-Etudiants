package gestion;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModel extends AbstractTableModel {
    private List<Etudiant> etudiantList;
    private String titreColonne[]= {"Id", "Nom", "Prénom", "Sexe", "Filière"};

    public TableModel(){
        etudiantList = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return etudiantList.size();
    }

    @Override
    public int getColumnCount() {
        return titreColonne.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return etudiantList.get(rowIndex).getId();
            case 1:
                return etudiantList.get(rowIndex).getNom();
            case 2:
                return etudiantList.get(rowIndex).getPrénom();
            case 3:
                return etudiantList.get(rowIndex).getSexe();
            case 4:
                return etudiantList.get(rowIndex).getFilière();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titreColonne[column];
    }
    public void charger(List<Etudiant> etudiantList){
        this.etudiantList = etudiantList;
        fireTableDataChanged();
    }
}
