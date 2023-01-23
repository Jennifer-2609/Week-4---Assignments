package week4Assigments;

public class Automation extends MultipleLangauge implements TestTool,Language{

	public void java() {
		System.out.println("Java is interesting to learn");
	}

	public void selenium() {
		System.out.println("Automation testing open source tool");
	}

	@Override
	public void ruby() {
		System.out.println("It is also a programmming language");
	}
	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
	}
	
	
}
