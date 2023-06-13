/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Planilla;

import javax.swing.JOptionPane;
/**
*
* @author QUISPE OLANO, MARLON YBER
*/
public class jfmEmpleados extends javax.swing.JFrame {
    Empleados objEmpleado;

    /**
     * Creates new form jfmEmpleados
     */
    public jfmEmpleados() {
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

        jPanel1 = new javax.swing.JPanel();
        jcbxAreaLaboral = new javax.swing.JComboBox<>();
        jcbxTipoSeguro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtHorasExtras = new javax.swing.JTextField();
        jtxtSueldoBase = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jbtnCrearObjeto = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnMostrarInfo = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planilla de Empleados");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jcbxAreaLaboral.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jcbxAreaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- SELECCIONE ---", "Sistemas", "Administración", "Marketing" }));

        jcbxTipoSeguro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jcbxTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- SELECCIONE ---", "AFP", "SNP" }));

        jLabel1.setFont(new java.awt.Font("mononoki", 1, 12)); // NOI18N
        jLabel1.setText("Tipo de Seguro");

        jLabel2.setFont(new java.awt.Font("mononoki", 1, 12)); // NOI18N
        jLabel2.setText("Área Laboral");

        jtxtHorasExtras.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jtxtHorasExtras.setForeground(new java.awt.Color(255, 0, 0));
        jtxtHorasExtras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Extras"));

        jtxtSueldoBase.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jtxtSueldoBase.setForeground(new java.awt.Color(0, 204, 0));
        jtxtSueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base"));

        jtxtNombre.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellidos"));

        jtxtCode.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jtxtCode.setForeground(new java.awt.Color(51, 51, 255));
        jtxtCode.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        jtxtArea.setBackground(new java.awt.Color(153, 153, 153));
        jtxtArea.setColumns(20);
        jtxtArea.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jtxtArea.setForeground(new java.awt.Color(255, 255, 0));
        jtxtArea.setRows(5);
        jScrollPane1.setViewportView(jtxtArea);

        jbtnCrearObjeto.setBackground(new java.awt.Color(153, 255, 153));
        jbtnCrearObjeto.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jbtnCrearObjeto.setText("CREAR OBJETO");
        jbtnCrearObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearObjetoActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        jbtnLimpiar.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnMostrarInfo.setBackground(new java.awt.Color(51, 51, 255));
        jbtnMostrarInfo.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        jbtnMostrarInfo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMostrarInfo.setText("MOSTRAR INFORMACIÓN DEL OBJETO");
        jbtnMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarInfoActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 0, 0));
        jbtnExit.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("SALIR");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("mononoki", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("S/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnMostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtHorasExtras)
                                    .addComponent(jtxtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbxTipoSeguro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbxAreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 31, Short.MAX_VALUE))
                            .addComponent(jtxtNombre))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnCrearObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCode))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jbtnCrearObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jtxtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbxTipoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jcbxAreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCrearObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearObjetoActionPerformed
        /**
        *
        * @author QUISPE OLANO, MARLON YBER
        */
        // INSTRUCCIONES
        String cod = jtxtCode.getText();
        String nam = jtxtNombre.getText();
        String are = jcbxAreaLaboral.getSelectedItem().toString();
        String segu = jcbxTipoSeguro.getSelectedItem().toString();
        double $bass = Double.parseDouble(jtxtSueldoBase.getText());
        int hExt = Integer.parseInt(jtxtHorasExtras.getText());
        
        // OBJETO
        objEmpleado = new Empleados(cod,nam,are,segu,$bass,hExt);
        
        // MENSAJE QUE INDICA QUE EL OBJETO A SIDO CREADO
        JOptionPane.showMessageDialog(null,"-------------------------------- EL OBJETO '" + jtxtNombre.getText() + "' FUE CREADO CON ÉXITO --------------------------------"
                + "\n Seguidamente PRESIONE el botón 'MOSTRAR INFORMACIÓN DEL OBJETO' para CONTINUAR");
    }//GEN-LAST:event_jbtnCrearObjetoActionPerformed

    private void jbtnMostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarInfoActionPerformed
        /**
        *
        * @author QUISPE OLANO, MARLON YBER
        */
        jtxtArea.append("Código              : "+ objEmpleado.code+"\n");
        jtxtArea.append("Nombre              : "+ objEmpleado.name+"\n");
        jtxtArea.append("Area                : "+ objEmpleado.area+"\n");
        jtxtArea.append("Seguro              : "+ objEmpleado.seguro+"\n");
        jtxtArea.append("Sueldo Base         : "+objEmpleado.$base+"\n");
        jtxtArea.append("Horas Extras        : "+objEmpleado.hExtras+"\n");
        jtxtArea.append("Monto Extra         : "+objEmpleado.montHextra()+"\n");
        jtxtArea.append("Monto Seguro        : "+objEmpleado.montSeguro()+"\n");
        jtxtArea.append("Monto EsSalud       : "+objEmpleado.montEssalud()+"\n");
        jtxtArea.append("Monto de Descuento  : "+objEmpleado.montDsct()+"\n");
        jtxtArea.append("Sueldo Bruto        : "+objEmpleado.mont$Bruto()+"\n");
        jtxtArea.append("Sueldo Neto         : "+objEmpleado.mont$Neto());
        
    }//GEN-LAST:event_jbtnMostrarInfoActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        /**
        *
        * @author QUISPE OLANO, MARLON YBER
        */
        // PONER VALORES EN BLANCO
        jtxtCode.setText("");
        jtxtNombre.setText("");
        jcbxAreaLaboral.setSelectedIndex(0);
        jcbxTipoSeguro.setSelectedIndex(0);
        jtxtSueldoBase.setText("");
        jtxtHorasExtras.setText("");
        jtxtCode.setText("");
        jtxtArea.setText("");
        
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        /**
        *
        * @author QUISPE OLANO, MARLON YBER
        */        
        // CERRAR PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(jfmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCrearObjeto;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnMostrarInfo;
    private javax.swing.JComboBox<String> jcbxAreaLaboral;
    private javax.swing.JComboBox<String> jcbxTipoSeguro;
    private javax.swing.JTextArea jtxtArea;
    private javax.swing.JTextField jtxtCode;
    private javax.swing.JTextField jtxtHorasExtras;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSueldoBase;
    // End of variables declaration//GEN-END:variables
}
