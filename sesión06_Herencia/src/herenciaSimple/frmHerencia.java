package herenciaSimple;


//Marlon Yber Quipe Olano
import rsscalelabel.RSScaleLabel;
public class frmHerencia extends javax.swing.JFrame {
    
    public frmHerencia() {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblBorrar, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\biggarbagebin_121980.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblSalir, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\exit_icon-icons.com_70975.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblCrear, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\1904677-add-addition-calculate-charge-create-new-plus_122527.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblBorrar1, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\biggarbagebin_121980.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblSalir1, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\exit_icon-icons.com_70975.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblCrear1, "F:\\2do Ciclo\\sesión06_Herencia\\src\\iconos\\1904677-add-addition-calculate-charge-create-new-plus_122527.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jlblBorrar1 = new javax.swing.JLabel();
        jlblCrear1 = new javax.swing.JLabel();
        jlblSalir1 = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtTasaComisión = new javax.swing.JTextField();
        jtxtMontoVendido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaResultados = new javax.swing.JTextArea();
        jbtnExit = new javax.swing.JButton();
        jbtnCrearEmpleado = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblCrear = new javax.swing.JLabel();
        jlblBorrar = new javax.swing.JLabel();
        jlblSalir = new javax.swing.JLabel();
        jtxtDNI1 = new javax.swing.JTextField();
        jtxtNombre1 = new javax.swing.JTextField();
        jtxtApellidos1 = new javax.swing.JTextField();
        jtxtSueldoBase = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaResultados1 = new javax.swing.JTextArea();
        jbtnCrearEmpleado1 = new javax.swing.JButton();
        jbtnClear1 = new javax.swing.JButton();
        jbtnExit1 = new javax.swing.JButton();
        jcbxTipoAfiliacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblBorrar1.setText("jLabel3");
        jPanel1.add(jlblBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 20, 20));

