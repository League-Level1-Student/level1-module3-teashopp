package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		
		Backpack becky = new Backpack();
		
		becky.putInBackpack(Pencil);
		becky.putInBackpack(Ruler);
		becky.putInBackpack(Textbook);
		becky.packAndCheck();
		
	}
}
