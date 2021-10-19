package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {

    private JTextField resultField;
    private JTextArea errorArea;

    public ClearButtonListener(JTextField resultField, JTextArea errorArea) {
        this.resultField = resultField;
        this.errorArea = errorArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resultField.setText("");
        errorArea.setText("");
    }
}
