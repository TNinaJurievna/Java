package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField resultField;
    private JTextArea errorArea;

    public ButtonListener(JTextField resultField, JTextArea errorArea) {
        this.resultField = resultField;
        this.errorArea = errorArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        resultField.setText(resultField.getText() + btn.getText());
        errorArea.setText("");
    }
}
