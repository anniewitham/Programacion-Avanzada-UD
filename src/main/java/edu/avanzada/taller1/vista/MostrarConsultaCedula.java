package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlConsultarPersona;

/**
 * MostrarConsultaCedula. Ventana que permite mostrar los datos de una persona
 * buscado por cedula.
 */
public class MostrarConsultaCedula extends javax.swing.JFrame {

    private ControlConsultarPersona control;

    /**
     * MostrarConsultaCedula. Ventana que permite mostrar los datos de un
     */
    public MostrarConsultaCedula(ControlConsultarPersona aThis) {
        initComponents();
        this.control = aThis;
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonVolverMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        datosConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Datos ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 130, 40);

        botonVolverMenu.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonVolverMenu.setForeground(new java.awt.Color(102, 102, 102));
        botonVolverMenu.setText("Volver");
        botonVolverMenu.setBorder(null);
        botonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolverMenu);
        botonVolverMenu.setBounds(10, 340, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel1.add(botonSalir);
        botonSalir.setBounds(290, 10, 80, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 60, 310, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolverMenu;
    public javax.swing.JLabel datosConsulta;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
