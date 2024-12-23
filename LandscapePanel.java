/*
Name: Maya Kalenak
Purpose: Create landscape display
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LandscapePanel extends JPanel {
    private Landscape scape;
    private int gridScale;

    public LandscapePanel(int width, int height) {
        super();
        this.scape = scape;
        this.gridScale = gridScale;
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.lightGray);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        scape.draw(g, gridScale);
    }
}