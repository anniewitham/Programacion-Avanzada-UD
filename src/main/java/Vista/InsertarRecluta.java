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
public class InsertarRecluta extends javax.swing.JFrame {

    /**
     * Creates new form InsertarRecluta
     */
    public InsertarRecluta(ControlPrincipal aThis) {
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
        NombreRecluta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CodigoReclutamienttoRecluta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CedulaRecluta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ApellidoRecluta = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonInsertarRecluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(382, 382));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Insertar Recluta");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 240, 40);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel1.add(botonSalir);
        botonSalir.setBounds(298, 6, 78, 34);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 100, 120, 15);

        NombreRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        NombreRecluta.setForeground(new java.awt.Color(102, 102, 102));
        NombreRecluta.setBorder(null);
        NombreRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreReclutaActionPerformed(evt);
            }
        });
        jPanel1.add(NombreRecluta);
        NombreRecluta.setBounds(60, 120, 250, 20);

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Apellido:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 150, 110, 15);

        CodigoReclutamienttoRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CodigoReclutamienttoRecluta.setForeground(new java.awt.Color(102, 102, 102));
        CodigoReclutamienttoRecluta.setBorder(null);
        CodigoReclutamienttoRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoReclutamienttoReclutaActionPerformed(evt);
            }
        });
        jPanel1.add(CodigoReclutamienttoRecluta);
        CodigoReclutamienttoRecluta.setBounds(60, 270, 250, 20);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Cedula:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 200, 120, 15);

        CedulaRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CedulaRecluta.setForeground(new java.awt.Color(102, 102, 102));
        CedulaRecluta.setBorder(null);
        CedulaRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaReclutaActionPerformed(evt);
            }
        });
        jPanel1.add(CedulaRecluta);
        CedulaRecluta.setBounds(60, 220, 250, 20);

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Codigo de reclutamiento");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 250, 190, 15);

        ApellidoRecluta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ApellidoRecluta.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoRecluta.setBorder(null);
        ApellidoRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoReclutaActionPerformed(evt);
            }
        });
        jPanel1.add(ApellidoRecluta);
        ApellidoRecluta.setBounds(60, 170, 250, 20);

        botonVolver.setText("Volver Menu");
        botonVolver.setBorder(null);
        jPanel1.add(botonVolver);
        botonVolver.setBounds(28, 336, 130, 25);

        botonInsertarRecluta.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonInsertarRecluta.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarRecluta.setText("Insertar Recluta");
        botonInsertarRecluta.setBorder(null);
        botonInsertarRecluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarReclutaActionPerformed(evt);
            }
        });
        jPanel1.add(botonInsertarRecluta);
        botonInsertarRecluta.setBounds(210, 320, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 382, 394);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoReclutamienttoReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoReclutamienttoReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoReclutamienttoReclutaActionPerformed

    private void NombreReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreReclutaActionPerformed

    private void ApellidoReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoReclutaActionPerformed

    private void botonInsertarReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReclutaActionPerformed

    private void CedulaReclutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaReclutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaReclutaActionPerformed
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
        return NombreRecluta;
    }

    public JTextField cargarApellidoRecluta() {
        return ApellidoRecluta;
    }

    public JTextField cargarCedulaRecluta() {
        return CedulaRecluta;
    }

    public JTextField cargarCodigoReclutamiento() {
        return CodigoReclutamienttoRecluta;
    }

//--------------RSETEAR CAMPOS-----------
    public void resetearCamposBus() {
        NombreRecluta.setText("");
        ApellidoRecluta.setText("");
        CedulaRecluta.setText("");
        CodigoReclutamienttoRecluta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoRecluta;
    private javax.swing.JTextField CedulaRecluta;
    private javax.swing.JTextField CodigoReclutamienttoRecluta;
    private javax.swing.JTextField NombreRecluta;
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
