
package com.neet.DiamondHunter.TileMap;


import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import com.neet.DiamondHunter.Entity.Item;

public class LoadAxeBoat extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	
	private TileMap tilemap;
	private Item item; //axe 
	private Item item1; //boat 
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	

	public LoadAxeBoat(){
		items = new ArrayList<Item>();
		items1 = new ArrayList<Item>();
		
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map"); //Load Map
		tilemap.loadTiles("/Tilesets/testtileset.gif"); //Load tiles
		
		
		item = new Item(tilemap);
		item.setType(Item.AXE);
		item.setTilePosition(26,37);
		items.add(item); //axe
		
		item1 = new Item(tilemap);
		item1.setType(Item.BOAT);
		item1.setTilePosition(12, 4);
		items1.add(item1);  //boat
		
		
	}

	public void paint (Graphics g){ //call draw from tilemap
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
	
}