package application;

public class Client {
	private String age;
	private double intAge;
	private double healthAge;
	private String BMI;
	private String vExercise;
	private String mExercise;
	private String sTraining;
	private String redFoods;
	private String sleep;
	private String cholesterol;
	private String bloodPressure;
	private String smoking;
	private String bloodGlucose;
	private String socialConnection;
	private String stress;
	
	public void setAge(String age) {
		this.age = age;
		this.intAge = Integer.parseInt(age);
		this.healthAge = Double.parseDouble(age);
	}
	public void setBMI(String BMI) {
		this.BMI = BMI;
	}
	public void setVExercise(String vExercise) {
		this.vExercise = vExercise;
	}
	public void setMExercise(String mExercise) {
		this.mExercise = mExercise;
	}
	public void setSTraining(String sTraining) {
		this.sTraining = sTraining;
	}
	public void setRedFood(String redFoods) {
		this.redFoods = redFoods;
	}
	public void setSleep(String sleep) {
		this.sleep = sleep;
	}
	public void setCholersterol(String cholesterol) {
		this.cholesterol = cholesterol;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public void setBloodGlucose(String bloodGlucose) {
		this.bloodGlucose = bloodGlucose;
	}
	public void setSocialConnection(String socialConnection) {
		this.socialConnection = socialConnection;
	}
	public void setStress(String stress) {
		this.stress = stress;
	}
	public String getAge() {
		return age;
	}
	public double getHealthage() {
		return healthAge;
	}
	public String getBMI() {
		return BMI;
	}
	public String getVExercise() {
		return vExercise;
	}
	public String getMExercise() {
		return mExercise;
	}
	public String getSTraining() {
		return sTraining;
	}
	public String getRedFoods() {
		return redFoods;
	}
	public String getSleep() {
		return sleep;
	}
	public String getCholesterol() {
		return cholesterol;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public String getSmoking() {
		return smoking;
	}
	public String getBloodGlucose() {
		return bloodGlucose;
	}
	public String getSocialConnection() {
		return socialConnection;
	}
	public String getStress() {
		return stress;
	}
	
	public double returnHealthAge() {
		healthAge = intAge + (intAge * .5) *  (BMICalculation() + aerobicExerciseCalculation() +strengthTrainingCalculation() + redFoodCalculation() + sleepCalculator()
		+ cholesterolCalculation() + bloodPressureCalculation() + smokingCalculation() + bloodGlucoseCalculation()
		+ socialConnectionCalculation() + stressCalculation());
		
		return healthAge;
	}
	private double BMICalculation() {
		double scale = 0;
		
		if (BMI.equals("Too Thin")) {
			scale = .02;
		}
		else if (BMI.equals("Healthy")) {
			scale = -.05;
		}
		else if (BMI.equals("Overweight")) {
			scale = -.01;
		}
		else if (BMI.equals("Moderately Overweight")) {
			scale = .05;
		}
		else if(BMI.equals("Severely Overweight")) {
			scale = .08;
		}
		else if(BMI.equals("Morbidly Obese")) {
			scale = .1;
		}
		else if(BMI.equals("null")) {
			return 0;
		}
		return scale;
	}
	private double aerobicExerciseCalculation() {
		double scale = 0.0;
		int mExerciseInt;
		int vExerciseInt;
		try {
			mExerciseInt = Integer.parseInt(mExercise);
		} catch (NumberFormatException ex) {
			mExerciseInt = 0;
		}
		try {
			vExerciseInt = Integer.parseInt(vExercise);
		} catch (NumberFormatException ex) {
			vExerciseInt = 0;
		}
		int exercise = mExerciseInt + 2 * vExerciseInt;
		if (exercise <= 10) {
			scale = .06;
		}
		else if (exercise <= 30) {
			scale = .02;
		}
		else if (exercise <= 45) {
			scale = -.03;
		}
		else if (exercise > 45) {
			scale = -.06;
		}
		return scale;
	}
	private double strengthTrainingCalculation() {
		double scale = 0.0;
		if (sTraining.equals("0-29 minutes")) {
			scale = .04;
		}
		else if (sTraining.equals("30-59 minutes")) {
			scale = .01;
		}
		else if (sTraining.equals("60-119 minutes")) {
			scale = -.02;
		}
		else if (sTraining.equals("120 > minutes")) {
			scale = -.04;
		}
		else if(sTraining.equals("null")) {
			return 0;
		}
		return scale;
	}
	private double redFoodCalculation() {
		double scale = 0.0;
		if (redFoods.equals("null")) {
			return 0;
		}
		else if (redFoods.equals("7 or less/week")) {
			scale = -.11;
		}
		else if (redFoods.equals("7.1 - 13.9/week")) {
			scale = -.05;
		}
		else if (redFoods.equals("14 - 20.9/week")) {
			scale = .01;
		}
		else if (redFoods.equals("21 - 27.9/week")) {
			scale = .06;
		}
		else if (redFoods.equals("> 28/week")) {
			scale = .11;
		}
		return scale;
	}
	private double sleepCalculator() {
		double scale = 0.0;
		if (sleep.equals("7-9/Day")) {
			scale = -.03;
		}
		else if (sleep.equals("< 7/Day")) {
			scale = .03;
		}
		else if (sleep.equals("> 9/Day")) {
			scale = .05;
		}
		else {
			return 0;
		}
		return scale;
	}
	private double cholesterolCalculation() {
		double scale = 0.0;
		if (cholesterol.equals("Great")) {
			scale = -0.04;
		}
		else if (cholesterol.equals("Good")) {
			scale = -0.02;
		}
		else if (cholesterol.equals("High")) {
			scale = 0.02;
		}
		else if (cholesterol.equals("Really High")) {
			scale = 0.04;
		}
		else if (cholesterol.equals("I don't know")) {
			scale = 0;
		}
		else {
			return 0;
		}
		return scale;
	}
	private double bloodPressureCalculation() {
		double scale = 0.0;
		if (bloodPressure.equals("Great")) {
			scale = -.04;
		}
		else if (bloodPressure.equals("Borderline")) {
			scale = -.02;
		}
		else if (bloodPressure.equals("High")) {
			scale = .03;
		}
		else if (bloodPressure.equals("Moderately High")) {
			scale = .05;
		}
		else if (bloodPressure.equals("Severely Elevated")) {
			scale = .08;
		}
		else if (bloodPressure.equals("I don't know")) {
			scale = 0;
		}
		else {
			return 0;
		}
		return scale;	
	}
	private double smokingCalculation() {
		double scale = 0.0;
		if (smoking.equals("Yes")) {
			scale = .12;
		}
		else {
			return 0;
		}
		return scale;
	}
	private double bloodGlucoseCalculation() {
		double scale = 0.0;
		if (bloodGlucose.equals("Normal")) {
			scale = -.06;
		}
		else if (bloodGlucose.equals("Pre-Diabetes")) {
			scale = .01;
		}
		else if (bloodGlucose.equals("Diabetes, controlled")) {
			scale = .02;
		}
		else if (bloodGlucose.equals("Diabetes")) {
			scale = .06;
		}
		else {
			return 0;
		}
		return scale;		
	}
	private double socialConnectionCalculation() {
		double scale = 0.0;
		if (socialConnection.equals("Rarely")) {
			scale = -.03;
		}
		else if (socialConnection.equals("Sometimes")) {
			scale = -.01;
		}
		else if (socialConnection.equals("Often")) {
			scale = .03;
		}
		else {
			return 0;
		}
		return scale;
	}
	private double stressCalculation() {
		double scale;
		if (stress.equals("A little")) {
			scale = -.03;
		}
		else if (stress.equals("Some")) {
			scale = -.01;
		}
		else if (stress.equals("A lot")) {
			scale = .03;
		}
		else {
			return 0;
		}
		return scale;
	}
	
	
	

}
