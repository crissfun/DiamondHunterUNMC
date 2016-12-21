package com.neet.DiamondHunter.TileMap;


import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import com.neet.DiamondHunter.Entity.Item;

public class ModifyAxeBoatLocation extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	
	private TileMap tilemap; //Call Draw from tilemap
	private Item item;
	private Item item1;
	private ArrayList<Item> items;
	private ArrayList<Item> items1;
	
	List<Integer> index = new ArrayList<>();
	
	public ModifyAxeBoatLocation(){   
		items = new ArrayList<Item>(); //axe
		items1 = new ArrayList<Item>(); //boat
		
		tilemap = new TileMap(16);
		tilemap.loadMap("/Maps/testmap.map"); //load map
		tilemap.loadTiles("/Tilesets/testtileset.gif"); //load tiles
		
	
			try {
				for (String line : Files.readAllLines(Paths.get("itemsandcharacter.txt"))){
					Integer i = Integer.valueOf(line);
				    index.add(i);
				}
			}  catch (IOException e)
			{
						e.printStackTrace();
			}
		
	
	item = new Item(tilemap);
	item.setType(Item.AXE);
	item.setTilePosition(index.get(1),index.get(0));
	items.add(item);
	
	item1 = new Item(tilemap);
	item1.setType(Item.BOAT);
	item1.setTilePosition(index.get(3),index.get(2));
	items1.add(item1);
	}
    
	public void paint (Graphics g){
		tilemap.draw(g); //call draw from tilemap
		item.draw(g);
		item1.draw(g);
	}

}