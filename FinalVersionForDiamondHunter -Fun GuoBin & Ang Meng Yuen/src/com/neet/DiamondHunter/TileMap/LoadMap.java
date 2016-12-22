//To load a default blank map without sprite
package com.neet.DiamondHunter.TileMap;


import java.awt.Graphics;
import javax.swing.JPanel;

public class LoadMap extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private TileMap tilemap;

	public LoadMap(){			//Load Map and tile
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map");
		tilemap.loadTiles("/Tilesets/testtileset.gif");	
	}
	
	public void paint (Graphics g){ //Call draw from tilemap
		tilemap.draw(g);
	}
}