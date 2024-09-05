package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlCambiarSituacion;
import edu.avanzada.taller1.control.ControlInsertarPersona;

public class VistaInsertarRecluta extends javax.swing.JFrame {

    private ControlInsertarPersona controlInsertar;
    private ControlCambiarSituacion controlCambiar;
    
    public VistaInsertarRecluta(ControlInsertarPersona aThis) {
        initComponents();
        controlInsertar = aThis;
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Insertar un Reclutado");
    }
    
    public VistaInsertarRecluta(ControlCambiarSituacion aThis) {
        initComponents();
        controlCambiar = aThis;
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Insertar un Reclutado");
        NombreRecluta.setEditable(false);
        ApellidoRecluta.setEditable(false);
        CedulaRecluta.setEditable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NombreRecluta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CodigoReclutamientoRecluta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CedulaRecluta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ApellidoRecluta = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonInsertarRecluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Insertar Recluta");

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
        jLabel9.setText("Apellido:");

        CodigoReclutamientoRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CodigoReclutamientoRecluta.setForeground(new java.awt.Color(102, 102, 102));
        CodigoReclutamientoRecluta.setBorder(null);
        CodigoReclutamientoRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoReclutamientoReclutaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Cedula:");

        CedulaRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CedulaRecluta.setForeground(new java.awt.Color(102, 102, 102));
        CedulaRecluta.setBorder(null);
        CedulaRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaReclutaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Codigo de reclutamiento");

        ApellidoRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ApellidoRecluta.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoRecluta.setBorder(null);
        ApellidoRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoReclutaActionPerformed(evt);
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

        botonInsertarRecluta.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonInsertarRecluta.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarRecluta.setText("Insertar Recluta");
        botonInsertarRecluta.setBorder(null);
        botonInsertarRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarReclutaActionPerformed(evt);
            }
        });

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
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(NombreRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ApellidoRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CedulaRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CodigoReclutamientoRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(botonInsertarRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(NombreRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(ApellidoRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(CedulaRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(CodigoReclutamientoRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonInsertarRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreReclutaActionPerformed

    private void CodigoReclutamientoReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoReclutamientoReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoReclutamientoReclutaActionPerformed

    private void CedulaReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaReclutaActionPerformed

    private void ApellidoReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoReclutaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonInsertarReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReclutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ApellidoRecluta;
    public javax.swing.JTextField CedulaRecluta;
    public javax.swing.JTextField CodigoReclutamientoRecluta;
    public javax.swing.JTextField NombreRecluta;
    public javax.swing.JButton botonInsertarRecluta;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
