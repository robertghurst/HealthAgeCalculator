package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	
	ObservableList<String> list = FXCollections.observableArrayList();
	@FXML
	private TextField z0textField;
	@FXML
	private ChoiceBox<String> z1choiceBox;
	@FXML
	private TextField moderateExercise; //z2
	@FXML
	private TextField vigorousExercise; //z2
	@FXML
	private ChoiceBox<String> z3choiceBox;
	@FXML
	private ChoiceBox<String> z4choiceBox;
	@FXML
	private ChoiceBox<String> z5choiceBox;
	@FXML
	private ChoiceBox<String> z6choiceBox;
	@FXML
	private ChoiceBox<String> z7choiceBox;
	@FXML
	private ChoiceBox<String> z8choiceBox;
	@FXML
	private ChoiceBox<String> z9choiceBox;
	@FXML
	private ChoiceBox<String> z10choiceBox;
	@FXML
	private ChoiceBox<String> z11choiceBox;
	@FXML
	private TextField textField;
	private void loadZ1Data() {
		list.removeAll(list);
		String a = "Too Thin";
		String b = "Healthy";
		String c = "Moderately Overweight";
		String d = "Severely Overweight";
		String e = "Morbidly Obese";
		list.addAll(a,b,c,d,e);
		z1choiceBox.getItems().addAll(list);
	}
	private void loadZ3Data() {
		list.removeAll(list);
		String a = "0-29 minutes";
		String b = "30-59 minutes";
		String c = "60-119 minutes";
		String d = "120 > minutes";
		list.addAll(a,b,c,d);
		z3choiceBox.getItems().addAll(list);
	}
	private void loadZ4Data() {
		list.removeAll(list);
		String a = "7 or less/week";
		String b = "7.1 - 13.9/week";
		String c = "14 - 20.9/week";
		String d = "21 - 27.9/week";
		String e = "> 28/week";
		list.addAll(a,b,c,d,e);
		z4choiceBox.getItems().addAll(list);
	}
	private void loadZ5Data() {
		list.removeAll(list);
		String a = "7-9/Day";
		String b = "< 7/Day";
		String c = "> 9/Day";
		
		list.addAll(a,b,c);
		z5choiceBox.getItems().addAll(list);
	}
	private void loadZ6Data() {
		list.removeAll(list);
		String a = "Great";
		String b = "Good";
		String c = "High";
		String d = "Really High";
		String e = "I don't know";
		
		list.addAll(a,b,c,d,e);
		z6choiceBox.getItems().addAll(list);
	}
	private void loadZ7Data() {
		list.removeAll(list);
		String a = "Great";
		String b = "Borderline";
		String c = "High";
		String d = "Moderately High";
		String e = "Severely Elevated";
		String f = "I don't know";
		
		list.addAll(a,b,c,d,e,f);
		z7choiceBox.getItems().addAll(list);
	}
	private void loadZ8Data() {
		list.removeAll(list);
		String a = "Yes";
		String b = "No";
		
		list.addAll(a,b);
		z8choiceBox.getItems().addAll(list);
	}
	private void loadZ9Data() {
		list.removeAll(list);
		String a = "Normal";
		String b = "Pre-Diabetes";
		String c = "Diabetes, controlled";
		String d = "Diabetes";
		String e = "I don't know";
		
		list.addAll(a,b,c,d,e);
		z9choiceBox.getItems().addAll(list);
	}
	private void loadZ10Data() {
		list.removeAll(list);
		String a = "Rarely";
		String b = "Sometimes";
		String c = "Often";
		
		list.addAll(a,b,c);
		z10choiceBox.getItems().addAll(list);
	}
	private void loadZ11Data() {
		list.removeAll(list);
		String a = "A little";
		String b = "Some";
		String c = "A lot";
		
		list.addAll(a,b,c);
		z11choiceBox.getItems().addAll(list);
	}
	public void createPatient() {
		Client client = new Client();
		if (z0textField.getText() == null) {
			client.setAge("50"); //default age
		}
		else {
			client.setAge(z0textField.getText());
		}
		if (z1choiceBox.getValue() == null) {
			client.setBMI("null");
		}
		else {
			client.setBMI(z1choiceBox.getValue());
		}
		if (moderateExercise.getText() == null)	{
			client.setMExercise("-INF");
		}
		else {
			client.setMExercise(moderateExercise.getText());
		}
		if (vigorousExercise.getText() == null)	{
			client.setVExercise("-INF");
		}
		else {
			client.setVExercise(vigorousExercise.getText());
		}
		if (z3choiceBox.getValue() == null)	{
			client.setSTraining("null");
		}
		else {
			client.setSTraining(z3choiceBox.getValue());
		}
		if (z4choiceBox.getValue() == null)	{
			client.setRedFood("null");
		}
		else {
			client.setRedFood(z4choiceBox.getValue());
		}
		if (z5choiceBox.getValue() == null)	{
			client.setSleep("null");
		}
		else {
			client.setSleep(z5choiceBox.getValue());
		}
		if (z6choiceBox.getValue() == null)	{
			client.setCholersterol("null");
		}
		else {
			client.setCholersterol(z6choiceBox.getValue());
		}
		if (z7choiceBox.getValue() == null)	{
			client.setBloodPressure("null");
		}
		else {
			client.setBloodPressure(z7choiceBox.getValue());
		}
		if (z8choiceBox.getValue() == null)	{
			client.setSmoking("null");
		}
		else {
			client.setSmoking(z8choiceBox.getValue());
		}
		if (z9choiceBox.getValue() == null)	{
			client.setBloodGlucose("null");
		}
		else {
			client.setBloodGlucose(z9choiceBox.getValue());
		}
		if (z10choiceBox.getValue() == null)	{
			client.setSocialConnection("null");
		}
		else {
			client.setSocialConnection(z10choiceBox.getValue());
		}	
		if (z11choiceBox.getValue() == null)	{
			client.setStress("null");
		}
		else {
			client.setStress(z11choiceBox.getValue());
		}
			
		textField.setText(String.valueOf(client.returnHealthAge()));
	
		
	}


	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
			loadZ1Data();
			loadZ3Data();
			loadZ4Data();
			loadZ5Data();
			loadZ6Data();
			loadZ7Data();
			loadZ8Data();
			loadZ9Data();
			loadZ10Data();
			loadZ11Data();
			moderateExercise.setText("0");
			vigorousExercise.setText("0");
	
	}
	

}

/*
 System.out.println(client.getBMI());
		System.out.println(client.getMExercise());
		System.out.println(client.getVExercise());
		System.out.println(client.getSTraining());
		System.out.println(client.getRedFoods());
		System.out.println(client.getRedFoods());
		System.out.println(client.getSleep());
		System.out.println(client.getCholesterol());
		System.out.println(client.getBloodPressure());
		System.out.println(client.getSocialConnection());
		System.out.println(client.getStress());
		*/
