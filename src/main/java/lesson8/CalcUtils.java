package lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class CalcUtils {
    static final String PLUS = "+";
    static final String MINUS = "-";
    static final String DIVISION = "/";
    static final String MILTI = "*";
    static final String EQUALS_SIGN = "=";
    static final String SQRT = "\u221A";

    public static void parseAndCalculate(JTextField resultField, JTextArea errorArea, String expression) {
        if (expression.isBlank())
            showError(errorArea, "Ошибка: Не заполнены данные");
        else {
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
            try {
                resultField.setText("" + scriptEngine.eval(expression));
            } catch (ScriptException e) {
                e.printStackTrace();
                showError(errorArea, e.getMessage());
            }
        }
    }

    public static void simpleCalculate(JTextField resultField, JTextArea errorArea, String expression) {
        if (expression.isBlank()) {
            showError(errorArea, "Ошибка: Не заполнены данные");
        } else if (expression.contains(PLUS)) {
            int index = expression.indexOf(PLUS);
            if (index != 0 && index != expression.length()) {
                String firstOperand = expression.substring(0, index);
                String secondOperand = expression.substring(index + 1);
                int result = Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand);
                resultField.setText(String.valueOf(result));
            } else {
                showError(errorArea, "Ошибка: Неверно написано выражение");
            }
        } else if (expression.contains(MINUS)) {
            int index = expression.indexOf(MINUS);
            if (index != 0 && index != expression.length()) {
                String firstOperand = expression.substring(0, index);
                String secondOperand = expression.substring(index + 1);
                int result = Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand);
                resultField.setText(String.valueOf(result));
            } else {
                showError(errorArea, "Ошибка: Неверно написано выражение");
            }
        } else if (expression.contains(MILTI)) {
            int index = expression.indexOf(MILTI);
            if (index != 0 && index != expression.length()) {
                String firstOperand = expression.substring(0, index);
                String secondOperand = expression.substring(index + 1);
                int result = Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand);
                resultField.setText(String.valueOf(result));
            } else {
                showError(errorArea, "Ошибка: Неверно написано выражение");
            }
        } else if (expression.contains(DIVISION)) {
            int index = expression.indexOf(DIVISION);
            if (index != 0 && index != expression.length()) {
                String firstOperand = expression.substring(0, index);
                String secondOperand = expression.substring(index + 1);
                if (Integer.parseInt(secondOperand) == 0) {
                    showError(errorArea, "Ошибка: Ну нельзя просто взять и поделить на 0");
                    return;
                }
                int result = Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand);
                resultField.setText(String.valueOf(result));
            } else {
                showError(errorArea, "Ошибка: Неверно написано выражение");
            }
        } else {
            showError(errorArea, "Ошибка: Проверьте наличие операторов");
        }
    }

    public static void calculateSqrt(JTextField resultField, JTextArea errorField, String expression) {
        if (expression.isBlank()) {
            showError(errorField, "Ошибка: Не заполнены данные");
        } else if (expression.contains(PLUS) || expression.contains(DIVISION) || expression.contains(MILTI)) {
            showError(errorField, "Ошибка: Введены лишние операторы");
        } else if (expression.contains(MINUS) && expression.indexOf(MINUS) !=0) {
            showError(errorField, "Ошибка: Введены лишние операторы");
        } else {
            double firstOperand = Double.parseDouble(expression);
            double result = Math.sqrt(firstOperand);
            resultField.setText(String.valueOf(result));
        }
    }

    private static void showError(JTextArea errorArea, String errorText) {
        System.out.println(errorText);
        errorArea.setText(errorText);
    }
}