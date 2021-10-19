package lesson8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Приложение завершило работу");
        System.exit(1);
    }
}
