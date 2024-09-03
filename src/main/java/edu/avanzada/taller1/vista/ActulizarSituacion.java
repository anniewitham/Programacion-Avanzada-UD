package edu.avanzada.taller1.vista;


import edu.avanzada.taller1.control.ControlPrincipal;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


public class ActulizarSituacion extends javax.swing.JFrame {

    private ControlPrincipal control;
 

    
    public ActulizarSituacion(ControlPrincipal aThis) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.control = control;
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonActualizarSituacion = new javax.swing.JButton();
        BotonVolverMenu = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jTextFieldCedulaActualizarSituacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        BotonVolverMenu.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        BotonVolverMenu.setForeground(new java.awt.Color(102, 102, 102));
        BotonVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller1/vista/volver.png"))); // NOI18N
        BotonVolverMenu.setText("Volver Menu");
        BotonVolverMenu.setBorder(null);
        BotonVolverMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller1/vista/volver 32.png"))); // NOI18N
        BotonVolverMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller1/vista/volver 32.png"))); // NOI18N
        BotonVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverMenuActionPerformed(evt);
            }
        });
        jPanel3.add(BotonVolverMenu);
        BotonVolverMenu.setBounds(40, 150, 130, 30);

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);
        jPanel3.add(botonSalir);
        botonSalir.setBounds(331, 10, 80, 30);
        jPanel3.add(jTextFieldCedulaActualizarSituacion);
        jTextFieldCedulaActualizarSituacion.setBounds(70, 80, 280, 50);

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

    private void BotonVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverMenuActionPerformed
//------------- LISTENER----------

    /**
     * Agrega un listener al boton de salir.
     *
     * @param listener
     */
    public void addSalirListener(ActionListener listener) {
        botonSalir.addActionListener(listener);
    }

    /**
     * addConsultarPersonaListener. Agrega un listener al boton de consultar
     * citas.
     */
    public void addConsultarPersonaListener(ActionListener listener) {
        botonActualizarSituacion.addActionListener(listener);
    }

    /**
     * addvolverMenuListener. Agrega un listener al boton de volver menu.
     */
    public void addvolverMenuListener(ActionListener listener) {
        BotonVolverMenu.addActionListener(listener);
    }

    //--------
    /**
     * cargarConsultaCedula. Retorna el campo de texto de la cedula.
     */
    public JTextField cargarCedulaActualizar() {
        return jTextFieldCedulaActualizarSituacion;
    }

    /**
     * resetearCampos. Resetea los campos de texto.
     */
    public void resetearCampos() {
        jTextFieldCedulaActualizarSituacion.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolverMenu;
    private javax.swing.JButton botonActualizarSituacion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCedulaActualizarSituacion;
    // End of variables declaration//GEN-END:variables
}
