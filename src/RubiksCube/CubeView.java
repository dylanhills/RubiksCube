package RubiksCube;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CubeView extends JFrame{
    RubiksCube myCube = new RubiksCube();
    JPanel container = new JPanel(new GridLayout(3,4));
    
    ArrayList<JPanel> facePanels = new ArrayList<JPanel>();
    //u,d,l,r,f,b
    
    JPanel[] emptyPanels = new JPanel[6];
    JPanel[][][] stickerPanels = new JPanel[6][3][3];
    public CubeView(){
        for(int i = 0; i<emptyPanels.length; i++){
            emptyPanels[i] = new JPanel();
        }
        for(int i = 0; i<6; i++){
            facePanels.add(new JPanel());
            facePanels.get(i).setLayout(new GridLayout(3,3));
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    stickerPanels[i][j][k] = new JPanel();
                    stickerPanels[i][j][k].setBorder(BorderFactory.createLineBorder(Color.white, 2)); 
                    stickerPanels[i][j][k].setBackground(new Color(0,0,(int)(Math.random()*200)));
                    facePanels.get(i).add(stickerPanels[i][j][k]);
                }
            }
        }
        stickerPanels[0][1][1].setBackground(RubiksColor.yellow);
        stickerPanels[1][1][1].setBackground(RubiksColor.white);
        stickerPanels[2][1][1].setBackground(RubiksColor.green);
        stickerPanels[3][1][1].setBackground(RubiksColor.blue);
        stickerPanels[4][1][1].setBackground(RubiksColor.orange);
        stickerPanels[5][1][1].setBackground(RubiksColor.red);
        
        container.add(emptyPanels[0]);
        container.add(emptyPanels[1]);
        container.add(facePanels.get(0));
        container.add(emptyPanels[2]);
        
        container.add(facePanels.get(5));
        container.add(facePanels.get(2));
        container.add(facePanels.get(4));
        container.add(facePanels.get(3));
        
        container.add(emptyPanels[3]);
        container.add(emptyPanels[4]);
        container.add(facePanels.get(1));
        container.add(emptyPanels[5]);
        
        add(container);
        setVisible(true);
        setBounds(0,0,500,500);
    }
}
