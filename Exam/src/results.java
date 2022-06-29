
public class results {
//declaration and initialization of variable
	short physics = 80;
	short chemistry = 120;
	short biology = 60;
	short total = 0;
	
//First method to display each and total score	
	public void Display() {
		System.out.println("Your exams results are:");
		System.out.println("Physics :"+physics);
		System.out.println("Chemistry :"+chemistry);
		System.out.println("Biology :"+biology);
		total += physics+chemistry+biology;
		System.out.println("Total score is:"+total);
	}
	
//Second method to display each and overall percentage	
	public void Percentage() {
		float percentage = (float) total*100/450;
		float percentage_physics = (float) physics*100/150;
		float percentage_chemistry = (float) chemistry*100/150;
		float percentage_biology = (float) biology*100/150;
		System.out.println("Your overall percentage is:" + String.format("%.2f",percentage)+"%");
		System.out.println("Percentage physics:"+ String.format("%.2f", percentage_physics)+"%");
		System.out.println("Percentage chemistry:"+ String.format("%.2f",percentage_chemistry)+"%");
		System.out.println("Percentage biology:"+ String.format("%.2f",percentage_biology)+"%");
//Result based on single exams percentage		
		if (percentage_physics<60 || percentage_chemistry<60 || percentage_biology<60) {
			System.out.println("Sorry you have failed!");	
		} else System.out.println("Congratulation! You passed ");
	}

}
