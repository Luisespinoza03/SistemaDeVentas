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
import java.io.Serializable;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Branch_offices implements Serializable {

    JButton create = new JButton();
    JButton Bulk_Load = new JButton();
    JButton update = new JButton();
    JButton delete = new JButton();
    JButton button1_Pdf = new JButton();

    Object BranchOffice[][];
    private DefaultTableModel model;

    JTable table1;
    JScrollPane sp;

    String ruta = "datos.txt";
    int suma;

    private void Button01() {
        // create
        create.setText("Create");

        create.setBounds(130, 450, 100, 60);

        ActionListener f_create = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                creates();

            }
        };
        create.addActionListener(f_create);

        // burden
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

        // update
        update.setText("Update");
        update.setBounds(470, 450, 100, 60);

        ActionListener f_update = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                update1();

            }
        };
        update.addActionListener(f_update);

        // delete
        delete.setText("Delete");
        delete.setBounds(650, 450, 100, 60);

        ActionListener f_delete = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                try {
                    delete();
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        };
        delete.addActionListener(f_delete);

        // button1_Pdf
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
        String[] date = {"Code", "Name", "Direction", "Mail", "Phone"};

        // persistencia de datos
        SucuersalesFunciones sf = new SucuersalesFunciones();
        BranchOffice = sf.litar();
        
        model = new DefaultTableModel(BranchOffice, date);
        
        table1 = new JTable(model);

        sp = new JScrollPane(table1);
        sp.setBounds(100, 40, 600, 350);

    }

    private void creates() {
        JFrame creat = new JFrame();
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
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
        panel2.add(tex1);

        tex2.setText("Name:");
        tex2.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        tex2.setBounds(300, 135, 80, 60);
        tex2.setVisible(true);
        panel2.add(tex2);

        tex3.setText("direction:");
        tex3.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        tex3.setBounds(300, 235, 80, 60);
        tex3.setVisible(true);
        panel2.add(tex3);

        tex4.setText("mail:");
        tex4.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        tex4.setBounds(300, 335, 80, 60);
        tex4.setVisible(true);
        panel2.add(tex4);

        tex5.setText("phone:");
        tex5.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
        tex5.setBounds(300, 435, 80, 60);
        tex5.setVisible(true);
        panel2.add(tex5);

        // textField
        fiel1.setBounds(400, 50, 150, 30);
        fiel2.setBounds(400, 150, 150, 30);
        fiel3.setBounds(400, 250, 150, 30);
        fiel4.setBounds(400, 350, 150, 30);
        fiel5.setBounds(400, 450, 150, 30);

        panel2.add(fiel1);
        panel2.add(fiel2);
        panel2.add(fiel3);
        panel2.add(fiel4);
        panel2.add(fiel5);

        button.setText("save");
        button.setBounds(200, 500, 100, 40);
        panel2.add(button);

        creat.setTitle("Create");
        creat.setLocationRelativeTo(null);
        creat.setBounds(500, 300, 900, 600);
        creat.setBackground(Color.white);
        creat.setVisible(true);

        panel2.setBackground(Color.white);
        creat.add(panel2);

        ActionListener save = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                SucuersalesFunciones sf = new SucuersalesFunciones();
                sf.crear(fiel2.getText(), fiel3.getText(), fiel4.getText(), Integer.parseInt(fiel5.getText()));
                fiel2.setText("");
                fiel3.setText("");
                fiel4.setText("");
                fiel5.setText("");
                
                
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            }

        };
        button.addActionListener(save);

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
            SucuersalesFunciones fs = new SucuersalesFunciones();
            fs.crear(objeto.get("nombre").getAsString(), objeto.get("direccion").getAsString(),
                    objeto.get("correo").getAsString(), objeto.get("telefono").getAsInt());

        }

    }

    private void delete() throws ClassNotFoundException {
        int posicion = table1.getSelectedRow();

        if (posicion != -1) {
            SucuersalesFunciones fc = new SucuersalesFunciones();
            fc.eliminar(Integer.parseInt(BranchOffice[posicion][0].toString()));
            JOptionPane.showMessageDialog(null, "Se elimino el correctamente ");

        } else {
            JOptionPane.showMessageDialog(null, "you must select a row", ruta, JOptionPane.WARNING_MESSAGE);// debe de
            // una fila
        }

        table1.revalidate();
        table1.clearSelection();
    }

    private void update1() {

        int selec01 = table1.getSelectedRow();

        if (selec01 != -1) {

            JFrame updat = new JFrame();
            JPanel panel3 = new JPanel();
            panel3.setLayout(null);
            // JLabel
            JLabel text1 = new JLabel();
            JLabel text2 = new JLabel();
            JLabel text3 = new JLabel();
            JLabel text4 = new JLabel();
            JLabel text5 = new JLabel();
            // textField

            TextField fiel1 = new TextField();
            TextField fiel2 = new TextField();
            TextField fiel3 = new TextField();
            TextField fiel4 = new TextField();
            TextField fiel5 = new TextField();

            JButton button = new JButton();

            text1.setText("Code:");
            text1.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
            text1.setBounds(300, 35, 80, 60);
            text1.setVisible(true);
            panel3.add(text1);

            text2.setText("Name:");
            text2.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
            text2.setBounds(300, 135, 80, 60);
            text2.setVisible(true);
            panel3.add(text2);

            text3.setText("direction:");
            text3.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
            text3.setBounds(300, 235, 80, 60);
            text3.setVisible(true);
            panel3.add(text3);

            text4.setText("mail:");
            text4.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
            text4.setBounds(300, 335, 80, 60);
            text4.setVisible(true);
            panel3.add(text4);

            text5.setText("Phone:");
            text5.setFont(new Font("Serig", Font.ROMAN_BASELINE, 14));
            text5.setBounds(300, 435, 80, 60);
            text5.setVisible(true);
            panel3.add(text5);

            fiel1.setBounds(400, 50, 150, 30);
            fiel2.setBounds(400, 150, 150, 30);
            fiel3.setBounds(400, 250, 150, 30);
            fiel4.setBounds(400, 350, 150, 30);
            fiel5.setBounds(400, 450, 150, 30);

            fiel1.setText(BranchOffice[selec01][0] + "");
            fiel2.setText(BranchOffice[selec01][1] + "");
            fiel3.setText(BranchOffice[selec01][2] + "");
            fiel4.setText(BranchOffice[selec01][3] + "");
            fiel5.setText(BranchOffice[selec01][4] + "");

            // forma de parseo es +"", toString(), (String)
            panel3.add(fiel1);
            panel3.add(fiel2);
            panel3.add(fiel3);
            panel3.add(fiel4);
            panel3.add(fiel5);

            button.setText("save");
            button.setBounds(200, 500, 100, 40);
            panel3.add(button);

            ActionListener updates = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub

                    BranchOfi ob = new BranchOfi();// Integer.parseInt();
                    ob.setCode(Integer.parseInt(fiel1.getText()));
                    ob.setName(fiel2.getText());
                    ob.setDirection(fiel3.getText());
                    ob.setPhone(Integer.parseInt(fiel5.getText()));
                    ob.setMail(fiel4.getText());

                    SucuersalesFunciones sf = new SucuersalesFunciones();
                    sf.modificar(ob);
                    JOptionPane.showMessageDialog(null, "Actualizado");
                }

            };

            button.addActionListener(updates);

            updat.setTitle("Update");
            updat.setLocationRelativeTo(null);
            updat.setBounds(500, 300, 900, 600);
            updat.setBackground(Color.white);
            updat.setVisible(true);

            panel3.setBackground(Color.white);
            updat.add(panel3);
        } else {
            JOptionPane.showMessageDialog(null, "you must select a row", ruta, JOptionPane.WARNING_MESSAGE);// debe de
            // seleccionar
            // una fila
        }

    }

    private void generar_pdf() throws FileNotFoundException, DocumentException {

        FileOutputStream gen = new FileOutputStream("BranchOffice.pdf");
        Document documento = new Document();

        PdfWriter.getInstance(documento, gen);
        documento.open();

        Paragraph parrafo = new Paragraph("BranchOffice");
        parrafo.setAlignment(1);
        documento.add(parrafo);
        documento.add(new Paragraph("\n"));

        for (int i = 0; i < BranchOffice.length; i++) {

            if (BranchOffice[i][0] == null) {
                break;
            } else {
                documento.add(new Paragraph("Código: " + BranchOffice[i][0] + " " + "Nombre: " + BranchOffice[i][1]
                        + " " + "Dirección: " + BranchOffice[i][2] + " " + "Correo: " + BranchOffice[i][3] + " "
                        + "Teléfono: " + BranchOffice[i][4]));
                documento.add(new Paragraph("\n\n"));
            }

        }
        documento.close();
        JOptionPane.showMessageDialog(null, "the pdf was generated");
        try {
            File BranchOffice_doc = new File("BranchOffice.pdf");
            Desktop.getDesktop().open(BranchOffice_doc);

        } catch (Exception e) {
        }
    }

    public void run() throws ClassNotFoundException {
        Button01();
        table();
    }

}
