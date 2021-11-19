package org.jgp.system.views;


public class ScreenSplash {
    
    
    
    public static void main(String[] args) {
        
        ScreenSplashSystem splash = new ScreenSplashSystem();
        splash.setVisible(true);
        try{
        
            for(int i = 0; i <= 100; i++){
                Thread.sleep(20);
            splash.cargando.setText(""+i+"%");
            splash.progressbar.setValue(i);
            if(i == 100){
                LoginSystem ls = new LoginSystem();
               splash.setVisible(false);
                ls.setVisible(true);
                
            
            }
            }
        }catch(Exception e){
        
        }
        
    }
}
