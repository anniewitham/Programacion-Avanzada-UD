/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlInsertarPersona;

/**
 *
 * @author Personal
 */
public class VistaMenuInsertarPersona extends javax.swing.JFrame {

    private ControlInsertarPersona control;

    /**
     * Creates new form InsertarPersona
     */
    public VistaMenuInsertarPersona(ControlInsertarPersona aThis) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = aThis;
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonInsertarRemiso = new javax.swing.JButton();
        botonInsertarAplazado = new javax.swing.JButton();
        botonInsertarReservista = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonInsertarReclutado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        botonInsertarRemiso.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonInsertarRemiso.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarRemiso.setText("Remiso");
        botonInsertarRemiso.setBorder(null);

        botonInsertarAplazado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonInsertarAplazado.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarAplazado.setText("Aplazado");
        botonInsertarAplazado.setBorder(null);
        botonInsertarAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarAplazadoActionPerformed(evt);
            }
        });

        botonInsertarReservista.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonInsertarReservista.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarReservista.setText("Reservista");
        botonInsertarReservista.setBorder(null);
        botonInsertarReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarReservistaActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Eliga el tipo ");

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonInsertarReclutado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonInsertarReclutado.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarReclutado.setText("Reclutado");
        botonInsertarReclutado.setBorder(null);
        botonInsertarReclutado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarReclutadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonInsertarReservista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonInsertarAplazado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonInsertarRemiso, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(botonInsertarReclutado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonInsertarReclutado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(botonInsertarReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInsertarRemiso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInsertarAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarAplazadoActionPerformed

    private void botonInsertarReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReservistaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonInsertarReclutadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReclutadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReclutadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonInsertarAplazado;
    public javax.swing.JButton botonInsertarReclutado;
    public javax.swing.JButton botonInsertarRemiso;
    public javax.swing.JButton botonInsertarReservista;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
