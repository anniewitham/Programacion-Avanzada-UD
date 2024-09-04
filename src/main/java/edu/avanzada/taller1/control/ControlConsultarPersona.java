package edu.avanzada.taller1.control;
import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaConsultarPersona;
import edu.avanzada.taller1.vista.VistaMostrarConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlConsultarPersona implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VistaConsultarPersona vistaConsultarPersona;
    private VistaMostrarConsulta mostrarConsulta;
    private int c = 0;
    private boolean personaNoEncontrada = false;

    public ControlConsultarPersona(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearVistaConsultarPersona (){
        vistaConsultarPersona = new VistaConsultarPersona(this);        
        vistaConsultarPersona.botonConsultarCedula.addActionListener(this);
        vistaConsultarPersona.botonSalir.addActionListener(this);
        vistaConsultarPersona.botonVolverMenu.addActionListener(this);
        c = 1;
    }
    
    public void crearVistaMostrarConsulta(String datos){
        mostrarConsulta = new VistaMostrarConsulta(this);
        mostrarConsulta.botonSalir.addActionListener(this);
        mostrarConsulta.botonVolverMenu.addActionListener(this);
        mostrarConsulta.datosConsulta.setText("<html>"+datos+"</html>");
        c = 2;
    }
    
    public void consultarPersona(String cedula){
        Persona persona;
        personaNoEncontrada = true;
        for(int i=0;i<controlPrincipal.personas.size();i++){
            if(cedula.equals(controlPrincipal.personas.get(i).getCedula())){
                persona = controlPrincipal.personas.get(i);
                String caso = persona.getClass().getName();
                switch(caso){
                    case "edu.avanzada.taller1.modelo.Reclutado":
                        Reclutado recluta = (Reclutado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(recluta.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Reservista":
                        Reservista reservista = (Reservista) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(reservista.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Remiso":
                        Remiso remiso = (Remiso) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(remiso.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Aplazado":
                        Aplazado aplazado = (Aplazado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(aplazado.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Consultar Cedula".equals(e.getActionCommand())) {
            consultarPersona(vistaConsultarPersona.jTextFieldConsultarCedula.getText());
            if (personaNoEncontrada == false){
                vistaConsultarPersona.dispose();
            } else if (personaNoEncontrada == true){
                JOptionPane.showMessageDialog(null, "Cedula "+vistaConsultarPersona.jTextFieldConsultarCedula.getText()+" no encontrada en el sistema");
            }
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch(c) {
                    case 1:
                        vistaConsultarPersona.dispose();
                        controlPrincipal.crearVista();
                        break;
                    case 2:
                        mostrarConsulta.dispose();
                        crearVistaConsultarPersona();
                        break;
            }
        }
    }
}
