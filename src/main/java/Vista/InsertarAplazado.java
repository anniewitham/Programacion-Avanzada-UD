/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.ControlPrincipal;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class InsertarAplazado extends javax.swing.JFrame {

    private ControlPrincipal control;

    /**
     * Creates new form InsertarRecluta
     */
    public InsertarAplazado(ControlPrincipal aThis) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NombreAplazado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FechaAplazado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CedulaAplazado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ApellidoAplazado = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonInsertarRecluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Insertar Aplazado");

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre:");

        NombreAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        NombreAplazado.setForeground(new java.awt.Color(102, 102, 102));
        NombreAplazado.setBorder(null);
        NombreAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAplazadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Apellido:");

        FechaAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        FechaAplazado.setForeground(new java.awt.Color(102, 102, 102));
        FechaAplazado.setBorder(null);
        FechaAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaAplazadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Cedula:");

        CedulaAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CedulaAplazado.setForeground(new java.awt.Color(102, 102, 102));
        CedulaAplazado.setBorder(null);
        CedulaAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaAplazadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Fecha aplazamiento:");

        ApellidoAplazado.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ApellidoAplazado.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoAplazado.setBorder(null);
        ApellidoAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoAplazadoActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver Menu");
        botonVolver.setBorder(null);

        botonInsertarRecluta.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonInsertarRecluta.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarRecluta.setText("Insertar Aplazado");
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
                        .addGap(60, 60, 60)
                        .addComponent(NombreAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ApellidoAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CedulaAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(FechaAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(botonInsertarRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(NombreAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(ApellidoAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(CedulaAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(FechaAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonInsertarRecluta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 382, 382);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaAplazadoActionPerformed

    private void NombreAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAplazadoActionPerformed

    private void ApellidoAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoAplazadoActionPerformed

    private void botonInsertarReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReclutaActionPerformed

    private void CedulaAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaAplazadoActionPerformed
//------------LISTENER-------------

    /**
     * addSalirListener. Agrega un listener al boton de salir.
     */
    public void addSalirListener(ActionListener listener) {
        botonSalir.addActionListener(listener);
    }

    public void addVolverMenuListener(ActionListener listener) {
        botonVolver.addActionListener(listener);
    }

    public void addInsertarReclutaListener(ActionListener listener) {
        botonInsertarRecluta.addActionListener(listener);
    }

//-------------CARGAR----------------
    public JTextField cargarNombreRecluta() {
        return NombreAplazado;
    }

    public JTextField cargarApellidoRecluta() {
        return ApellidoAplazado;
    }

    public JTextField cargarCedulaRecluta() {
        return CedulaAplazado;
    }

    public JTextField cargarCodigoReclutamiento() {
        return FechaAplazado;
    }

//--------------RSETEAR CAMPOS-----------
    public void resetearCamposAplazado() {
        NombreAplazado.setText("");
        ApellidoAplazado.setText("");
        CedulaAplazado.setText("");
        FechaAplazado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoAplazado;
    private javax.swing.JTextField CedulaAplazado;
    private javax.swing.JTextField FechaAplazado;
    private javax.swing.JTextField NombreAplazado;
    private javax.swing.JButton botonInsertarRecluta;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
