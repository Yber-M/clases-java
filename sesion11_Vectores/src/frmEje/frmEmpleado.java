/**
 * @author QUISPE OLANO, MARLON YBER
 */
package frmEje;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEmpleado extends javax.swing.JFrame {

    DefaultTableModel ModTable;
    empleado emp;
    empleado[] arrayEmpl = new empleado[100];
    String[][] data = {};
    String[] cabecera = {"N", "Código", "Nombre", "Area", "Tip.SEG", "Hr.Ext",
        "Sueldo", "Mont H.E", "Mont.SEG", "Mont.ESSALUD", "Sld.Neto"};
    int contEmpl;

    public frmEmpleado() {
        initComponents();
        ModTable = new DefaultTableModel(data, cabecera);
        tblDatosInsert.setModel(ModTable);
        contEmpl = 0;
    }

    void printDatos(empleado emp) {
        DecimalFormat df = new DecimalFormat("###.00");

        String me = df.format(emp.montHextra());
        String ms = df.format(emp.montSeguro());
        String mes = df.format(emp.montEssalud());
        String sn = df.format(emp.mont$Neto());

        Object[] filaObjects = {contEmpl + 1, emp.code, emp.name, emp.area, emp.seguro, emp.hExtras,
            emp.$base, me, ms, mes, sn};

        ModTable.addRow(filaObjects);
    }

    void cleanInput() {
        txtCod.setText("");
        txtName.setText("");
        cbxArea.setSelectedIndex(0);
        cbxTipSeguro.setSelectedIndex(0);
        txt$ueldoBase.setText("");
        txtHrsExtras.setText("");
        txtCod.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtHrsExtras = new javax.swing.JTextField();
        txt$ueldoBase = new javax.swing.JTextField();
        cbxTipSeguro = new javax.swing.JComboBox<>();
        cbxArea = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosInsert = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel1 = new javax.swing.JPanel();
        txtEmplMayorSueldoN = new javax.swing.JTextField();
        txtNempSistemMontHEquiYoch = new javax.swing.JTextField();
        txtProm$NetoMarketing = new javax.swing.JTextField();
        txtTotalApagarLaEmpresa = new javax.swing.JTextField();
        txtNumEmpMonSgMayorCien = new javax.swing.JTextField();
        txtEmpSNPmenorMontDsct = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 140, 50));

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 140, 50));

        btnClear.setText("LIMPIAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 140, 50));

        btnResumen.setText("RESUMEN");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });
        getContentPane().add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 140, 50));

        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres y Apellidos"));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 60));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 60));

        txtHrsExtras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Extras"));
        getContentPane().add(txtHrsExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 110, 60));

        txt$ueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base"));
        getContentPane().add(txt$ueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 110, 60));

        cbxTipSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "AFP", "SNP" }));
        cbxTipSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Seguro"));
        getContentPane().add(cbxTipSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 150, 60));

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "Sistemas", "Marketing", "Administración" }));
        cbxArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Area"));
        getContentPane().add(cbxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 60));

        tblDatosInsert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatosInsert);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 830, 110));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, 10));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 850, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("RESUMEN DE DATOS"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmplMayorSueldoN.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado con Mayor Sueldo Neto"));
        jPanel1.add(txtEmplMayorSueldoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 70));

        txtNempSistemMontHEquiYoch.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Emp. de Sistemas con montHEx entre S/500 y S/800"));
        jPanel1.add(txtNempSistemMontHEquiYoch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 70));

        txtProm$NetoMarketing.setBorder(javax.swing.BorderFactory.createTitledBorder("Promedio de Sueldos Netos en la Area de Marketing"));
        jPanel1.add(txtProm$NetoMarketing, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 310, 70));

        txtTotalApagarLaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de pago de la Empresa a los Emp."));
        jPanel1.add(txtTotalApagarLaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 240, 70));

        txtNumEmpMonSgMayorCien.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Emp. con Monto de Seguro Mayor a S/100"));
        jPanel1.add(txtNumEmpMonSgMayorCien, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 270, 70));

        txtEmpSNPmenorMontDsct.setBorder(javax.swing.BorderFactory.createTitledBorder("Emp. del SNP con menor mont de DSC"));
        jPanel1.add(txtEmpSNPmenorMontDsct, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 240, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 830, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        String cod = txtCod.getText();
        String nam = txtName.getText();
        String are = cbxArea.getSelectedItem().toString();
        String segur = cbxTipSeguro.getSelectedItem().toString();
        Double $bas = Double.parseDouble(txt$ueldoBase.getText());
        int hExtra = Integer.parseInt(txtHrsExtras.getText());

        emp = new empleado(cod, nam, are, segur, $bas, hExtra);

        arrayEmpl[contEmpl] = emp;
        printDatos(emp);

        contEmpl++;

        JOptionPane.showMessageDialog(null, "-------------------------------- EL PERSONAL ["
                + txtName.getText() + "] DEL AREA DE [" + cbxArea.getSelectedItem()
                + "] FUE REGISTRADO CON ÉXITO --------------------------------");

        cleanInput();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        cleanInput();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        String EmplMayor = "", EmpSNP = "";
        int NumEmpSeguro = 0, NempSistem = 0;
        double Prom$Neto = 0, ss = 0, cont = 0, TotalApagar = 0,
                mayor = -1, menor = 9999999;

        for (int i = 0; i < contEmpl; i++) {

            // Empleado con Mayor Sueldo Neto
            if (arrayEmpl[i].$base > mayor) {
                mayor = arrayEmpl[i].$base;
                EmplMayor = arrayEmpl[i].name;
            }

            // Promedio de Sueldos Netos en la Area de Marketing
            if (arrayEmpl[i].area.equals("Marketing")) {
                ss = ss + arrayEmpl[i].$base;
                cont++;
                Prom$Neto = ss / cont;
            }

            // N° Emp. con Monto de Seguro Mayor a S/100
            if (arrayEmpl[i].montSeguro() > 100) {
                NumEmpSeguro++;
            }

            // N° Emp. de Sistemas con montHEx entre S/500 y S/800
            if (arrayEmpl[i].area.equals("Sistemas")
                    && arrayEmpl[i].montHextra() >= 500
                    && arrayEmpl[i].montHextra() <= 800) {
                NempSistem++;
            }

            // Emp. del SNP con menor mont de DSC
            if (arrayEmpl[i].seguro.equals("SNP") && arrayEmpl[i].montDsct() < menor) {
                menor = arrayEmpl[i].montDsct();
                EmpSNP = arrayEmpl[i].name;
            }

            // Total de pago de la Empresa a los Emp.
            TotalApagar = TotalApagar + arrayEmpl[i].mont$Bruto();

            //SALIDA DE DATOS
            txtEmplMayorSueldoN.setText(EmplMayor);
            txtProm$NetoMarketing.setText(String.valueOf(Prom$Neto));
            txtNumEmpMonSgMayorCien.setText(String.valueOf(NumEmpSeguro));
            txtNempSistemMontHEquiYoch.setText(String.valueOf(NempSistem));
            txtEmpSNPmenorMontDsct.setText(EmpSNP);
            txtTotalApagarLaEmpresa.setText(String.valueOf(TotalApagar));

        }

    }//GEN-LAST:event_btnResumenActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnResumen;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxTipSeguro;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatosInsert;
    private javax.swing.JTextField txt$ueldoBase;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmpSNPmenorMontDsct;
    private javax.swing.JTextField txtEmplMayorSueldoN;
    private javax.swing.JTextField txtHrsExtras;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNempSistemMontHEquiYoch;
    private javax.swing.JTextField txtNumEmpMonSgMayorCien;
    private javax.swing.JTextField txtProm$NetoMarketing;
    private javax.swing.JTextField txtTotalApagarLaEmpresa;
    // End of variables declaration//GEN-END:variables
}
