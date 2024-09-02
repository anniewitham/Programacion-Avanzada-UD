
package Vista;

import Control.ControlPrincipal;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class InsertarReservista extends javax.swing.JFrame {
 private ControlPrincipal control;
    /**
     * Creates new form InsertarRecluta
     */
    public InsertarReservista(ControlPrincipal aThis) {
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
        NombreReservista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LibretaMilitar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CedulaReservista = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ApellidoReservista = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonInsertarReservista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Insertar Reservista");

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre:");

        NombreReservista.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        NombreReservista.setForeground(new java.awt.Color(102, 102, 102));
        NombreReservista.setBorder(null);
        NombreReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreReservistaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Apellido:");

        LibretaMilitar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        LibretaMilitar.setForeground(new java.awt.Color(102, 102, 102));
        LibretaMilitar.setBorder(null);
        LibretaMilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibretaMilitarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Cedula:");

        CedulaReservista.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        CedulaReservista.setForeground(new java.awt.Color(102, 102, 102));
        CedulaReservista.setBorder(null);
        CedulaReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaReservistaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Libreta Militar");

        ApellidoReservista.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ApellidoReservista.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoReservista.setBorder(null);
        ApellidoReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoReservistaActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver Menu");
        botonVolver.setBorder(null);

        botonInsertarReservista.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonInsertarReservista.setForeground(new java.awt.Color(102, 102, 102));
        botonInsertarReservista.setText("Insertar Reservista");
        botonInsertarReservista.setBorder(null);
        botonInsertarReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarReservistaActionPerformed(evt);
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
                        .addComponent(NombreReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ApellidoReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CedulaReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LibretaMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(botonInsertarReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(NombreReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(ApellidoReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(CedulaReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(LibretaMilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonInsertarReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 382, 382);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibretaMilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibretaMilitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibretaMilitarActionPerformed

    private void NombreReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreReservistaActionPerformed

    private void ApellidoReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoReservistaActionPerformed

    private void botonInsertarReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarReservistaActionPerformed

    private void CedulaReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaReservistaActionPerformed
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
        botonInsertarReservista.addActionListener(listener);
    }

//-------------CARGAR----------------
    public JTextField cargarNombreReservista() {
        return NombreReservista;
    }

    public JTextField cargarApellidoReservista() {
        return ApellidoReservista;
    }

    public JTextField cargarCedulaReservista() {
        return CedulaReservista;
    }

    public JTextField cargarLibretaMilitar() {
        return LibretaMilitar;
    }

//--------------RSETEAR CAMPOS-----------
    public void resetearCamposReservista() {
        NombreReservista.setText("");
        ApellidoReservista.setText("");
        CedulaReservista.setText("");
        LibretaMilitar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoReservista;
    private javax.swing.JTextField CedulaReservista;
    private javax.swing.JTextField LibretaMilitar;
    private javax.swing.JTextField NombreReservista;
    private javax.swing.JButton botonInsertarReservista;
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
