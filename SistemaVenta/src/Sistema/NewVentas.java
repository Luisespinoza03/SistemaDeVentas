package Sistema;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NewVentas {
    
    private int totalVenta;
    
    Products productoEncontrado;
    
    DefaultTableModel modelo;
    
    Object[] registros = new Object[5];
    
    JPanel panelFiltrado = new JPanel();
    JPanel panelVentas = new JPanel();
    
    Venders menu4 = new Venders();
    
    JButton btnFiltrar = new JButton();
    
    JComboBox comboBox = new JComboBox();
    
    JTextField txtEmail;
    
    JTextField txtNit;
    
    JTextField txtGenero;
    
    JTextField txtName;
    
    JTextField txtCodigoProducto;
    
    JTextField txtCantidad;

    //---
    JButton btnBuscarProducto = new JButton();
    JLabel fecha = new JLabel();
    JLabel fecha1 = new JLabel();
    JLabel no1 = new JLabel();
    JLabel no2 = new JLabel();
    JLabel codigo = new JLabel();
    JLabel cantidad = new JLabel();
    JLabel total = new JLabel();
    JLabel productoExiste = new JLabel();
    JButton JbAgregar = new JButton();
    JButton btnVender = new JButton();

//    Object[][] agregar_productos = new Object[10][5];
    JTable tablaVentas;
    JScrollPane jscrollPane;
    
    private void crearEscena() {
        panelFiltrado.setLayout(null);
        panelVentas.setLayout(null);
        panelFiltrado.setBackground(Color.gray);
        panelVentas.setBackground(Color.gray);
        panelFiltrado.setBounds(20, 30, 830, 240);
        panelVentas.setBounds(20, 280, 830, 240);
    }
    
    private void crearControles() {
        
        JLabel filtros = new JLabel("filter by: ");
        filtros.setLocation(50, 30);
        filtros.setSize(100, 15);
        filtros.setFont(new Font("Serig", Font.PLAIN, 15));
        
        Font font = filtros.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        filtros.setFont(font.deriveFont(attributes));
        
        panelFiltrado.add(filtros);
        
        JLabel name = new JLabel("name: ");
        name.setBounds(180, 30, 100, 15);
        panelFiltrado.add(name);
        
        JLabel mail = new JLabel("mail: ");
        mail.setBounds(180, 75, 100, 15);
        panelFiltrado.add(mail);
        
        txtName = new JTextField();
        txtName.setBounds(250, 25, 150, 25);
        panelFiltrado.add(txtName);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(250, 65, 150, 25);
        panelFiltrado.add(txtEmail);
        
        JLabel nit = new JLabel("nit: ");
        nit.setBounds(500, 30, 100, 15);
        panelFiltrado.add(nit);
        
        JLabel gener = new JLabel("gener: ");
        gener.setBounds(500, 75, 100, 15);
        panelFiltrado.add(gener);
        
        txtNit = new JTextField();
        txtNit.setBounds(550, 25, 150, 25);
        panelFiltrado.add(txtNit);
        
        txtGenero = new JTextField();
        txtGenero.setBounds(550, 65, 150, 25);
        panelFiltrado.add(txtGenero);
        
        btnFiltrar.setText("filter");
        btnFiltrar.setBounds(245, 110, 400, 25);
        panelFiltrado.add(btnFiltrar);
        
        JLabel filtros1 = new JLabel("filter by: ");
        filtros1.setLocation(50, 170);
        filtros1.setSize(100, 15);
        filtros1.setFont(new Font("Serig", Font.PLAIN, 15));
        
        Font font1 = filtros.getFont();
        Map<TextAttribute, Object> attributes1 = new HashMap<>(font1.getAttributes());
        attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        filtros1.setFont(font.deriveFont(attributes1));
        
        panelFiltrado.add(filtros1);
        
        JLabel clients = new JLabel("clients: ");
        clients.setBounds(180, 170, 100, 15);
        panelFiltrado.add(clients);
        
        comboBox.setBounds(290, 165, 200, 25);
        panelFiltrado.add(comboBox);
        
        JButton create1 = new JButton();
        
        create1.setText("New Clients");
        create1.setBounds(500, 165, 200, 25);
        panelFiltrado.add(create1);
    }
    
    private void aplicar_filtro() {
        btnFiltrar.addActionListener((action) -> {
            String name = txtName.getText().trim().toLowerCase();
            String nit = txtNit.getText().trim();
            String email = txtEmail.getText().trim().toLowerCase();
            
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre");
                return;
            }
            
            if (nit.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un nit");
                return;
            }
            
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un email");
                return;
            }
            
            Ventas venta = new Ventas();
            venta.setName(name);
            venta.setNit(Integer.parseInt(nit));
            venta.setEmail(email);
            
            SaleFunctions saleFunctions = new SaleFunctions();
            CustomerComboBox clienteEncontrado = saleFunctions.listar(venta);
            
            if (clienteEncontrado.getId() == 0) {
                comboBox.removeAllItems();
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente");
            }
            
            comboBox.removeAllItems();
            
            comboBox.addItem(clienteEncontrado);
        });
    }
    
    public void loadData() {
        LocalDate todaysDate = LocalDate.now();
        fecha1.setText(todaysDate.toString());
        
    }
    
    public void ventas() {
        btnBuscarProducto.setText("Buscar producto");
        btnBuscarProducto.setBounds(20, 20, 200, 25);
        panelVentas.add(btnBuscarProducto);
        
        fecha = new JLabel("fecha:");
        fecha.setBounds(300, 20, 400, 15);
        panelVentas.add(fecha);
        
        fecha1 = new JLabel("24/08/2021");
        fecha1.setBounds(340, 20, 400, 15);
        panelVentas.add(fecha1);
        
        no1 = new JLabel("NO.");
        no1.setBounds(600, 20, 400, 15);
        panelVentas.add(no1);
        
        no2 = new JLabel("572");
        no2.setBounds(620, 20, 400, 15);
        panelVentas.add(no2);
        
        codigo = new JLabel("codigo");
        codigo.setBounds(40, 30, 400, 15);
        panelVentas.add(codigo);
        
        productoExiste = new JLabel("No existe este producto");
        productoExiste.setBounds(150, 45, 400, 15);
        panelVentas.add(productoExiste);
        productoExiste.setVisible(false);
        
        txtCodigoProducto = new JTextField();
        txtCodigoProducto.setBounds(150, 65, 150, 25);
        panelVentas.add(txtCodigoProducto);
        
        cantidad = new JLabel("cantidad");
        cantidad.setBounds(350, 70, 400, 15);
        panelVentas.add(cantidad);
        
        txtCantidad = new JTextField();
        txtCantidad.setBounds(450, 65, 150, 25);
        panelVentas.add(txtCantidad);
        txtCantidad.setEnabled(false);
        
        JbAgregar.setText("Agregar");
        JbAgregar.setBounds(650, 65, 150, 25);
        panelVentas.add(JbAgregar);
        JbAgregar.setEnabled(false);
        
        btnVender.setText("vender");
        btnVender.setBounds(40, 210, 300, 25);
        panelVentas.add(btnVender);
        
        total = new JLabel("total:");
        total.setBounds(600, 210, 200, 15);
        panelVentas.add(total);
    }
    
    private void buscarProducto() {
        btnBuscarProducto.addActionListener((action) -> {
            if (txtCodigoProducto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un codigo");
                return;
            }
            
            int idProducto = Integer.parseInt(txtCodigoProducto.getText());
            
            SaleFunctions saleFunctions = new SaleFunctions();
            productoEncontrado = saleFunctions.buscarProducto(idProducto);
            
            if (productoEncontrado.getCode() != -1) {
                productoExiste.setVisible(true);
                productoExiste.setText("Producto encontrado: " + productoEncontrado.getName().toUpperCase() + ". Por favor ingrese una cantidad:");
                txtCantidad.setEnabled(true);
                JbAgregar.setEnabled(true);
            } else {
                txtCantidad.setEnabled(false);
                JbAgregar.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el id: " + idProducto);
            }
        });
    }
    
    private void agregarProducto() {
        JbAgregar.addActionListener((action) -> {
            if (txtCantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad");
                return;
            }
            
            int quantity = Integer.parseInt(txtCantidad.getText());
            
            if (quantity > productoEncontrado.getQuantity()) {
                JOptionPane.showMessageDialog(null, "Stock no disponible, ingrese una cantidad inferior");
                return;
            }
            
            int subtotal = (quantity * productoEncontrado.getPrice());
            
            registros[0] = productoEncontrado.getCode();
            registros[1] = productoEncontrado.getName();
            registros[2] = quantity;
            registros[3] = productoEncontrado.getPrice();
            registros[4] = subtotal;
            
            totalVenta += subtotal;
            modelo.addRow(registros);
            tablaVentas.setModel(modelo);
            
            total.setText("Total: " + String.valueOf(totalVenta));
            limpiarDatos();
        });
    }
    
    private void limpiarDatos() {
        txtCodigoProducto.setText("");
        txtCantidad.setText("");
        txtCantidad.setEnabled(false);
        JbAgregar.setEnabled(false);
    }
    
    private void tabla() {
        String[] titulos = {"Codigo", "Nombre", "Cantidad", "Precio", "Subtotal"};
        modelo = new DefaultTableModel(null, titulos);
        
        tablaVentas = new JTable(modelo);
        jscrollPane = new JScrollPane(tablaVentas);
        jscrollPane.setBounds(80, 105, 700, 100);
        panelVentas.add(jscrollPane);
    }
    
    private void sale() {
        btnVender.addActionListener((action) -> {
            if (comboBox.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(panelVentas, "Seleccione un cliente");
                return;
            }
            
            if (tablaVentas.getRowCount() == 0 && tablaVentas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(panelVentas, "Agregue al menos un producto");
                return;
            }
            
            if (tablaVentas.getRowCount() == 0) {
                JOptionPane.showMessageDialog(panelVentas, "La tabla esta vacia");
                return;
            }
            
            CustomerComboBox clienteSeleccionado = (CustomerComboBox) comboBox.getSelectedItem();
            
            SaleFunctions sale = new SaleFunctions();
            sale.insertarVenta(clienteSeleccionado.getId(), totalVenta, tablaVentas);
        });
    }
    
    public void run() {
        tabla();
        crearControles();
        crearEscena();
        aplicar_filtro();
        ventas();
        loadData();
        buscarProducto();
        agregarProducto();
        sale();
    }
    
}
