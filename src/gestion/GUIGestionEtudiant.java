package gestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGestionEtudiant extends JFrame implements ActionListener {
    JPanel pajout = new JPanel(new GridLayout(2,1,10,10));
    JLabel nom = new JLabel("Nom");
    JTextField tnom = new JTextField();
    JLabel prénom = new JLabel("Prénom");
    JTextField tprénom = new JTextField();
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
