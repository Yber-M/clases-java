package clasesHerencia;

import javax.swing.JOptionPane;

/**
 * @Marlon Yber Quispe Olano 
 */
public class frmTallerAbogados extends javax.swing.JFrame {
    double bonoCssApoyo = 200;
    double bonoCssAcargo = 500;
    
    double bonoCssACargoSNR = 2000;
    
    double bonoCssACargoSCO = 10000;
    
    public frmTallerAbogados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlJNR = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultadosJNR = new javax.swing.JTextArea();
        btnExitJNR = new javax.swing.JButton();
        btnActualizarJNR = new javax.swing.JButton();
        btnMostrarJNR = new javax.swing.JButton();
        txfNameJNR = new javax.swing.JTextField();
        txfCantHjsJNR = new javax.swing.JTextField();
        txfYearsExpJNR = new javax.swing.JTextField();
        cbxCargoJNR = new javax.swing.JComboBox<>();
        txfCssAcargoJNR = new javax.swing.JTextField();
        txfCssApoyoJNR = new javax.swing.JTextField();
        pnlSNR = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResultadosSNR = new javax.swing.JTextArea();
        btnSalirSNR = new javax.swing.JButton();
        btnActualizarSNR = new javax.swing.JButton();
        btnMostrarSNR = new javax.swing.JButton();
        txfNameSNR = new javax.swing.JTextField();
        txfCantHjsSNR = new javax.swing.JTextField();
        txfYearsExpSNR = new javax.swing.JTextField();
        cbxCargoSNR = new javax.swing.JComboBox<>();
        txfCssAcargoSNR = new javax.swing.JTextField();
        pnlSCO = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaResultadosSCO = new javax.swing.JTextArea();
        btnSalirSCO = new javax.swing.JButton();
        btnActualizarSCO = new javax.swing.JButton();
        btnMostrarSCO = new javax.swing.JButton();
        txfNameSCO = new javax.swing.JTextField();
        txfCantHjsSCO = new javax.swing.JTextField();
        txfYearsExpSCO = new javax.swing.JTextField();
        cbxCargoSCO = new javax.swing.JComboBox<>();
        txfCssAcargoSCO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlJNR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJNR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaResultadosJNR.setColumns(20);
        txaResultadosJNR.setRows(5);
        jScrollPane1.setViewportView(txaResultadosJNR);

