package org.lang;

public class StateDetails {
	public void northindia() {
		System.out.println("peoples are mostly speak hindi");
	}
	public void southindia()
	{
		System.out.println("peoples are mostly speak Dravidian language");
	}

	public static void main(String[] args) {
		StateDetails details = new StateDetails();
		details.northindia();
		details.southindia();
		LanguageInfo info = new LanguageInfo();
		info.english();
		info.hindi();
		info.tamizh();
	}
}
