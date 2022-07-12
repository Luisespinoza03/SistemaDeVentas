package Sistema;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Sales {
	JPanel filtro = new JPanel();
	JPanel ventas = new JPanel();
	Venders menu4 = new Venders();
	JButton create = new JButton();
	JTable table2 = new JTable();

	private void crear() {
		filtro.setLayout(null);
		ventas.setLayout(null);
		filtro.setBackground(Color.gray);
		ventas.setBackground(Color.gray);
		filtro.setBounds(20, 30, 830, 500);
		// ventas.setBounds(20, 280, 830, 240);
	}

	private void button() {
		// Etiquetas
		JLabel filtros = new JLabel("filter by: ");
		filtros.setLocation(50, 30);
		filtros.setSize(100, 15);
		filtros.setFont(new Font("Serig", Font.PLAIN, 15));
		// Subrayado
		Font font = filtros.getFont();
		Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		filtros.setFont(font.deriveFont(attributes));

		filtro.add(filtros);

		JLabel name = new JLabel("name: ");
		name.setBounds(180, 30, 100, 15);
		filtro.add(name);

		JLabel mail = new JLabel("mail: ");
		mail.setBounds(180, 75, 100, 15);
		filtro.add(mail);

		JTextField TextName = new JTextField();
		TextName.setBounds(250, 25, 150, 25);
		filtro.add(TextName);

		JTextField TextMail = new JTextField();
		TextMail.setBounds(250, 65, 150, 25);
		filtro.add(TextMail);

		JLabel nit = new JLabel("nit: ");
		nit.setBounds(500, 30, 100, 15);
		filtro.add(nit);

		JLabel gener = new JLabel("gener: ");
		gener.setBounds(500, 75, 100, 15);
		filtro.add(gener);

		JTextField TextNit = new JTextField();
		TextNit.setBounds(550, 25, 150, 25);
		filtro.add(TextNit);

		JTextField TextGener = new JTextField();
		TextGener.setBounds(550, 65, 150, 25);
		filtro.add(TextGener);

		create.setText("filter");
		create.setBounds(245, 110, 400, 25);
		filtro.add(create);

		JLabel filtros1 = new JLabel("filter by: ");
		filtros1.setLocation(50, 170);
		filtros1.setSize(100, 15);
		filtros1.setFont(new Font("Serig", Font.PLAIN, 15));
		// Subrayado
		Font font1 = filtros.getFont();
		Map<TextAttribute, Object> attributes1 = new HashMap<>(font1.getAttributes());
		attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		filtros1.setFont(font.deriveFont(attributes1));

		filtro.add(filtros1);

		// venta2
	}

	private void table() {
		String[] date = { "Code", "Name", "description", "quantity", "price" };


	}

	public void run() {
		crear();
		button();
		table();
	}
}
