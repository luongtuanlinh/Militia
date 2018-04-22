
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MONMON
 */
public class MouseInput implements MouseListener{

    @Override
    public void mousePressed(MouseEvent e) {
    	if (Game.State == Game.STATE.MENU) {
    		int mx = e.getX();
                int my = e.getY();
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 200 && my <= 274){
                    //Press play button
                    MenuButton.startButtonState = true;
                }
            }
            
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 300 && my <= 374){
                    //Press play button
                    MenuButton.helpButtonState = true;
                }
            }
            
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 400 && my <= 474){
                    //Press play button
                	MenuButton.quitButtonState = true;
                }
            }
    	}
        else if(Game.State == Game.STATE.GAME){
            int mx = e.getX();
            int my = e.getY();
            if (mx >= Game.WIDTH - 600 && mx <= Game.WIDTH - 600 +274){
                if (my >= 0 && my <= 74){
                    //Press quit button
                    MenuButton.exitButtonState = true;
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    	if (Game.State == Game.STATE.MENU) {
            int mx = e.getX();
            int my = e.getY();
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 200 && my <= 274){
                    //Press play button
                    Game.State = Game.STATE.GAME;
                    MenuButton.startButtonState = false;
                }
            }
            
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 300 && my <= 374){
                    //Press play button
                    MenuButton.helpButtonState = false;
                }
            }
            
            if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 +120+274){
                if (my >= 400 && my <= 474){
                	MenuButton.quitButtonState = false;
                    //Press play button
                    System.exit(1);
                }
            }
        }
        else if (Game.State == Game.STATE.GAME) {
            int mx = e.getX();
            int my = e.getY();
            if (mx >= Game.WIDTH - 600 && mx <= Game.WIDTH - 600 +274){
                if (my >= 0 && my <= 74){
                    //release exit button
                    Game.State = Game.STATE.MENU;
                    MenuButton.exitButtonState = false;
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}