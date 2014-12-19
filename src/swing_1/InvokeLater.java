package swing_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InvokeLater extends JFrame {

    private JButton button;
    private JLabel  label;

    public InvokeLater() {
        super("InvokeLater"); //name
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //exit button will work

        button = new JButton("Выполнить сложную работу");
        label  = new JLabel("Нет длительной работы : Thread-"+
                Thread.currentThread().getName());

        button.addActionListener(new ActionListener() { //обработчик для кнопки action listener
            public void actionPerformed(ActionEvent e) {
                // запустим отдельный поток
                new ComplexJobThread().start(); //сюда помещаем работу в другом потоке
                label.setText("Подождите...: Thread-"+
                        Thread.currentThread().getName()); }
        });

        getContentPane(). setLayout(new FlowLayout());
        getContentPane().add(label);
        getContentPane().add(button);
        setSize(400, 100);
        setVisible(true);
    }
    // поток,выполняющий "сложную работу"
    class ComplexJobThread extends Thread {
        public void run() {
            try {
                for(int i=0; i<5; i++) {
                    sleep(500);
                    System.out.println(Thread.currentThread().getName());
                }

                // работа закончена
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        label.setText("Работа завершена : Thread-"+
                                Thread.currentThread().getName());
                    }});
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new InvokeLater(); //too bad
    }
}
