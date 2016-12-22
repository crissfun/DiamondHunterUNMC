
package diamond;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import com.neet.DiamondHunter.Main.GamePanel;
import com.neet.DiamondHunter.TileMap.TileMap;
import com.neet.DiamondHunter.TileMap.LoadMap;
import com.neet.DiamondHunter.TileMap.LoadAxeBoat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller implements Initializable {
	
	private TileMap tilemap;
	private Item item;
	private Item item1;
	
	
	@Override
	public void initialize ( URL arg0 , ResourceBundle arg1){
		
	}
	
	@FXML
	private Button loadmap;	
	@FXML
	private Button axeboat;
	@FXML
	private Button play;
	@FXML
	private TextField axeX;
	@FXML
	private TextField axeY;
	@FXML
	private TextField boatX;
	@FXML
	private TextField boatY;
	@FXML
	private Button submit;
	@FXML
	private Label label;
	@FXML
	private Label MV;
	@FXML
	private Label thegame; 
	
	@FXML
	public void map (ActionEvent event){
		
				JFrame frame = new JFrame ("Original Map"); //create the screen for original map
				frame.setSize(new Dimension (656, 679));//size of screen
				frame.setLocation(new Point(350,60)); //screen starting point
				LoadMap panel = new LoadMap(); //panel container
				frame.setContentPane(panel);
				frame.setVisible(true);
	}
	
	@FXML
	public void axeboatsc (ActionEvent event){
		
				JFrame frame = new JFrame ("Axe and Boat on map"); //create screen
			
				frame.setSize(new Dimension (656, 679)); //size of screen
				frame.setLocation(new Point(350,60));
				LoadAxeBoat panel = new LoadAxeBoat();
				frame.setContentPane(panel);
				frame.setVisible(true);
	}
	
	@FXML
	public void dhsc (ActionEvent event){
		JFrame window = new JFrame("Diamond Hunter"); //Diamond hunter screen
		
		window.add(new GamePanel());
		
		window.setResizable(false);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	@FXML
	public void getaxeboatloc (ActionEvent event){
		//gets coordinates of axe and boat from user's input
		int aX = Integer.parseInt(axeX.getText());
		int aY = Integer.parseInt(axeY.getText());
		int bX = Integer.parseInt(boatX.getText());
		int bY = Integer.parseInt(boatY.getText());
		
		try{
        		 //print the input in itemsandcharacter.txt
        	PrintWriter output= new PrintWriter("itemsandcharacter.txt","UTF-8");
        	
        	output.println(aX);
        	output.println(aY);
        	output.println(bX);
        	output.println(bY);
        	output.close();}
		
		catch (IOException e){
        	System.out.println("Error writting to a txt file");
        }
        	
		
		
		JFrame frame = new JFrame ("New Axe and Boat Location"); //create screen
		
		frame.setSize(new Dimension (656, 679));
		frame.setLocation(new Point(350,60));
		ModifyAxeBoatLocation panel = new ModifyAxeBoatLocation();
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		
	}

	public void paint (Graphics g){ //call draw from tilemap
		tilemap.draw(g);
		item.draw(g);
		item1.draw(g);
	}
	
	
}
	

