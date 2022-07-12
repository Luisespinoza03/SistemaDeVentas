package Sistema;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.itextpdf.text.DocumentException;

public class MenuPrinc {

	JFrame panelP = new JFrame();
	JTabbedPane tabs = new JTabbedPane();

	// tab
	JPanel branchOffices = new JPanel();
	JPanel customers = new JPanel();
	JPanel vendors = new JPanel();
	JPanel products = new JPanel();

	Branch_offices menu1 = new Branch_offices();
	Products_ menu2 = new Products_();
	Customers_ menu3 = new Customers_();
	Venders menu4 = new Venders();

	private void table() throws ClassNotFoundException {

		panelP.setTitle("admin module");
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
		branchOffices.setLayout(null);
		customers.setLayout(null);
		vendors.setLayout(null);
		products.setLayout(null);

		// tabs new
		branchOffices.setBackground(Color.white);
		products.setBackground(Color.white);
		customers.setBackground(Color.white);
		vendors.setBackground(Color.white);

		tabs.addTab("Branch offices", branchOffices);
		tabs.addTab("Products", products);
		tabs.addTab("Customers", customers);
		tabs.addTab("Vendors", vendors);

		// botones desde la clase branch_offices
		menu1.run();
		branchOffices.add(menu1.create);
		branchOffices.add(menu1.Bulk_Load);
		branchOffices.add(menu1.update);
		branchOffices.add(menu1.delete);
		branchOffices.add(menu1.button1_Pdf);
		branchOffices.add(menu1.sp);

		// botones desde la clase products
		menu2.run1();
		products.add(menu2.create);
		products.add(menu2.Bulk_Load);
		products.add(menu2.update);
		products.add(menu2.delete);
		products.add(menu2.button1_Pdf);
		products.add(menu2.sp2);

		// botones desde la clase customers
		menu3.run4();
		customers.add(menu3.create);
		customers.add(menu3.Bulk_Load);
		customers.add(menu3.update);
		customers.add(menu3.delete);
		customers.add(menu3.button1_Pdf);
		customers.add(menu3.sp3);
		
		
		menu4.run();
		vendors.add(menu4.create);
		vendors.add(menu4.Bulk_Load);
		vendors.add(menu4.update);
		vendors.add(menu4.delete);
		vendors.add(menu4.button1_Pdf);
		vendors.add(menu4.sp);
		

	}

	public void Ejecutar() throws ClassNotFoundException {
		table();

	}

	public static void main(String[] args) throws ClassNotFoundException {
		MenuPrinc menu1 = new MenuPrinc();

		menu1.table();
	}

}
