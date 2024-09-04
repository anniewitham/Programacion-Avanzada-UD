package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlCambiarSituacion;

public class VistaCambiarSituacion extends javax.swing.JFrame {

    private ControlCambiarSituacion control;
    
    public VistaCambiarSituacion(ControlCambiarSituacion aThis) {
        initComponents();
        control = aThis;
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setTitle("Cambiar Situación Militar");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonActualizarSituacion = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        campoCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 245, 183));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Dijite la cedula de la persona");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(70, 40, 280, 40);

        botonActualizarSituacion.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonActualizarSituacion.setForeground(new java.awt.Color(102, 102, 102));
        botonActualizarSituacion.setText("Consultar Cedula");
        botonActualizarSituacion.setBorderPainted(false);
        botonActualizarSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarSituacionActionPerformed(evt);
            }
        });
        jPanel3.add(botonActualizarSituacion);
        botonActualizarSituacion.setBounds(220, 150, 170, 30);

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel3.add(botonVolver);
        botonVolver.setBounds(40, 150, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel3.add(botonSalir);
        botonSalir.setBounds(331, 10, 80, 30);
        jPanel3.add(campoCedula);
        campoCedula.setBounds(70, 80, 280, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarSituacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarSituacionActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarSituacion;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    public javax.swing.JTextField campoCedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