        pnlJNR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 550, 170));

        btnExitJNR.setText("SALIR");
        btnExitJNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitJNRActionPerformed(evt);
            }
        });
        pnlJNR.add(btnExitJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 40));

        btnActualizarJNR.setText("ACTUALIZAR");
        btnActualizarJNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarJNRActionPerformed(evt);
            }
        });
        pnlJNR.add(btnActualizarJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 40));

        btnMostrarJNR.setText("MOSTRAR");
        btnMostrarJNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarJNRActionPerformed(evt);
            }
        });
        pnlJNR.add(btnMostrarJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 40));

        txfNameJNR.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellidos"));
        pnlJNR.add(txfNameJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 60));

        txfCantHjsJNR.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Hijos"));
        pnlJNR.add(txfCantHjsJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 80, 60));

        txfYearsExpJNR.setBorder(javax.swing.BorderFactory.createTitledBorder("Años Exp"));
        pnlJNR.add(txfYearsExpJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 60));

        cbxCargoJNR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~~ SELECCIONE EL CARGO ~~", "Abg.Junior", "Abg.Senior", "Abg.Socio" }));
        pnlJNR.add(cbxCargoJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 60));

        txfCssAcargoJNR.setBorder(javax.swing.BorderFactory.createTitledBorder("N°Casos a Cargo"));
        pnlJNR.add(txfCssAcargoJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 60));

        txfCssApoyoJNR.setBorder(javax.swing.BorderFactory.createTitledBorder("N°Casos de Apoyo"));
        pnlJNR.add(txfCssApoyoJNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 130, 60));

        jTabbedPane1.addTab("Abogado Junior", pnlJNR);

        pnlSNR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSNR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaResultadosSNR.setColumns(20);
        txaResultadosSNR.setRows(5);
        jScrollPane2.setViewportView(txaResultadosSNR);

        pnlSNR.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 550, 170));

        btnSalirSNR.setText("SALIR");
        btnSalirSNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSNRActionPerformed(evt);
            }
        });
        pnlSNR.add(btnSalirSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 40));

        btnActualizarSNR.setText("ACTUALIZAR");
        btnActualizarSNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSNRActionPerformed(evt);
            }
        });
        pnlSNR.add(btnActualizarSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 40));

        btnMostrarSNR.setText("MOSTRAR");
        btnMostrarSNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSNRActionPerformed(evt);
            }
        });
        pnlSNR.add(btnMostrarSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 40));

        txfNameSNR.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellidos"));
        pnlSNR.add(txfNameSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 60));

        txfCantHjsSNR.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Hijos"));
        pnlSNR.add(txfCantHjsSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 60));

        txfYearsExpSNR.setBorder(javax.swing.BorderFactory.createTitledBorder("Años Exp"));
        pnlSNR.add(txfYearsExpSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 80, 60));

        cbxCargoSNR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~~ SELECCIONE EL CARGO ~~", "Abg.Junior", "Abg.Senior", "Abg.Socio" }));
        pnlSNR.add(cbxCargoSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 60));

        txfCssAcargoSNR.setBorder(javax.swing.BorderFactory.createTitledBorder("N°Casos a Cargo"));
        pnlSNR.add(txfCssAcargoSNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, 60));

        jTabbedPane1.addTab("Abogado Senior", pnlSNR);

        pnlSCO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSCO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaResultadosSCO.setColumns(20);
        txaResultadosSCO.setRows(5);
        jScrollPane3.setViewportView(txaResultadosSCO);

        pnlSCO.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 550, 170));

        btnSalirSCO.setText("SALIR");
        btnSalirSCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSCOActionPerformed(evt);
            }
        });
        pnlSCO.add(btnSalirSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 40));

        btnActualizarSCO.setText("ACTUALIZAR");
        btnActualizarSCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSCOActionPerformed(evt);
            }
        });
        pnlSCO.add(btnActualizarSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 40));

        btnMostrarSCO.setText("MOSTRAR");
        btnMostrarSCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSCOActionPerformed(evt);
            }
        });
        pnlSCO.add(btnMostrarSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 40));

        txfNameSCO.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellidos"));
        pnlSCO.add(txfNameSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 60));

        txfCantHjsSCO.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Hijos"));
        pnlSCO.add(txfCantHjsSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 60));

        txfYearsExpSCO.setBorder(javax.swing.BorderFactory.createTitledBorder("Años Exp"));
        pnlSCO.add(txfYearsExpSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 80, 60));

        cbxCargoSCO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~~ SELECCIONE EL CARGO ~~", "Abg.Junior", "Abg.Senior", "Abg.Socio" }));
        pnlSCO.add(cbxCargoSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 60));

        txfCssAcargoSCO.setBorder(javax.swing.BorderFactory.createTitledBorder("N°Casos a Cargo"));
        pnlSCO.add(txfCssAcargoSCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, 60));

        jTabbedPane1.addTab("Abogado Socio", pnlSCO);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarJNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarJNRActionPerformed
        //ABOGADO JUNIOR
        int cantCssApoyo = Integer.parseInt(txfCssApoyoJNR.getText());
        String tipoAbogado = cbxCargoJNR.getSelectedItem().toString();
        String name = txfNameJNR.getText();
        int cantHjs = Integer.parseInt(txfCantHjsJNR.getText());
        int yearsExp = Integer.parseInt(txfYearsExpJNR.getText());
        int cantCssAcargo = Integer.parseInt(txfCssAcargoJNR.getText());
        
        abogadoJunior abogadoJNR = new abogadoJunior(cantCssApoyo, bonoCssApoyo,
                tipoAbogado, name, cantHjs, yearsExp, 2500.00, cantCssAcargo, bonoCssAcargo);
        txaResultadosJNR.append(abogadoJNR.mensaje());

    }//GEN-LAST:event_btnMostrarJNRActionPerformed

    private void btnActualizarJNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarJNRActionPerformed
        //ABOGADO JUNIOR
        bonoCssApoyo = Double.parseDouble(JOptionPane.showInputDialog("Nuevo Monto de Bono Apoyo : "));
        bonoCssAcargo = Double.parseDouble(JOptionPane.showInputDialog("Nuevo Monto de Bono a Cargo : "));
    }//GEN-LAST:event_btnActualizarJNRActionPerformed

    private void btnExitJNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitJNRActionPerformed
        //ABOGADO JUNIOR
        System.exit(0);
    }//GEN-LAST:event_btnExitJNRActionPerformed

    private void btnMostrarSNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSNRActionPerformed
        //ABOGADO SENIOR
        String tipoAbogado = cbxCargoSNR.getSelectedItem().toString();
        String name = txfNameSNR.getText();
        int cantHjs = Integer.parseInt(txfCantHjsSNR.getText());
        int yearsExp = Integer.parseInt(txfYearsExpSNR.getText());
        int cantCssAcargo = Integer.parseInt(txfCssAcargoSNR.getText());
        
        abogadoSenior abogadoSNR = new abogadoSenior(tipoAbogado, name, cantHjs,
                yearsExp, 4000.00, cantCssAcargo, bonoCssACargoSNR);
        txaResultadosSNR.append(abogadoSNR.mensaje());
    }//GEN-LAST:event_btnMostrarSNRActionPerformed

    private void btnActualizarSNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSNRActionPerformed
        //ABOGADO SENIOR
        bonoCssACargoSNR = Double.parseDouble(JOptionPane.showInputDialog("Nuevo Monto de Bono a Cargo : "));
    }//GEN-LAST:event_btnActualizarSNRActionPerformed

    private void btnSalirSNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSNRActionPerformed
        //ABOGADO SENIOR
        System.exit(0);
    }//GEN-LAST:event_btnSalirSNRActionPerformed

    private void btnMostrarSCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSCOActionPerformed
        //ABOGADO SOCIO
        String tipoAbogado = cbxCargoSCO.getSelectedItem().toString();
        String name = txfNameSCO.getText();
        int cantHjs = Integer.parseInt(txfCantHjsSCO.getText());
        int yearsExp = Integer.parseInt(txfYearsExpSCO.getText());
        int cantCssAcargo = Integer.parseInt(txfCssAcargoSCO.getText());
        
        abogadoSocio abogadoSCO = new abogadoSocio(tipoAbogado, name, cantHjs,
                yearsExp, 10000.00, cantCssAcargo, bonoCssACargoSCO);
        txaResultadosSCO.append(abogadoSCO.mensaje());
    }//GEN-LAST:event_btnMostrarSCOActionPerformed

    private void btnActualizarSCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSCOActionPerformed
        //ABOGADO SOCIO
        bonoCssACargoSCO = Double.parseDouble(JOptionPane.showInputDialog("Nuevo Monto de Bono a Cargo : "));
    }//GEN-LAST:event_btnActualizarSCOActionPerformed

    private void btnSalirSCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSCOActionPerformed
        //ABOGADO SOCIO
        System.exit(0);
    }//GEN-LAST:event_btnSalirSCOActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTallerAbogados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTallerAbogados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTallerAbogados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTallerAbogados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTallerAbogados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarJNR;
    private javax.swing.JButton btnActualizarSCO;
    private javax.swing.JButton btnActualizarSNR;
    private javax.swing.JButton btnExitJNR;
    private javax.swing.JButton btnMostrarJNR;
    private javax.swing.JButton btnMostrarSCO;
    private javax.swing.JButton btnMostrarSNR;
    private javax.swing.JButton btnSalirSCO;
    private javax.swing.JButton btnSalirSNR;
    private javax.swing.JComboBox<String> cbxCargoJNR;
    private javax.swing.JComboBox<String> cbxCargoSCO;
    private javax.swing.JComboBox<String> cbxCargoSNR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlJNR;
    private javax.swing.JPanel pnlSCO;
    private javax.swing.JPanel pnlSNR;
    private javax.swing.JTextArea txaResultadosJNR;
    private javax.swing.JTextArea txaResultadosSCO;
    private javax.swing.JTextArea txaResultadosSNR;
    private javax.swing.JTextField txfCantHjsJNR;
    private javax.swing.JTextField txfCantHjsSCO;
    private javax.swing.JTextField txfCantHjsSNR;
    private javax.swing.JTextField txfCssAcargoJNR;
    private javax.swing.JTextField txfCssAcargoSCO;
    private javax.swing.JTextField txfCssAcargoSNR;
    private javax.swing.JTextField txfCssApoyoJNR;
    private javax.swing.JTextField txfNameJNR;
    private javax.swing.JTextField txfNameSCO;
    private javax.swing.JTextField txfNameSNR;
    private javax.swing.JTextField txfYearsExpJNR;
    private javax.swing.JTextField txfYearsExpSCO;
    private javax.swing.JTextField txfYearsExpSNR;
    // End of variables declaration//GEN-END:variables
}
/**
 * @author Yber-M
 */