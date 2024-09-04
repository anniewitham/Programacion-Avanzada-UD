
package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlPrincipal;


public class Menu extends javax.swing.JFrame {
    
    private ControlPrincipal control;
    

    /**
     * Creates new form Menu
     * @param aThis
     */
    public Menu(ControlPrincipal aThis) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = aThis;
        setVisible(true);
        setResizable(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonInsertarPersona = new javax.swing.JButton();
        botonConsultarPersona = new javax.swing.JButton();
        botonSituacionMilitar = new javax.swing.JButton();
        botonReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        botonInsertarPersona.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonInsertarPersona.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarPersona.setText("Insertar Persona");
        botonInsertarPersona.setBorder(null);
        botonInsertarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarPersonaActionPerformed(evt);
            }
        });

        botonConsultarPersona.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonConsultarPersona.setForeground(new java.awt.Color(102, 102, 102));
        botonConsultarPersona.setText("Consultar Persona");
        botonConsultarPersona.setBorder(null);

        botonSituacionMilitar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSituacionMilitar.setForeground(new java.awt.Color(102, 102, 102));
        botonSituacionMilitar.setText("Cambiar situacion militar");
        botonSituacionMilitar.setBorder(null);

        botonReporte.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonReporte.setForeground(new java.awt.Color(102, 102, 102));
        botonReporte.setText("Generar reporte de estado");
        botonReporte.setToolTipText("");
        botonReporte.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Menú");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSituacionMilitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConsultarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonInsertarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(botonInsertarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConsultarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSituacionMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
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

    private void botonInsertarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarPersonaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonConsultarPersona;
    public javax.swing.JButton botonInsertarPersona;
    public javax.swing.JButton botonReporte;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonSituacionMilitar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
