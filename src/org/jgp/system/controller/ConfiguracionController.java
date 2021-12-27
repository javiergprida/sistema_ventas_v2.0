
package org.jgp.system.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import org.jgp.system.models.Configuracion;
import org.jgp.system.models.UsersDao;
import org.jgp.system.views.component.SubFormConfig;


public class ConfiguracionController implements MouseListener, ActionListener {
    private Configuracion cf;
    private UsersDao userD;
    private SubFormConfig sfconfig;
    
    public ConfiguracionController( UsersDao userD, Configuracion cf ,SubFormConfig sfconfig){
        this.sfconfig = sfconfig;
        this.cf = cf;
        this.userD = userD;
        this.sfconfig.btnModificarConfig.addActionListener(this);
        cf = userD.getConfig();
        sfconfig.boxIdConfig.setText(""+cf.getId());
        sfconfig.boxCuitConfig.setText(cf.getCuit());
        sfconfig.boxNombreConfig.setText(cf.getNombre());
        sfconfig.boxTelefonoConfig.setText(cf.getTelefono());
        sfconfig.boxDireccionConfig.setText(cf.getDireccion());
        sfconfig.boxMensajeConfig.setText(cf.getMensaje());
    
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
