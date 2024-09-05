package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlCambiarSituacion;

public class VistaMenuCambiarSituacion extends javax.swing.JFrame {

    private ControlCambiarSituacion control;

    public VistaMenuCambiarSituacion(ControlCambiarSituacion aThis) {
        initComponents();
        control = aThis;
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setTitle("Cambiar Situación Militar");
        casillaAplazado.setEnabled(false);
        casillaRemiso.setEnabled(false);
        casillaReclutado.setEnabled(false);
        casillaReservista.setEnabled(false);
    }
    
    public void validarOpciones(){
        if("Aplazado".equals(situacion.getText())){
            casillaRemiso.setEnabled(true);
            casillaReclutado.setEnabled(true);
        } else if("Reclutado".equals(situacion.getText())){
            casillaReservista.setEnabled(true);
            casillaRemiso.setEnabled(true);
        } else if("Remiso".equals(situacion.getText())){
            casillaReclutado.setEnabled(true);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonCambiarSituacion = new javax.swing.JButton();
        casillaReservista = new javax.swing.JRadioButton();
        casillaReclutado = new javax.swing.JRadioButton();
        casillaAplazado = new javax.swing.JRadioButton();
        casillaRemiso = new javax.swing.JRadioButton();
        nombre = new javax.swing.JTextField();
        situacion = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Cambio Situación");

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Situacion militar Actual:");

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Situacion militar a Cambiar:");

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonCambiarSituacion.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonCambiarSituacion.setForeground(new java.awt.Color(102, 102, 102));
        botonCambiarSituacion.setText("Cambiar");
        botonCambiarSituacion.setBorder(null);
        botonCambiarSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarSituacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(casillaReservista);
        casillaReservista.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaReservista.setForeground(new java.awt.Color(102, 102, 102));
        casillaReservista.setText("Reservista");
        casillaReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaReservistaActionPerformed(evt);
            }
        });

        buttonGroup1.add(casillaReclutado);
        casillaReclutado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaReclutado.setForeground(new java.awt.Color(102, 102, 102));
        casillaReclutado.setText("Reclutado");
        casillaReclutado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaReclutadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(casillaAplazado);
        casillaAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaAplazado.setForeground(new java.awt.Color(102, 102, 102));
        casillaAplazado.setText("Aplazado");

        buttonGroup1.add(casillaRemiso);
        casillaRemiso.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaRemiso.setForeground(new java.awt.Color(102, 102, 102));
        casillaRemiso.setText("Remiso");

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(255, 255, 255));

        situacion.setEditable(false);
        situacion.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casillaReservista)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casillaAplazado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casillaReclutado)
                            .addComponent(casillaRemiso)
                            .addComponent(botonCambiarSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(situacion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(situacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casillaReservista)
                            .addComponent(casillaReclutado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casillaAplazado)
                            .addComponent(casillaRemiso))
                        .addGap(18, 18, 18)
                        .addComponent(botonCambiarSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCambiarSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarSituacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCambiarSituacionActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void casillaReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaReservistaActionPerformed

    private void casillaReclutadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaReclutadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaReclutadoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCambiarSituacion;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JRadioButton casillaAplazado;
    public javax.swing.JRadioButton casillaReclutado;
    public javax.swing.JRadioButton casillaRemiso;
    public javax.swing.JRadioButton casillaReservista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField situacion;
    // End of variables declaration//GEN-END:variables
}
