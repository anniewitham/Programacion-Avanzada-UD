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
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NombreRecluta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SituacionPersona = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonCambiarSituacion = new javax.swing.JButton();
        casillaReservista = new javax.swing.JRadioButton();
        casillasReclutado = new javax.swing.JRadioButton();
        casillaAplazado = new javax.swing.JRadioButton();
        casillaRemiso = new javax.swing.JRadioButton();

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

        NombreRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        NombreRecluta.setForeground(new java.awt.Color(102, 102, 102));
        NombreRecluta.setBorder(null);
        NombreRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreReclutaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Situacion militar Actual:");

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Situacion militar a Cambiar:");

        SituacionPersona.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        SituacionPersona.setForeground(new java.awt.Color(102, 102, 102));
        SituacionPersona.setBorder(null);
        SituacionPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SituacionPersonaActionPerformed(evt);
            }
        });

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

        casillaReservista.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaReservista.setForeground(new java.awt.Color(102, 102, 102));
        casillaReservista.setText("Reservista");
        casillaReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaReservistaActionPerformed(evt);
            }
        });

        casillasReclutado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillasReclutado.setForeground(new java.awt.Color(102, 102, 102));
        casillasReclutado.setText("Reclutado");
        casillasReclutado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillasReclutadoActionPerformed(evt);
            }
        });

        casillaAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaAplazado.setForeground(new java.awt.Color(102, 102, 102));
        casillaAplazado.setText("Aplazado");

        casillaRemiso.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        casillaRemiso.setForeground(new java.awt.Color(102, 102, 102));
        casillaRemiso.setText("Remiso");

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
                            .addComponent(NombreRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SituacionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
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
                            .addComponent(casillasReclutado)
                            .addComponent(casillaRemiso)
                            .addComponent(botonCambiarSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(NombreRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(SituacionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casillaReservista)
                            .addComponent(casillasReclutado))
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

    private void NombreReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreReclutaActionPerformed

    private void SituacionPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SituacionPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SituacionPersonaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonCambiarSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarSituacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCambiarSituacionActionPerformed

    private void casillaReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaReservistaActionPerformed

    private void casillasReclutadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillasReclutadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillasReclutadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField NombreRecluta;
    public javax.swing.JTextField SituacionPersona;
    public javax.swing.JButton botonCambiarSituacion;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    public javax.swing.JRadioButton casillaAplazado;
    public javax.swing.JRadioButton casillaRemiso;
    public javax.swing.JRadioButton casillaReservista;
    public javax.swing.JRadioButton casillasReclutado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
