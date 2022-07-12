package Sistema;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MenuVenders {

    public String nombreDelVendedor;
    
    JFrame panelP = new JFrame();
    JTabbedPane tabs = new JTabbedPane();

    // tab
    JPanel Newsale = new JPanel();
    JPanel sale = new JPanel();

    NewVentas menu1 = new NewVentas();
    Sales menu2 = new Sales();

    private void table() throws ClassNotFoundException {

        panelP.setTitle("Vendedor: " + nombreDelVendedor);
        panelP.setLocationRelativeTo(null);
        panelP.setBounds(500, 300, 900, 600);
        panelP.setBackground(Color.white);
        panelP.setVisible(true);
        JButton close = new JButton("Close");   
        close.setBackground(Color.red);
        close.setBackground(Color.white);
        close.setBounds(700, 0, 170, 20);

        ActionListener f_close = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Login log = new Login();
                log.ejecutar();
                panelP.setVisible(false);

            }
        };
        close.addActionListener(f_close);

        panelP.add(close);

        panelP.add(tabs);
        //
        Newsale.setLayout(null);
        sale.setLayout(null);

        // tabs new
        Newsale.setBackground(Color.white);
        sale.setBackground(Color.white);

        tabs.addTab("New sale", Newsale);
        tabs.addTab("Sale", sale);

        menu1.run();
        Newsale.add(menu1.panelFiltrado);
        Newsale.add(menu1.panelVentas);

        menu2.run();
        sale.add(menu2.filtro);
        sale.add(menu2.ventas);
        sale.add(menu2.table2);

    }

   
    public void Ejecutar() throws ClassNotFoundException {
        table();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        MenuVenders menu1 = new MenuVenders();

        menu1.table();
    }
}
