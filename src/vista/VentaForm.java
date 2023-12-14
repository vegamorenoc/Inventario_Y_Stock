/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author PC_TONY
 */
public class VentaForm extends javax.swing.JFrame {

    /**
     * Creates new form VentaForm
     */
    int idDetalleVenta = 1;

    public VentaForm() {
        initComponents();
        setLocationRelativeTo(null);
        verTipoComprobante();
        habilitarBotones(false, false, false, false, false, true, false);
        habilitarTxt(false, false, false, false, false, false, false, false, false, false, false, false);
    }

    void verTipoComprobante() {
        DefaultComboBoxModel modelocomprobante;
        DAOTipoComprobante objeto = new DAOTipoComprobante();
        modelocomprobante = objeto.verTipoCom();
        cbxTipo.setModel(modelocomprobante);

    }

    void habilitarBotones(boolean b, boolean bp, boolean ag, boolean ed, boolean el, boolean nw, boolean reg) {
        btnBuscar.setEnabled(b);
        btnBuscarproducto.setEnabled(bp);
        btnAgregar.setEnabled(ag);
        btnEditar.setEnabled(ed);
        btnEliminar.setEnabled(el);
        btnNuevo.setEnabled(nw);
        btnRegistrar.setEnabled(reg);
    }

    void habilitarTxt(boolean doc, boolean tipo, boolean ser, boolean cl, boolean fe, boolean dir, boolean pro, boolean can, boolean stk, boolean sbt, boolean igv, boolean tot) {
        txtDocumento.setEnabled(doc);
        cbxTipo.setEnabled(tipo);
        txtSerie.setEnabled(ser);
        txtCliente.setEnabled(cl);
        txtFecha.setEnabled(fe);
        txtDireccion.setEnabled(dir);
        txtProducto.setEnabled(pro);
        txtCantidad.setEnabled(can);
        txtStock.setEnabled(stk);
        txtSubtotal.setEnabled(sbt);
        txtIgv.setEnabled(igv);
        txtTotal.setEnabled(tot);
    }

    void limpiar() {
        txtDocumento.setText("");
        txtSerie.setText("");
        txtCliente.setText("");
        txtFecha.setText("");
        txtDireccion.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtStock.setText("");
        txtSubtotal.setText("");
        txtIgv.setText("");
        txtTotal.setText("");
    }

    void limpiarProd() {
        txtProducto.setText("");
        txtCantidad.setText("");
        txtStock.setText("");
    }

    ArrayList<DTODetalleVenta> listaProductos = new ArrayList<>();
    private DTODetalleVenta producto;

