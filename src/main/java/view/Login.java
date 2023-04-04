package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    private JPanel LoginForm;
    private JPanel backgroundPanel;
    private JPanel formContainer;
    private JPanel form;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel motorPhLabel;

    public Login() {
        super("MotorPH - Payroll Management System");
        setContentPane(LoginForm);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
