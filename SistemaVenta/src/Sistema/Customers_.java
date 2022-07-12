package Sistema;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Customers_ {
	
	JButton create = new JButton();
	JButton Bulk_Load = new JButton();
	JButton update = new JButton();
	JButton delete = new JButton();
	JButton button1_Pdf = new JButton();

	Object customers[][] ;


	JTable table3;
	JScrollPane sp3;
	
	
	private void button() {
		create.setText("Create");
		create.setBounds(130, 450, 100, 60);
		
		ActionListener create_01 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				create();
			}
		};
		create.addActionListener(create_01);
		
		Bulk_Load.setText("Bulk Load");
		Bulk_Load.setBounds(300, 450, 100, 60);
		
	
		
		ActionListener f_Bulk_Load = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					carga_masiva();
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		Bulk_Load.addActionListener(f_Bulk_Load);
		
		update.setText("Update");
		update.setBounds(470, 450, 100, 60);
		
		ActionListener update_01 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
			}
		};
		
		update.addActionListener(update_01);
		
		delete.setText("delete");
		delete.setBounds(650, 450, 100, 60);
		
	
		 
			ActionListener f_delete = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 delete();
				}
			};
			
			delete.addActionListener(f_delete);
		
		button1_Pdf.setText("PDF");
		button1_Pdf.setBounds(790, 10, 70, 50);
		
		
		ActionListener f_pdf = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					generar_pdf();
				} catch (FileNotFoundException | DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		button1_Pdf.addActionListener(f_pdf);
		
	}
	
	private void table() throws ClassNotFoundException {
		
		String[] date = { "Code", "Name", "NIT", "Mail", "Gender" };
		
		
		CustomersFunciones customersFunciones = new CustomersFunciones();
		customers = customersFunciones.listar();
		table3 = new JTable(customers, date);
		
		
		sp3 = new JScrollPane(table3);
		table3.setVisible(true);
		sp3.setBounds(60, 40, 400, 350);
		
	}
	
	private void create() {
		JFrame FrameCre = new JFrame();
		JPanel panel4 =  new JPanel();
		panel4.setLayout(null);
		
		JLabel tex1 = new JLabel();
		JLabel tex2 = new JLabel();
		JLabel tex3 = new JLabel();
		JLabel tex4 = new JLabel();
		JLabel tex5 = new JLabel();

		JTextField fiel1 = new JTextField();
		JTextField fiel2 = new JTextField();
		JTextField fiel3 = new JTextField();
		JTextField fiel4 = new JTextField();
		JTextField fiel5 = new JTextField();

		JButton button = new JButton();

		// lable
		tex1.setText("Code:");
		tex1.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		tex1.setBounds(300, 35, 80, 60);
		tex1.setVisible(true);
		panel4.add(tex1);

		tex2.setText("Name:");
		tex2.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		tex2.setBounds(300, 135, 80, 60);
		tex2.setVisible(true);
		panel4.add(tex2);

		tex3.setText("NIT:");
		tex3.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		tex3.setBounds(300, 235, 80, 60);
		tex3.setVisible(true);
		panel4.add(tex3);

		tex4.setText("Mail:");
		tex4.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		tex4.setBounds(300, 335, 80, 60);
		tex4.setVisible(true);
		panel4.add(tex4);

		tex5.setText("Gender:");
		tex5.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		tex5.setBounds(300, 435, 80, 60);
		tex5.setVisible(true);
		panel4.add(tex5);

		// textField
		fiel1.setBounds(400, 50, 150, 30);
		fiel2.setBounds(400, 150, 150, 30);
		fiel3.setBounds(400, 250, 150, 30);
		fiel4.setBounds(400, 350, 150, 30);
		fiel5.setBounds(400, 450, 150, 30);

		panel4.add(fiel1);
		panel4.add(fiel2);
		panel4.add(fiel3);
		panel4.add(fiel4);
		panel4.add(fiel5);

		button.setText("save");
		button.setBounds(200, 500, 100, 40);
		panel4.add(button);
		
		
		
		ActionListener save = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				
				
				CustomersFunciones customersFunciones = new CustomersFunciones();
				customersFunciones.crear(fiel2.getText(), Integer.parseInt(fiel3.getText()),
						fiel4.getText(), fiel5.getText());
	
			}

		};
		button.addActionListener(save);
		
		
		FrameCre.setTitle("Create Products");
		FrameCre.setBackground(Color.white);
		FrameCre.setBounds(500, 300, 900, 600);
		FrameCre.setVisible(true);

		panel4.setBackground(Color.white);
		FrameCre.add(panel4);
		
	}
	
	
	private String leerarchivo() {

		JPanel create1 = new JPanel();
		JFileChooser fc = new JFileChooser();
		int op = fc.showOpenDialog(create1);
		String content = "";
		if (op == JFileChooser.APPROVE_OPTION) {

			File pRuta = fc.getSelectedFile();
			String ruta = pRuta.getAbsolutePath();
			File archivo = null;
			FileReader fr = null;
			BufferedReader br = null;

			try {
				archivo = new File(ruta);
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				String linea = "";

				while ((linea = br.readLine()) != null) {

					content += linea + "\n";
				}
				return content;

			} catch (FileNotFoundException ex) {
				String resp = (String) JOptionPane.showInputDialog(null, "File not found");// No se encontro
																							// el archivo
			} catch (IOException ex) {
				String resp = (String) JOptionPane.showInputDialog(null, "The file could not be opened");// No se pudo
																											// abrir el
																											// archivo
			} finally {
				try {
					if (null != fr) {
						fr.close();
					}
				} catch (Exception e2) {
					String resp = (String) JOptionPane.showInputDialog(null, "File not found");// No se
																								// encontro
																								// el
																								// archivo
					return "";
				}

			}
			return content;

		}
		return null;
	}

	private void carga_masiva() throws FileNotFoundException, IOException, ParseException {
		int x = 0;
		int y = 0;
		String archivo_retorno = leerarchivo();

		JsonParser parse = new JsonParser();
		JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();


		for (int i = 0; i < matriz.size(); i++) {
			JsonObject objeto = matriz.get(i).getAsJsonObject();
			CustomersFunciones customersFunciones = new CustomersFunciones();
			customersFunciones.crear(objeto.get("nombre").getAsString(),
					objeto.get("nit").getAsInt(), objeto.get("correo").getAsString(),
					objeto.get("genero").getAsString());
		}
		
	}
	
	private void delete() {
		int posicion = table3.getSelectedRow();

		if (posicion != -1) {
			
			CustomersFunciones customersFunciones = new CustomersFunciones();
			customersFunciones.eliminar(Integer.parseInt(customers[posicion][0].toString()));

		} else {
			JOptionPane.showMessageDialog(null, "you must select a row",null, JOptionPane.WARNING_MESSAGE);// debe de seleccionar una fila
		}
		table3.clearSelection();
	}
	
	
	
	
	private void update() {
		
		int selec01 = table3.getSelectedRow();

		if (selec01 != -1) {
		JFrame update1 = new JFrame();
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		
		//JLabel
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		JLabel text4 = new JLabel();
		JLabel text5 = new JLabel();
		//textField
		
		TextField fiel1 =  new TextField();
		TextField fiel2 =  new TextField();
		TextField fiel3 =  new TextField();
		TextField fiel4 =  new TextField();
		TextField fiel5 =  new TextField();
		
		JButton button = new JButton();
		
		
		text1.setText("Code:");
		text1.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		text1.setBounds(300, 35, 80, 60);
		text1.setVisible(true);
		panel4.add(text1);
		
		text2.setText("Name:");
		text2.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		text2.setBounds(300, 135, 80, 60);
		text2.setVisible(true);
		panel4.add(text2);
		
		text3.setText("Nit:");
		text3.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		text3.setBounds(300, 235, 80, 60);
		text3.setVisible(true);
		panel4.add(text3);
		
		text4.setText("Mail:");
		text4.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		text4.setBounds(300, 335, 80, 60);
		text4.setVisible(true);
		panel4.add(text4);
		
		text5.setText("Gender:");
		text5.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
		text5.setBounds(300, 435, 80, 60);
		text5.setVisible(true);
		panel4.add(text5);
		
		fiel1.setBounds(400, 50, 150, 30);
		fiel2.setBounds(400, 150, 150, 30);
		fiel3.setBounds(400, 250, 150, 30);
		fiel4.setBounds(400, 350, 150, 30);
		fiel5.setBounds(400, 450, 150, 30);

		panel4.add(fiel1);
		panel4.add(fiel2);
		panel4.add(fiel3);
		panel4.add(fiel4);
		panel4.add(fiel5);
		
		
		fiel1.setText(customers[selec01][0] + "");
		fiel2.setText(customers[selec01][1] + "");
		fiel3.setText(customers[selec01][2] + "");
		fiel4.setText(customers[selec01][3] + "");
		fiel5.setText(customers[selec01][4] + "");

		button.setText("save");
		button.setBounds(200, 500, 100, 40);
		panel4.add(button);
		
		
		
		ActionListener updates = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Customers ob = new Customers();// Integer.parseInt();
				
				ob.setCode(Integer.parseInt(fiel1.getText()));
				ob.setName( fiel2.getText());
				ob.setNit(Integer.parseInt(fiel3.getText()));
				ob.setMail(fiel4.getText());
				ob.setGender(fiel5.getText());
				
				CustomersFunciones customersFunciones = new CustomersFunciones();
				customersFunciones.modificar(ob);

			}
		};

		button.addActionListener(updates);
		
		update1.setTitle("Update Customers");
		update1.setBackground(Color.white);
		update1.setBounds(500, 300, 900, 600);
		update1.setVisible(true);
		
		panel4.setBackground(Color.white);
		update1.add(panel4);
		}else {
			JOptionPane.showMessageDialog(null, "you must select a row",null, JOptionPane.WARNING_MESSAGE);// debe de seleccionar una fila
		}
		
	}
	
	private void generar_pdf() throws FileNotFoundException, DocumentException {

		FileOutputStream gen = new FileOutputStream("customers.pdf");
		Document documento = new Document();

		PdfWriter.getInstance(documento, gen);
		documento.open();

		Paragraph parrafo = new Paragraph("customers");
		parrafo.setAlignment(1);
		documento.add(parrafo);
		documento.add(new Paragraph("\n"));

		for (int i = 0; i < customers.length; i++) {

			if (customers[i][0] == null) {
				break;
			} else {
				documento.add(new Paragraph("Código: " + customers[i][0] + " " + "Nombre: " + customers[i][1]
						+ " " + "NIt: " + customers[i][2] + " " + "mail: " + customers[i][3] + " "
						+ "gener: " + customers[i][4]));
				documento.add(new Paragraph("\n\n"));
			}

		}
		documento.close();
		JOptionPane.showMessageDialog(null, "the pdf was generated");
		try {
			File customers_doc = new File("customers.pdf");
			Desktop.getDesktop().open(customers_doc);

		} catch (Exception e) {
		}
	}

	
	public void run4() throws ClassNotFoundException {
		button();
		table();
	}

}
