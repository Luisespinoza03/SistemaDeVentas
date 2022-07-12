package Sistema;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    JFrame start = new JFrame();
    JPanel panel = new JPanel();
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel();

    JTextField txtUsuario = new JTextField();
    JPasswordField txtPassword = new JPasswordField();

    JButton btnLogin = new JButton();

    private void frame() {

        // login
        start.setTitle("Login");
        start.setLocationRelativeTo(null);
        start.setBounds(600, 200, 550, 400);

        // panel
        panel.setBackground(Color.white);
        panel.setBounds(600, 200, 550, 400);
        panel.setLayout(null);
        start.add(panel);
        start.setVisible(true);

    }

    private void texts() {
        // user
        text1.setText("User:");
        text1.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        text1.setBounds(50, 100, 50, 60);
        text1.setVisible(true);
        panel.add(text1);
        // password
        text2.setText("Password:");
        text2.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        text2.setBounds(50, 180, 80, 60);
        text2.setVisible(true);
        panel.add(text2);

        // textfield
        txtUsuario.setBounds(200, 111, 150, 30);
        txtPassword.setBounds(200, 200, 150, 30);
        panel.add(txtUsuario);
        panel.add(txtPassword);

    }

    private void login() {


        btnLogin.setText("Iniciar sesion");
        btnLogin.setBounds(230, 250, 100, 40);
        panel.add(btnLogin);

        btnLogin.addActionListener((action) -> {

            String usuario = txtUsuario.getText().trim();
            String password = txtPassword.getText().trim();

            if (usuario.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un usuario o contraseña");
                return;
            }

            if (usuario.equals("admin") && password.equals("admin")) {
                try {
                    MenuPrinc admin = new MenuPrinc();
                    admin.Ejecutar();

                    start.setVisible(false);
                    return;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            loginSQL(usuario, password);
        });
    }

    public void loginSQL(String usuario, String password) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Connection connection;

        Connexion conexion = new Connexion();

        String sql = "SELECT * FROM vendedores WHERE nombre = BINARY ? AND password = BINARY ?";

        try {
            connection = conexion.Conectar();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                try {
                    MenuVenders vendedor = new MenuVenders();
                    vendedor.nombreDelVendedor = resultSet.getString("nombre");
                    vendedor.Ejecutar();
                    start.setVisible(false);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro un usuario con el nombre: " + usuario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro un usuario con el nombre: " + usuario);
        }
    }

    public void ejecutar() {
        frame();
        texts();
        login();
    }

    public static void main(String[] args) {
        Login login1 = new Login();

        login1.ejecutar();

    }

}
