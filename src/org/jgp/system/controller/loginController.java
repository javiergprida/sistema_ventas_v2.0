
package org.jgp.system.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.jgp.system.models.Users;
import org.jgp.system.models.UsersDao;
import org.jgp.system.views.Index;
import org.jgp.system.views.LoginSystem;


public class loginController implements ActionListener {
    private Users us;
    private UsersDao usDao;
    private LoginSystem ls;

    public loginController(Users us, UsersDao usDao, LoginSystem ls) {
        this.us = us;
        this.usDao = usDao;
        this.ls = ls;
        this.ls.btnlogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ls.btnlogin){
            if(ls.boxUsername.getText().equals("")){
                JOptionPane.showMessageDialog(null, "el campo username esta vacio");
            }else if(String.valueOf( ls.boxPassword.getPassword()).equals("")){
                 JOptionPane.showMessageDialog(null, "el campo password esta vacio");
            
            }else{
                
                String username = ls.boxUsername.getText();
                String password = String.valueOf(ls.boxPassword.getPassword());
                
                us = usDao.Login(username, password);
                if(us.getUsername() != null){
                      Index index = new Index();  
                      index.setVisible(true);
                      this.ls.dispose();
                }else{
                     JOptionPane.showMessageDialog(null, "username or password incorrecto");
                
                }
                
            
            }
        
        }
    
    }
    
    
}
