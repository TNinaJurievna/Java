package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame {

    private JTextField resultField;
    private JTextArea errorArea;

    public ApplicationFrame() {
        setTitle("ApplicationFrame v1.0");
        setBounds(50, 50, 450, 350);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH);
        add(createErrorLayout(), BorderLayout.SOUTH);
        add(createBottom(), BorderLayout.CENTER);

        setJMenuBar(createMenu());

        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
        JMenuItem clear = menu.add(new JMenuItem("Clear"));
        clear.addActionListener(new ClearButtonListener(resultField, errorArea));

        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        resultField = new JTextField();
        resultField.setFont(new Font("Roboto", Font.PLAIN, 16));
        resultField.setMargin(new Insets(4, 4, 4, 4));
        resultField.setEditable(false);
        top.add(resultField);

        return top;
    }

    private JPanel createBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(resultField, errorArea);
        ActionListener calcButtonListener = new CalcButtonListener(resultField, errorArea);

        // цифры
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 10; i++) {
            String buttonName = (i == 10) ? "0" : String.valueOf(i);
            JButton btn = new JButton(buttonName);
            btn.setFont(new Font("Roboto", Font.PLAIN, 14));
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        bottom.add(digitsPanel, BorderLayout.CENTER);

        // operators
        JPanel advPanel = new JPanel();
        advPanel.setLayout(new GridLayout(4, 2));

        JButton minus = new JButton("-");
        minus.setFont(new Font("Roboto", Font.BOLD, 14));
        minus.addActionListener(buttonListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.setFont(new Font("Roboto", Font.BOLD, 14));
        plus.addActionListener(buttonListener);
        advPanel.add(plus);

        JButton division = new JButton("/");
        division.setFont(new Font("Roboto", Font.BOLD, 14));
        division.addActionListener(buttonListener);
        advPanel.add(division);

        JButton multi = new JButton("*");
        multi.setFont(new Font("Roboto", Font.BOLD, 14));
        multi.addActionListener(buttonListener);
        advPanel.add(multi);

        JButton sqrt = new JButton("\u221A");
        sqrt.setFont(new Font("Roboto", Font.BOLD, 14));
        sqrt.addActionListener(calcButtonListener);
        advPanel.add(sqrt);

        JButton calc = new JButton("=");
        calc.setFont(new Font("Roboto", Font.BOLD, 14));
        calc.addActionListener(calcButtonListener);
        advPanel.add(calc);

        JButton clear = new JButton("C");
        clear.setFont(new Font("Roboto", Font.PLAIN, 14));
        clear.addActionListener(calcButtonListener);
        advPanel.add(clear);

        bottom.add(advPanel, BorderLayout.WEST);

        return bottom;
    }


    /**
     * добавлено для отображения ошибок не только в консоли
     */
    private JPanel createErrorLayout() {
        JPanel errorLayout = new JPanel();
        errorLayout.setLayout(new BorderLayout());

        errorArea = new JTextArea();
        errorArea.setFont(new Font("Roboto", Font.BOLD, 12));
        errorArea.setForeground(Color.RED);
        errorArea.setEditable(false);
        errorLayout.add(errorArea);

        return errorLayout;
    }
}