    public void listaTablaProductos() {
        DefaultTableModel modelo = (DefaultTableModel) tblVentatotal.getModel();

        modelo.setRowCount(0);

        // Recorrer la lista de productos y agregar filas a la tabla
        for (DTODetalleVenta producto : listaProductos) {
            Object[] fila = {
                producto.getIdDetalleVenta(),
                producto.getNombreProducto(),
                producto.getDescripcionProd(),
                producto.getCantidad(),
                producto.getPrecioUnitario(),
                producto.getTotalPagar(),
                producto.getEstado()
            };
            modelo.addRow(fila);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnBuscarproducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentatotal = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("N° Documento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyPressed(evt);
            }
        });
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 240, 30));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar2.png"))); // NOI18N
        btnEditar.setText(" Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 80, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cliente: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 30));
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 240, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Direccion : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 30));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 240, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 50, 30));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "F" }));
        getContentPane().add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 80, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fecha: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 70, 30));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 80, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Producto: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, 30));

        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductoKeyPressed(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 240, 30));

        btnBuscarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarproductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarproductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarproductoMouseExited(evt);
            }
        });
        getContentPane().add(btnBuscarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 50, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Stock : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 60, 30));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, 30));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 30));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 30));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnEliminar.setText("Borrar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 80, 30));

        tblVentatotal.setBackground(new java.awt.Color(255, 204, 102));
        tblVentatotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Cantidad", "Precio UND", "Total"
            }
        ));
        tblVentatotal.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tblVentatotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentatotalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVentatotal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 690, 150));

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nueva-pagina.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, 40));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 130, 40));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion-chico.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 130, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("SUB. TOTAL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 110, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("IGV:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));
        getContentPane().add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 110, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 110, 30));
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 80, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("REGISTRO DE VENTA");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo bl.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -10, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tblVentatotal.getSelectedRow();

        // Verifica si hay una fila seleccionada
        if (selectedRow != -1) {
            // Elimina la fila seleccionada del modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tblVentatotal.getModel();
            modelo.removeRow(selectedRow);

            // Elimina el producto correspondiente de la lista
            listaProductos.remove(selectedRow);

        } else {
            // Muestra un mensaje de advertencia indicando que no hay fila seleccionada
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(249, 162, 28));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarproductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarproductoMouseExited
        btnBuscarproducto.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarproductoMouseExited

    private void btnBuscarproductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarproductoMouseEntered
        btnBuscarproducto.setBackground(new Color(249, 162, 28));
    }//GEN-LAST:event_btnBuscarproductoMouseEntered

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        btnNuevo.setBackground(new Color(249, 162, 28));
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        btnNuevo.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(249, 162, 28));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(242, 90, 99));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(201, 253, 126));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(255, 239, 78));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(245, 139, 124));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String clienteBuscar = txtDocumento.getText().trim();

        DTOCliente objeto = new DTOCliente(clienteBuscar);

        DAOCliente objetoD = new DAOCliente();
        objetoD.buscar(objeto);

        // Verificar si se encontraron resultados
        if (objeto.isResultadoEncontrado()) {

            String nombreCliente = objeto.getNombreCliente();
            String direccion = objeto.getDireccion();

            txtCliente.setText(nombreCliente);
            txtDireccion.setText(direccion);
        } else {
            JOptionPane.showMessageDialog(this, "¡Documento no encontrado en la base de datos!", "Error", JOptionPane.ERROR_MESSAGE);

            txtCliente.setText("");
            txtDireccion.setText("");
        }
        habilitarBotones(false, true, false, false, false, true, false);
        habilitarTxt(false, true, true, false, true, false, true, false, false, false, false, false);
        txtSerie.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_txtDocumentoKeyPressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (!txtDocumento.getText().isEmpty()) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea ingresar un nuevo documento?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                return;
            }
        }
        habilitarBotones(true, false, false, false, false, false, false);
        habilitarTxt(true, false, false, false, false, false, false, false, false, false, false, false);
        txtDocumento.requestFocus();
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarproductoMouseClicked
        String buscarProducto = txtProducto.getText().trim();

        DTOProducto objeto = new DTOProducto(buscarProducto);

        DAOProducto objetoD = new DAOProducto();
        objetoD.buscar(objeto);

        // Verificar si se encontraron resultados
        if (objeto.isResultadoEncontrado()) {

            String nombreProducto = objeto.getNombreProd();
            int stock = objeto.getStock();

            txtProducto.setText(nombreProducto);
            txtStock.setText(String.valueOf(stock));

            habilitarBotones(false, true, true, false, false, true, false);
            habilitarTxt(false, true, true, false, true, false, true, true, false, false, false, false);
            txtCantidad.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "¡Producto no encontrado en la base de datos!", "Error", JOptionPane.ERROR_MESSAGE);

            txtProducto.setText("");
            txtCantidad.setText("");
            txtStock.setText("");
        }
        habilitarBotones(false, true, true, false, false, true, false);
        habilitarTxt(false, true, true, false, true, false, true, true, false, false, false, false);
        txtCantidad.requestFocus();
    }//GEN-LAST:event_btnBuscarproductoMouseClicked

    private void tblVentatotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentatotalMouseClicked
        habilitarBotones(false, true, false, true, true, true, true);
        habilitarTxt(false, true, true, false, true, false, true, true, false, false, false, false);
    }//GEN-LAST:event_tblVentatotalMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Busque un producto");
        } else {
            // Validar que ingrese una cantidad
            if (!txtCantidad.getText().isEmpty()) {
                // Validar que el usuario no ingrese caracteres no numéricos
                boolean validacion = validar(txtCantidad.getText());
                if (validacion == true) {
                    // Validar que la cantidad sea mayor a cero
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    if (cantidad > 0) {

                        DAOVentas daoVentas = new DAOVentas();

                        DTOProducto producto = new DTOProducto();
                        producto.setNombreProd(txtProducto.getText().trim());
                        daoVentas.DatosDelProducto(producto);

                        if (cantidad <= producto.getStock()) {
                            double precioUnitario = producto.getPrecioprod();
                            double totalPagar = cantidad * precioUnitario;

                            totalPagar = (double) Math.round(totalPagar * 100) / 100;

                            // Crear un nuevo producto
                            DTODetalleVenta detalleVenta = new DTODetalleVenta(
                                    idDetalleVenta, // idDetalleVenta
                                    1, // idCabecera
                                    producto.getIdProducto(),
                                    producto.getNombreProd(),
                                    producto.getDescripcionprod(),
                                    cantidad,
                                    precioUnitario,
                                    totalPagar,
                                    1 // estado
                            );

                            // Añadir el producto a la lista
                            listaProductos.add(detalleVenta);
                            idDetalleVenta++;

                            habilitarBotones(false, true, true, false, false, true, true);
                            habilitarTxt(false, true, true, false, true, false, true, false, false, false, false, false);
                            limpiarProd();

                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad supera el Stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero (0) ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numéricos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos");
            }
        }
        listaTablaProductos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarproductoMouseClicked(null);
        }
    }//GEN-LAST:event_txtProductoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarproducto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVentatotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
