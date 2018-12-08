package br.ufrpe.easy_school.gui;

import java.io.IOException;

import br.ufrpe.easy_school.negocios.EscolaFachada;
import br.ufrpe.easy_school.negocios.KeepDisciplina;
import br.ufrpe.easy_school.negocios.KeepPerson;
import br.ufrpe.easy_school.negocios.beans.Professor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

@SuppressWarnings("unused")
public class PerfilProfessorController {

    @FXML
    private Label lblNomeProf;

    @FXML
    private ChoiceBox<String> choiceDisc;

    @FXML
    private Button btnGoDisc;

    @FXML
    void showDisc(ActionEvent event) {
    	KeepDisciplina.getInstance().setDisciplina(EscolaFachada.getInstance().buscarDisciplina(choiceDisc.getValue()));
    	ScreenManager.getInstance().showDisc();
    	
		  
    }
    
    @FXML
    public void initialize() {
    	lblNomeProf.setText(KeepPerson.getInstance().getPessoa().getName());
    	ObservableList<String> opcoes = FXCollections.observableArrayList(EscolaFachada.getInstance().arrayDisc((Professor) KeepPerson.getInstance().getPessoa()));
    	choiceDisc.setItems(opcoes);
    }

}
