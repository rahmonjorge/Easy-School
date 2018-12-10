package br.ufrpe.easy_school.gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ScreenManager {

	private static ScreenManager instance;
    private Stage mainStage;

    
    private Scene cena1;
    private Scene perfilAluno;
    private Scene perfilProfessor;
    private Scene perfilDisc;

    
    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager();
        } 
        
        return instance; 
    }
    
    private ScreenManager() {
        
        try {
        	 
        	
            BorderPane testPane = FXMLLoader.load(getClass().getResource(
              "/br/ufrpe/easy_school/gui/Scene1.fxml"));      
            this.cena1 = new Scene(testPane);
            

            
            
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
           
        mainStage.setWidth(600);
        mainStage.setHeight(400);
    }
    
    
    public void showCena1(){
    	this.mainStage.setScene(cena1);
    	this.mainStage.show();
    }
    
    public void showPerfilAluno(){

    	BorderPane scene;
		try {
			scene = FXMLLoader.load(getClass().getResource(
			        "/br/ufrpe/easy_school/gui/PerfilAluno.fxml"));
			this.perfilAluno = new Scene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
              
    	
    	
    	this.mainStage.setScene(perfilAluno);
    	this.mainStage.show();
    }
    
    public void showPerfilProfessor(){

    	AnchorPane scene;
		try {
			scene = FXMLLoader.load(getClass().getResource(
			        "/br/ufrpe/easy_school/gui/PerfilProfessor.fxml"));
			this.perfilProfessor = new Scene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
              
    	
    	
    	this.mainStage.setScene(perfilProfessor);
    	this.mainStage.show();
    }
    
    public void showDisc() {
    	AnchorPane scene;
    	try {
			scene = FXMLLoader.load(getClass().getResource(
			        "/br/ufrpe/easy_school/gui/PerfilDisciplina.fxml"));
			this.perfilDisc = new Scene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	this.mainStage.setScene(perfilDisc);
    	this.mainStage.show();
    }
	

    
}