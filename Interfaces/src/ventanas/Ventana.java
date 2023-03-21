package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTextField textField1;
    private JButton boton1;
    private JLabel jLabel1;
public Ventana() {
    boton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String cadena = textField1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    });
}
}
