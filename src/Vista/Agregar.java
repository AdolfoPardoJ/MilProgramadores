/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.awt.Toolkit;


public class Agregar extends javax.swing.JFrame {

   public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo_chocolate.png"));


        return retValue;
    }
  

  
    public javax.swing.JRadioButton getjNo() {
        return jNo;
    }

    /**
     * @param jNo the jNo to set
     */
    public void setjNo(javax.swing.JRadioButton jNo) {
        this.jNo = jNo;
    }

    /**
     * @return the jSi
     */
    public javax.swing.JRadioButton getjSi() {
        return jSi;
    }

    /**
     * @param jSi the jSi to set
     */
    public void setjSi(javax.swing.JRadioButton jSi) {
        this.jSi = jSi;
    }

    /**
     * @return the btnAgregar
     */
    public javax.swing.JButton getBtnAgregar() {
        return btnAgregar;
    }

    /**
     * @param btnAgregar the btnAgregar to set
     */
    public void setBtnAgregar(javax.swing.JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    /**
     * @return the buttonGroup1
     */
    public javax.swing.ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    /**
     * @param buttonGroup1 the buttonGroup1 to set
     */
    public void setButtonGroup1(javax.swing.ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    /**
     * @return the buttonGroup2
     */
    public javax.swing.ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    /**
     * @param buttonGroup2 the buttonGroup2 to set
     */
    public void setButtonGroup2(javax.swing.ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
    }

    /**
     * @return the jAgregar
     */
    public javax.swing.JMenu getjAgregar() {
        return jAgregar;
    }

    /**
     * @param jAgregar the jAgregar to set
     */
    public void setjAgregar(javax.swing.JMenu jAgregar) {
        this.jAgregar = jAgregar;
    }

    public javax.swing.JMenu getjEliminar() {
        return jEliminar;
    }

    /**
     * @param jEliminar the jEliminar to set
     */
    public void setjEliminar(javax.swing.JMenu jEliminar) {
        this.jEliminar = jEliminar;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return getjCodigo();
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.setjCodigo(jLabel1);
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return getjNombre();
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.setjNombre(jLabel2);
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return getjStock();
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.setjStock(jLabel3);
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return getjTipo();
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.setjTipo(jLabel4);
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return getjCola();
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.setjCola(jLabel5);
    }

    /**
     * @return the jLabel6
     */
 
    

    /**
     * @return the jListar
     */
    public javax.swing.JMenu getjListar() {
        return jListar;
    }

    /**
     * @param jListar the jListar to set
     */
    public void setjListar(javax.swing.JMenu jListar) {
        this.jListar = jListar;
    }

    /**
     * @return the jMenuBar1
     */
    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    /**
     * @param jMenuBar1 the jMenuBar1 to set
     */
    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    /**
     * @return the jModificar
     */
    public javax.swing.JMenu getjModificar() {
        return jModificar;
    }

    /**
     * @param jModificar the jModificar to set
     */
    public void setjModificar(javax.swing.JMenu jModificar) {
        this.jModificar = jModificar;
    }

    /**
     * @return the jRadioButton1
     */
    public javax.swing.JRadioButton getjRadioButton1() {
        return getjSi();
    }

    /**
     * @param jRadioButton1 the jRadioButton1 to set
     */
    public void setjRadioButton1(javax.swing.JRadioButton jRadioButton1) {
        this.setjSi(jRadioButton1);
    }

    /**
     * @return the jRadioButton2
     */
    public javax.swing.JRadioButton getjRadioButton2() {
        return getjNo();
    }

    /**
     * @param jRadioButton2 the jRadioButton2 to set
     */
    public void setjRadioButton2(javax.swing.JRadioButton jRadioButton2) {
        this.setjNo(jRadioButton2);
    }

    /**
     * @return the txtCodigo
     */
    public javax.swing.JTextField getTxtCodigo() {
        return txtCodigo;
    }

    /**
     * @param txtCodigo the txtCodigo to set
     */
    public void setTxtCodigo(javax.swing.JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    /**
     * @return the txtNombre
     */
    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    /**
     * @param txtNombre the txtNombre to set
     */
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    /**
     * @return the txtStock
     */
    public javax.swing.JTextField getTxtStock() {
        return getTxtDescripcion();
    }

    /**
     * @param txtStock the txtStock to set
     */
    public void setTxtStock(javax.swing.JTextField txtStock) {
        this.setTxtDescripcion(txtStock);
    }

    /**
     * @return the txtTipo
     */
  

    /**
     * @param txtTipo the txtTipo to set
     */
    

    /**
     * Creates new form Menu
     */
    public Agregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jNombre = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jStock = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        jCola = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jSi = new javax.swing.JRadioButton();
        jNo = new javax.swing.JRadioButton();
        txtTipo = new javax.swing.JComboBox<>();
        txtSabor = new javax.swing.JComboBox<>();
        jTipo1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JComboBox<>();
        jTipo2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jStock1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jStock2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAgregar = new javax.swing.JMenu();
        jListar = new javax.swing.JMenu();
        jEliminar = new javax.swing.JMenu();
        jModificar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jCodigo.setText("Código");

        jNombre.setText("Nombre");

        jStock.setText("Descripción");

        jTipo.setText("Tipo");

        jCola.setText("Con azúcar?");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jSi);
        jSi.setText("Sí");

        buttonGroup1.add(jNo);
        jNo.setText("No");

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Blanco", "Negro", "Con Fruta" }));

        txtSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Bitter", "Leche", "Blanco" }));

        jTipo1.setText("Sabor");

        txtMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nestlé", "Costa", "LaFete", "Entrelagos" }));

        jTipo2.setText("Marca");

        txtPrecio.setText("0");

        jStock1.setText("Precio");

        txtCantidad.setText("0");

        jStock2.setText("Cantidad");

        btnLimpiar.setText("Limpiar");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chocolate1.png"))); // NOI18N

        jAgregar.setText("Agregar");
        jAgregar.setEnabled(false);
        jMenuBar1.add(jAgregar);

        jListar.setText("Listar");
        jMenuBar1.add(jListar);

        jEliminar.setText("Eliminar");
        jMenuBar1.add(jEliminar);

        jModificar.setText("Modificar");
        jMenuBar1.add(jModificar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCola, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jNo))
                            .addComponent(txtMarca, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtSabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock2)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipo1)
                    .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipo2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCola)
                    .addComponent(jSi)
                    .addComponent(jNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu jAgregar;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jCola;
    private javax.swing.JMenu jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jModificar;
    private javax.swing.JRadioButton jNo;
    private javax.swing.JLabel jNombre;
    private javax.swing.JRadioButton jSi;
    private javax.swing.JLabel jStock;
    private javax.swing.JLabel jStock1;
    private javax.swing.JLabel jStock2;
    private javax.swing.JLabel jTipo;
    private javax.swing.JLabel jTipo1;
    private javax.swing.JLabel jTipo2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JComboBox<String> txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JComboBox<String> txtSabor;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jCola
     */
    public javax.swing.JLabel getjCola() {
        return jCola;
    }

    /**
     * @param jCola the jCola to set
     */
    public void setjCola(javax.swing.JLabel jCola) {
        this.jCola = jCola;
    }

    /**
     * @return the jTipo
     */
    public javax.swing.JLabel getjTipo() {
        return jTipo;
    }

    /**
     * @param jTipo the jTipo to set
     */
    public void setjTipo(javax.swing.JLabel jTipo) {
        this.jTipo = jTipo;
    }

    /**
     * @return the jCodigo
     */
    public javax.swing.JLabel getjCodigo() {
        return jCodigo;
    }

    /**
     * @param jCodigo the jCodigo to set
     */
    public void setjCodigo(javax.swing.JLabel jCodigo) {
        this.jCodigo = jCodigo;
    }

    /**
     * @return the jNombre
     */
    public javax.swing.JLabel getjNombre() {
        return jNombre;
    }

    /**
     * @param jNombre the jNombre to set
     */
    public void setjNombre(javax.swing.JLabel jNombre) {
        this.jNombre = jNombre;
    }

    /**
     * @return the jStock
     */
    public javax.swing.JLabel getjStock() {
        return jStock;
    }

    /**
     * @param jStock the jStock to set
     */
    public void setjStock(javax.swing.JLabel jStock) {
        this.jStock = jStock;
    }

    /**
     * @return the txtTipo
     */
    public javax.swing.JComboBox<String> getTxtTipo() {
        return txtTipo;
    }

    /**
     * @param txtTipo the txtTipo to set
     */
    public void setTxtTipo(javax.swing.JComboBox<String> txtTipo) {
        this.txtTipo = txtTipo;
    }

    /**
     * @return the jStock1
     */
    public javax.swing.JLabel getjStock1() {
        return jStock1;
    }

    /**
     * @param jStock1 the jStock1 to set
     */
    public void setjStock1(javax.swing.JLabel jStock1) {
        this.jStock1 = jStock1;
    }

    /**
     * @return the jStock2
     */
    public javax.swing.JLabel getjStock2() {
        return jStock2;
    }

    /**
     * @param jStock2 the jStock2 to set
     */
    public void setjStock2(javax.swing.JLabel jStock2) {
        this.jStock2 = jStock2;
    }

    /**
     * @return the jTipo1
     */
    public javax.swing.JLabel getjTipo1() {
        return jTipo1;
    }

    /**
     * @param jTipo1 the jTipo1 to set
     */
    public void setjTipo1(javax.swing.JLabel jTipo1) {
        this.jTipo1 = jTipo1;
    }

    /**
     * @return the jTipo2
     */
    public javax.swing.JLabel getjTipo2() {
        return jTipo2;
    }

    /**
     * @param jTipo2 the jTipo2 to set
     */
    public void setjTipo2(javax.swing.JLabel jTipo2) {
        this.jTipo2 = jTipo2;
    }

    /**
     * @return the txtCantidad
     */
    public javax.swing.JTextField getTxtCantidad() {
        return txtCantidad;
    }

    /**
     * @param txtCantidad the txtCantidad to set
     */
    public void setTxtCantidad(javax.swing.JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    /**
     * @return the txtDescripcion
     */
    public javax.swing.JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    /**
     * @param txtDescripcion the txtDescripcion to set
     */
    public void setTxtDescripcion(javax.swing.JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    /**
     * @return the txtMarca
     */
    public javax.swing.JComboBox<String> getTxtMarca() {
        return txtMarca;
    }

    /**
     * @param txtMarca the txtMarca to set
     */
    public void setTxtMarca(javax.swing.JComboBox<String> txtMarca) {
        this.txtMarca = txtMarca;
    }

    /**
     * @return the txtPrecio
     */
    public javax.swing.JTextField getTxtPrecio() {
        return txtPrecio;
    }

    /**
     * @param txtPrecio the txtPrecio to set
     */
    public void setTxtPrecio(javax.swing.JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    /**
     * @return the txtSabor
     */
    public javax.swing.JComboBox<String> getTxtSabor() {
        return txtSabor;
    }

    /**
     * @param txtSabor the txtSabor to set
     */
    public void setTxtSabor(javax.swing.JComboBox<String> txtSabor) {
        this.txtSabor = txtSabor;
    }

    /**
     * @return the btnLimpiar
     */
    public javax.swing.JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    /**
     * @param btnLimpiar the btnLimpiar to set
     */
    public void setBtnLimpiar(javax.swing.JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }
}
