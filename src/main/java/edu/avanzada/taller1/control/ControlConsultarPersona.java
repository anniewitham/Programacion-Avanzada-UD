package edu.avanzada.taller1.control;
import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.vista.ConsultarPersona;
import edu.avanzada.taller1.vista.MostrarConsultaCedula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlConsultarPersona implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private ConsultarPersona vistaConsultarPersona;
    private MostrarConsultaCedula mostrarConsulta;
    private int c = 0;

    public ControlConsultarPersona(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearVistaConsultarPersona (){
        vistaConsultarPersona = new ConsultarPersona(this);        
        vistaConsultarPersona.botonConsultarCedula.addActionListener(this);
        vistaConsultarPersona.botonSalir.addActionListener(this);
        vistaConsultarPersona.botonVolverMenu.addActionListener(this);
        c = 1;
    }
    
    public void crearVistaMostrarConsulta(String datos){
        mostrarConsulta = new MostrarConsultaCedula(this);
        mostrarConsulta.botonSalir.addActionListener(this);
        mostrarConsulta.botonVolverMenu.addActionListener(this);
        mostrarConsulta.datosConsulta.setText("<html>"+datos+"</html>");
        c = 2;
    }
    
    public void consultarPersona(String cedula){
        Persona persona;
        for(int i=0;i<controlPrincipal.personas.size();i++){
            if(cedula.equals(controlPrincipal.personas.get(i).getCedula())){
                persona = controlPrincipal.personas.get(i);
                String caso = persona.getClass().getName();
                System.out.println(caso);
                switch(caso){
                    case "edu.avanzada.taller1.modelo.Reclutado":
                        Reclutado recluta = (Reclutado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(recluta.mostrarDatos());
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
            vistaConsultarPersona.dispose();
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch(c) {
                    case 1:
                        vistaConsultarPersona.dispose();
                        controlPrincipal.crearVista();
                        System.out.println("123");
                        break;
                    case 2:
                        mostrarConsulta.dispose();
                        crearVistaConsultarPersona();
                        break;
            }
        }
    }
}
