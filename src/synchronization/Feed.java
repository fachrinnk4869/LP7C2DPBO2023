/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Fachri Najm
 */
public class Feed extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Feed()
    {
        super(0, 0,15,15, "Feed");
    }
    
    // Constructor with player position.
    public Feed(int x, int y)
    {
        super(x, y,15,15, "Feed");
    }
    
    
    
    /**
     * Override interface.
     * @param object
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#883EEB"));
        object.fillOval(x, y, width, height);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
//        System.out.println(this.x + " " + this.velX);
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
