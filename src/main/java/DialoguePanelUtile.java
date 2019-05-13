import javax.swing.*;
import java.util.List;

class DialoguePanelUtile {
     void dialoguePanel(Selector selector) {
        int retour;
         String inputValue = JOptionPane.showInputDialog("Entrez le nom de l'auteur : ");
        do {
            List<Developer> relecteurs = selector.selectRelecteurs(inputValue);

            // 0 (Yes), 2 (No)
            retour = JOptionPane.showConfirmDialog(null,
                    relecteurs,
                    "Voici les deux relecteurs selectionnés ",
                    JOptionPane.OK_CANCEL_OPTION);
            System.out.println(retour);
        } while (retour == 2);
    }
}