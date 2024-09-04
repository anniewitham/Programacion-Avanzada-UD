package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlConsultarPersona;


public class ConsultarPersona extends javax.swing.JFrame {

    private ControlConsultarPersona control;
 

    
    public ConsultarPersona(ControlConsultarPersona aThis) {
        initComponents();
        control = aThis;
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonConsultarCedula = new javax.swing.JButton();
        botonVolverMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jTextFieldConsultarCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 245, 183));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Elija la cedula que consultara");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(70, 40, 280, 40);

        botonConsultarCedula.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonConsultarCedula.setForeground(new java.awt.Color(102, 102, 102));
        botonConsultarCedula.setText("Consultar Cedula");
        botonConsultarCedula.setBorderPainted(false);
        botonConsultarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarCedulaActionPerformed(evt);
            }
        });
        jPanel3.add(botonConsultarCedula);
        botonConsultarCedula.setBounds(220, 150, 170, 30);

        botonVolverMenu.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonVolverMenu.setForeground(new java.awt.Color(102, 102, 102));
        botonVolverMenu.setText("Volver");
        botonVolverMenu.setBorder(null);
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });
        jPanel3.add(botonVolverMenu);
        botonVolverMenu.setBounds(40, 150, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel3.add(botonSalir);
        botonSalir.setBounds(331, 10, 80, 30);
        jPanel3.add(jTextFieldConsultarCedula);
        jTextFieldConsultarCedula.setBounds(70, 80, 280, 50);

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

    private void botonConsultarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConsultarCedulaActionPerformed

    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonConsultarCedula;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolverMenu;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jTextFieldConsultarCedula;
    // End of variables declaration//GEN-END:variables
}
