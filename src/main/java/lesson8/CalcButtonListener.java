package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lesson8.CalcUtils.EQUALS_SIGN;
import static lesson8.CalcUtils.SQRT;

public class CalcButtonListener implements ActionListener {

    private JTextField resultField;
    private JTextArea errorArea;

    /**
     * true - использование Nashorn для рассчетов
     * false - использование простого калькулятора (с 2 операндами и оператором)
     */

    private final boolean isCleverCalculation = true;

    public CalcButtonListener(JTextField resultField, JTextArea errorArea) {
        this.resultField = resultField;
        this.errorArea = errorArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals(EQUALS_SIGN)) {
            clearError();
            if (isCleverCalculation) {
                CalcUtils.parseAndCalculate(resultField, errorArea, resultField.getText());
            } else {
                CalcUtils.simpleCalculate(resultField, errorArea, resultField.getText());
            }
        } else if (button.getText().equals(SQRT)) {
            clearError();
            CalcUtils.calculateSqrt(resultField, errorArea, resultField.getText());
        } else {
            // очищение введенных значений
            resultField.setText("");
            clearError();
        }
    }

    private void clearError() {
        errorArea.setText("");
    }
}