        jlblCrear1.setText("jLabel3");
        jPanel1.add(jlblCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 20, 20));

        jlblSalir1.setText("jLabel3");
        jPanel1.add(jlblSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 20, 20));

        jtxtDNI.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(153, 153, 0));
        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel1.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 101, -1));

        jtxtNombre.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(102, 102, 255));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, -1));

        jtxtApellidos.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxtApellidos.setForeground(new java.awt.Color(102, 102, 255));
        jtxtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel1.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, -1));

        jtxtTasaComisión.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        jtxtTasaComisión.setForeground(new java.awt.Color(0, 153, 153));
        jtxtTasaComisión.setBorder(javax.swing.BorderFactory.createTitledBorder("Tasa de Comisión"));
        jPanel1.add(jtxtTasaComisión, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, -1));

        jtxtMontoVendido.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        jtxtMontoVendido.setForeground(new java.awt.Color(0, 204, 0));
        jtxtMontoVendido.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Vendido"));
        jPanel1.add(jtxtMontoVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, -1));

        jtxaResultados.setColumns(20);
        jtxaResultados.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxaResultados.setForeground(new java.awt.Color(0, 153, 153));
        jtxaResultados.setRows(5);
        jScrollPane1.setViewportView(jtxaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 514, 182));

        jbtnExit.setBackground(new java.awt.Color(255, 0, 0));
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Salir");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 42));

        jbtnCrearEmpleado.setBackground(new java.awt.Color(0, 0, 255));
        jbtnCrearEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCrearEmpleado.setText("Crear Empleado");
        jbtnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 192, 42));

        jbtnClear.setBackground(new java.awt.Color(255, 204, 0));
        jbtnClear.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClear.setText("Borrar");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 42));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("@uthor: Yb.M;");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 20));

        jTabbedPane1.addTab("Empleado Vendedor", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCrear.setText("jLabel3");
        jPanel2.add(jlblCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 20, 20));

        jlblBorrar.setText("jLabel3");
        jPanel2.add(jlblBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 20, 20));

        jlblSalir.setText("jLabel3");
        jPanel2.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 20, 20));

        jtxtDNI1.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        jtxtDNI1.setForeground(new java.awt.Color(153, 153, 0));
        jtxtDNI1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel2.add(jtxtDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 101, -1));

        jtxtNombre1.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxtNombre1.setForeground(new java.awt.Color(102, 102, 255));
        jtxtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));
        jPanel2.add(jtxtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, -1));

        jtxtApellidos1.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxtApellidos1.setForeground(new java.awt.Color(102, 102, 255));
        jtxtApellidos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel2.add(jtxtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, -1));

        jtxtSueldoBase.setFont(new java.awt.Font("mononoki", 1, 13)); // NOI18N
        jtxtSueldoBase.setForeground(new java.awt.Color(0, 204, 0));
        jtxtSueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base"));
        jPanel2.add(jtxtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 60));

        jtxaResultados1.setColumns(20);
        jtxaResultados1.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jtxaResultados1.setForeground(new java.awt.Color(0, 153, 153));
        jtxaResultados1.setRows(5);
        jScrollPane2.setViewportView(jtxaResultados1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 514, 182));

        jbtnCrearEmpleado1.setBackground(new java.awt.Color(0, 0, 255));
        jbtnCrearEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCrearEmpleado1.setText("Crear Empleado");
        jbtnCrearEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearEmpleado1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCrearEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 192, 42));

        jbtnClear1.setBackground(new java.awt.Color(255, 204, 0));
        jbtnClear1.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClear1.setText("Borrar");
        jbtnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClear1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 42));

        jbtnExit1.setBackground(new java.awt.Color(255, 0, 0));
        jbtnExit1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit1.setText("Salir");
        jbtnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExit1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 42));

        jcbxTipoAfiliacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFP", "SNP" }));
        jcbxTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Afiliación"));
        jPanel2.add(jcbxTipoAfiliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, 60));

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("mononoki", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("@uthor: Yb.M;");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 20));

        jTabbedPane1.addTab("Empleado Permanente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExit1ActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtTasaComisión.setText("");
        jtxtMontoVendido.setText("");
        jtxtDNI.setText("");
        jtxtApellidos.setText("");
        jtxtNombre.setText("");
        jtxaResultados.setText("");
        jtxtDNI.requestFocus();
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClear1ActionPerformed
        jtxtDNI1.setText("");
        jtxtApellidos1.setText("");
        jtxtNombre1.setText("");
        jtxtSueldoBase.setText("");
        jtxaResultados1.setText("");
        jcbxTipoAfiliacion.setSelectedIndex(0);
        jtxtDNI1.requestFocus();
    }//GEN-LAST:event_jbtnClear1ActionPerformed

    private void jbtnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearEmpleadoActionPerformed
        String dni = jtxtDNI.getText();
        String nom = jtxtNombre.getText();
        String ape = jtxtApellidos.getText();
        double mv = Double.parseDouble(jtxtMontoVendido.getText());
        double tc = Double.parseDouble(jtxtTasaComisión.getText());
        
        clasEmpld_Vendedor nuevo = new clasEmpld_Vendedor(dni, ape, nom, mv, tc);
        
        
        jtxaResultados.append(nuevo.mostrarInfo());
    }//GEN-LAST:event_jbtnCrearEmpleadoActionPerformed

    private void jbtnCrearEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearEmpleado1ActionPerformed
        String dni = jtxtDNI1.getText();
        String nom = jtxtNombre1.getText();
        String ape = jtxtApellidos1.getText();
        double s_base = Double.parseDouble(jtxtSueldoBase.getText());
        String tipo_af = jcbxTipoAfiliacion.getSelectedItem().toString();
        
        clasEmpld_Permanente nuevo1 = new clasEmpld_Permanente(dni, ape, nom, s_base, tipo_af);
        
        jtxaResultados1.append(nuevo1.mostrarInfo());
    }//GEN-LAST:event_jbtnCrearEmpleado1ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHerencia().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnClear1;
    private javax.swing.JButton jbtnCrearEmpleado;
    private javax.swing.JButton jbtnCrearEmpleado1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnExit1;
    private javax.swing.JComboBox<String> jcbxTipoAfiliacion;
    private javax.swing.JLabel jlblBorrar;
    private javax.swing.JLabel jlblBorrar1;
    private javax.swing.JLabel jlblCrear;
    private javax.swing.JLabel jlblCrear1;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel jlblSalir1;
    private javax.swing.JTextArea jtxaResultados;
    private javax.swing.JTextArea jtxaResultados1;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtApellidos1;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDNI1;
    private javax.swing.JTextField jtxtMontoVendido;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNombre1;
    private javax.swing.JTextField jtxtSueldoBase;
    private javax.swing.JTextField jtxtTasaComisión;
    // End of variables declaration//GEN-END:variables
}
