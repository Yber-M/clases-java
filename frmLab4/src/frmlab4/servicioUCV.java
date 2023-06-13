package frmlab4;

/*MARLON YBER QUISPE OLANO
  {Yb.M};
*/
//librerias
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import rsscalelabel.RSScaleLabel;

public class servicioUCV extends javax.swing.JFrame {
    //clase
    estudiantes student;
    
    //Variables Lista
    DefaultListModel LNum, LNombre, LN1, LCredt1, LN2, LCredt2, LN3, LCredt3, LPrm_Sim, LPrm_Pndrd;
    
    //Declarando variable para DecimalFormat
    DecimalFormat df;
    
    public servicioUCV() {
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        initComponents();
        
        //creación del formato
        df = new DecimalFormat("##0.0");
        LoadModels();
        //Definiendo lugar del ejectuable
        this.setLocationRelativeTo(null);
        
        //LIBRERIA PARA AÑADIR IMÁGENES
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblClean, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\biggarbagebin_121980.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblExit, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\exit_icon-icons.com_70975.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblGrabarDatos, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\1904677-add-addition-calculate-charge-create-new-plus_122527.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblNuevoDato, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\user_add_21977.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblMejorEstudiante, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\iconfinder-515-best-grade-achieve-education-4212899_114954.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblID, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\ididentificationcardpersondrivinglicence_109731.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jlblMostrar, "F:\\2do Ciclo\\frmLab4\\src\\iconos\\write21_42525.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlsNumEstudiante = new javax.swing.JList<>();
        jlblExit = new javax.swing.JLabel();
        jlblMostrar = new javax.swing.JLabel();
        jbtnMostrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jlblClean = new javax.swing.JLabel();
        jbtnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtxtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtNota3 = new javax.swing.JTextField();
        jtxtCrdt1 = new javax.swing.JTextField();
        jtxtNota2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtNota1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtCrdt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtCrdt3 = new javax.swing.JTextField();
        jlblGrabarDatos = new javax.swing.JLabel();
        jlblNuevoDato = new javax.swing.JLabel();
        jbtnGrabarDatos = new javax.swing.JButton();
        jbtnNuevoDatos = new javax.swing.JButton();
        jlblID = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtxtNameMejorEstudiante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtMjrPromPndr = new javax.swing.JTextField();
        jlblMejorEstudiante = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlsNota1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jlsApellidoNombres = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jlsCrdt1 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jlsNota2 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jlsCrdt2 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jlstNota3 = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jlstCrdt3 = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        jlsPrmSim = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jlsPromPond = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlsNumEstudiante.setBackground(new java.awt.Color(255, 255, 102));
        jlsNumEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("N°"));
        jlsNumEstudiante.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(jlsNumEstudiante);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 52, 247));
        jPanel1.add(jlblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 20, 20));
        jPanel1.add(jlblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 20, 20));

        jbtnMostrar.setBackground(new java.awt.Color(0, 204, 0));
        jbtnMostrar.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jbtnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMostrar.setText("MOSTRAR");
        jbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 370, 40));

        jbtnSalir.setBackground(new java.awt.Color(255, 102, 0));
        jbtnSalir.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jbtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 180, 40));
        jPanel1.add(jlblClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 20, 20));

        jbtnLimpiar.setBackground(new java.awt.Color(255, 255, 0));
        jbtnLimpiar.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 180, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL ESTUDIANTE"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtName.setFont(new java.awt.Font("mononoki", 2, 14)); // NOI18N
        jtxtName.setForeground(new java.awt.Color(51, 51, 255));
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 36));

        jLabel1.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Apellidos y Nombres");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Nota 1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Nota 2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Nota 3");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jtxtNota3.setFont(new java.awt.Font("mononoki", 2, 14)); // NOI18N
        jtxtNota3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jtxtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 80, 36));

        jtxtCrdt1.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtCrdt1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jtxtCrdt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 36));

        jtxtNota2.setFont(new java.awt.Font("mononoki", 2, 14)); // NOI18N
        jtxtNota2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jtxtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, 36));

        jLabel5.setFont(new java.awt.Font("mononoki", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Creditos 1");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        jtxtNota1.setFont(new java.awt.Font("mononoki", 2, 14)); // NOI18N
        jtxtNota1.setForeground(new java.awt.Color(255, 0, 0));
        jtxtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNota1ActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 36));

        jLabel6.setFont(new java.awt.Font("mononoki", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Creditos 2");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));

        jtxtCrdt2.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtCrdt2.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jtxtCrdt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 80, 36));

        jLabel7.setFont(new java.awt.Font("mononoki", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Creditos 3");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 20));

        jtxtCrdt3.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtCrdt3.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jtxtCrdt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 80, 36));
        jPanel2.add(jlblGrabarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 30, 30));
        jPanel2.add(jlblNuevoDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 30, 30));

        jbtnGrabarDatos.setBackground(new java.awt.Color(0, 204, 0));
        jbtnGrabarDatos.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jbtnGrabarDatos.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGrabarDatos.setText("GRABAR DATOS");
        jbtnGrabarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarDatosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGrabarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 200, 49));

        jbtnNuevoDatos.setBackground(new java.awt.Color(51, 153, 255));
        jbtnNuevoDatos.setFont(new java.awt.Font("mononoki", 1, 15)); // NOI18N
        jbtnNuevoDatos.setForeground(new java.awt.Color(255, 255, 255));
        jbtnNuevoDatos.setText("NUEVO DATO");
        jbtnNuevoDatos.setRequestFocusEnabled(false);
        jbtnNuevoDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDatosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNuevoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 200, 49));
        jPanel2.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 310));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REPORTE DEL MEJOR ESTUDIANTE"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNameMejorEstudiante.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtNameMejorEstudiante.setForeground(new java.awt.Color(51, 51, 255));
        jPanel3.add(jtxtNameMejorEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 348, 40));

        jLabel9.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Mayor Promedio Ponderado");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jtxtMjrPromPndr.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jtxtMjrPromPndr.setForeground(new java.awt.Color(0, 204, 0));
        jtxtMjrPromPndr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMjrPromPndrActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtMjrPromPndr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 43));

        jlblMejorEstudiante.setText("jLabel10");
        jPanel3.add(jlblMejorEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 90, 80));

        jLabel10.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Apellidos y Nombres");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 370, 210));

        jlsNota1.setBackground(new java.awt.Color(255, 102, 102));
        jlsNota1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 1"));
        jlsNota1.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jScrollPane4.setViewportView(jlsNota1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 80, 247));

        jlsApellidoNombres.setBackground(new java.awt.Color(153, 153, 255));
        jlsApellidoNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos y Nombres"));
        jlsApellidoNombres.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jScrollPane5.setViewportView(jlsApellidoNombres);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 247));

        jlsCrdt1.setBackground(new java.awt.Color(153, 255, 255));
        jlsCrdt1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crdt. 1"));
        jlsCrdt1.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane6.setViewportView(jlsCrdt1);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, 247));

        jlsNota2.setBackground(new java.awt.Color(255, 102, 102));
        jlsNota2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 2"));
        jlsNota2.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jScrollPane7.setViewportView(jlsNota2);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 80, 247));

        jlsCrdt2.setBackground(new java.awt.Color(153, 255, 255));
        jlsCrdt2.setBorder(javax.swing.BorderFactory.createTitledBorder("Crdt. 2"));
        jlsCrdt2.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane8.setViewportView(jlsCrdt2);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 247));

        jlstNota3.setBackground(new java.awt.Color(255, 102, 102));
        jlstNota3.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 3"));
        jlstNota3.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        jScrollPane9.setViewportView(jlstNota3);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 80, 247));

        jlstCrdt3.setBackground(new java.awt.Color(153, 255, 255));
        jlstCrdt3.setBorder(javax.swing.BorderFactory.createTitledBorder("Crdt. 3"));
        jlstCrdt3.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane10.setViewportView(jlstCrdt3);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 80, 247));

        jlsPrmSim.setBackground(new java.awt.Color(255, 102, 255));
        jlsPrmSim.setBorder(javax.swing.BorderFactory.createTitledBorder("Prm. Sim"));
        jlsPrmSim.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane11.setViewportView(jlsPrmSim);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 81, 247));

        jlsPromPond.setBackground(new java.awt.Color(0, 204, 51));
        jlsPromPond.setBorder(javax.swing.BorderFactory.createTitledBorder("Prm. Pond"));
        jlsPromPond.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        jScrollPane12.setViewportView(jlsPromPond);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 90, 247));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtMjrPromPndrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMjrPromPndrActionPerformed

    }//GEN-LAST:event_jtxtMjrPromPndrActionPerformed

    private void jbtnNuevoDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDatosActionPerformed
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        CleanEntradas();
    }//GEN-LAST:event_jbtnNuevoDatosActionPerformed

    private void jbtnGrabarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarDatosActionPerformed
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        String nom, campo;

        nom = jtxtName.getText();

        //LLAMADA DE LA FUNCIÓN PARA VERIFICAR CAMPOS
        campo = verificaciónCampos();
        if(campo.equals("")) {

            double n1 = Double.parseDouble(jtxtNota1.getText());
            double crdt1 = Double.parseDouble(jtxtCrdt1.getText());
            double n2 = Double.parseDouble(jtxtNota2.getText());
            double crdt2 = Double.parseDouble(jtxtCrdt2.getText());
            double n3 = Double.parseDouble(jtxtNota3.getText());
            double crdt3 = Double.parseDouble(jtxtCrdt3.getText());

            student = new estudiantes(nom, n1, crdt1, n2,  crdt2, n3, crdt3);
            LNombre.addElement(nom);
            LN1.addElement(n1);
            LCredt1.addElement(crdt1);
            LN2.addElement(n2);
            LCredt2.addElement(crdt2);
            LN3.addElement(n3);
            LCredt3.addElement(crdt3);

            //FORMATEANDO LOS PROMEDIOS
            LPrm_Pndrd.addElement(df.format(student.poderado()));
            LPrm_Sim.addElement(df.format(student.promedio()));

            //OBTENIENDO LA CANTIDAD DE ELEMENTOS DEL JLIST
            int num = LNombre.size();
            LNum.addElement(num);

            //METODO QUE LIMPIA LAS ENTRADAS
            CleanEntradas();

            //Colocar el cursos en el boton nuevo
            jbtnNuevoDatos.requestFocus();
        }
        else JOptionPane.showMessageDialog(null, "**ERROR**" + "\nLos datos son "
            + "erroneos o están incompletos en el campo\n" + campo);
    }//GEN-LAST:event_jbtnGrabarDatosActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed

    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        //LIMPÍAR TODOS LOS VALORES GRABADOS EN LISTA
        LNum.removeAllElements();
        LNombre.removeAllElements();
        LN1.removeAllElements();
        LN2.removeAllElements();
        LN3.removeAllElements();
        LCredt1.removeAllElements();
        LCredt2.removeAllElements();
        LCredt3.removeAllElements();
        LPrm_Sim.removeAllElements();
        LPrm_Pndrd.removeAllElements();

        //METODO LIMPIAR ENTRADA
        CleanEntradas();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        // Variables
        int numeroList, i;
        String name, dat = "";
        double pndrd, mayor = -999;

        //IDENTIFICAR LA CANTIDAD DE ITEMS EN EL JLIST
        numeroList = LNombre.size();

        //RECORRER POR LOS JLIST
        for (i=0; i < numeroList; i++) {

            //EXTRAR DATOS DEL JLIST
            name = LNombre.getElementAt(i).toString();
            pndrd = Double.parseDouble(LPrm_Pndrd.getElementAt(i).toString());

            //IDENTIFICAR AL MEJOR ALUMNO
            if (pndrd > mayor) {
                mayor = pndrd;
                dat = name;
            }
            jtxtNameMejorEstudiante.setText(dat);                                //SET = COLOCAR - GET = CONSEGUIR
            jtxtMjrPromPndr.setText(df.format(mayor));

        }
    }//GEN-LAST:event_jbtnMostrarActionPerformed

    private void jtxtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNota1ActionPerformed
    
    void LoadModels() {
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */
        //Creando Modelo De Lista
        LNum = new DefaultListModel();
        LNombre = new DefaultListModel();
        LN1 = new DefaultListModel();
        LCredt1 = new DefaultListModel();
        LN2 = new DefaultListModel();
        LCredt2 = new DefaultListModel();
        LN3 = new DefaultListModel();
        LCredt3 = new DefaultListModel();
        LPrm_Pndrd = new DefaultListModel();
        LPrm_Sim = new DefaultListModel();
        
        //Incorporando Los Modelos en los jls
        jlsNumEstudiante.setModel(LNum);
        jlsApellidoNombres.setModel(LNombre);
        jlsNota1.setModel(LN1);
        jlsCrdt1.setModel(LCredt1);
        jlsNota2.setModel(LN2);
        jlsCrdt2.setModel(LCredt2);
        jlstNota3.setModel(LN3);
        jlstCrdt3.setModel(LCredt3);
        jlsPrmSim.setModel(LPrm_Sim);
        jlsPromPond.setModel(LPrm_Pndrd);
        
    }
    String verificaciónCampos() {
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */        
        /*CÓDIGO QUE EVITA QUE EL PROGRAMA TERMINE SI NO HAY DATOS INGRESADOS O
        SI SE INGRESA UN CÓDIGO INVALIDO*/
        if (jtxtName.getText().equals(""))
            return "Apellidos y Nombres";
        if (jtxtNota1.getText().equals("") || Double.parseDouble(jtxtNota1.getText()) < 0
                || Double.parseDouble(jtxtNota1.getText()) > 20)
            return "Nota 1";
        if (jtxtCrdt1.getText().equals("")) {
            return "Credito 1";
        }
        if (jtxtNota2.getText().equals("") || Double.parseDouble(jtxtNota2.getText()) < 0
                || Double.parseDouble(jtxtNota2.getText()) > 20)
            return "Nota 2";
        if (jtxtCrdt2.getText().equals("")) {
            return "Credito 2";
        }
        if (jtxtNota3.getText().equals("") || Double.parseDouble(jtxtNota3.getText()) < 0
                || Double.parseDouble(jtxtNota3.getText()) > 20)
            return "Nota 3";
        if (jtxtCrdt3.getText().equals("")) {
            return "Credito 3";
        }
        
        // SI TODO ESTÁ VACIO SE RETORNA EN UN TEXTO VACIO
        return "";
        
    }
    void CleanEntradas () {
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */        
        jtxtName.setText("");
        jtxtNota1.setText("");
        jtxtNota2.setText("");
        jtxtNota3.setText("");
        jtxtCrdt1.setText("");
        jtxtCrdt2.setText("");
        jtxtCrdt3.setText("");
        jtxtName.requestFocus();
        
    }    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(servicioUCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servicioUCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servicioUCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servicioUCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new servicioUCV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jbtnGrabarDatos;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JButton jbtnNuevoDatos;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblClean;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblGrabarDatos;
    private javax.swing.JLabel jlblID;
    private javax.swing.JLabel jlblMejorEstudiante;
    private javax.swing.JLabel jlblMostrar;
    private javax.swing.JLabel jlblNuevoDato;
    private javax.swing.JList<String> jlsApellidoNombres;
    private javax.swing.JList<String> jlsCrdt1;
    private javax.swing.JList<String> jlsCrdt2;
    private javax.swing.JList<String> jlsNota1;
    private javax.swing.JList<String> jlsNota2;
    private javax.swing.JList<String> jlsNumEstudiante;
    private javax.swing.JList<String> jlsPrmSim;
    private javax.swing.JList<String> jlsPromPond;
    private javax.swing.JList<String> jlstCrdt3;
    private javax.swing.JList<String> jlstNota3;
    private javax.swing.JTextField jtxtCrdt1;
    private javax.swing.JTextField jtxtCrdt2;
    private javax.swing.JTextField jtxtCrdt3;
    private javax.swing.JTextField jtxtMjrPromPndr;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtNameMejorEstudiante;
    private javax.swing.JTextField jtxtNota1;
    private javax.swing.JTextField jtxtNota2;
    private javax.swing.JTextField jtxtNota3;
    // End of variables declaration//GEN-END:variables
}
