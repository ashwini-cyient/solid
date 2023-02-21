package com.srp.without.srp;

public class TextManipulator {
	private String text;

	public TextManipulator(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	// Methods to manipulate text. -- Responsibility 1
	public void appendText(String newText) {
		text = text.concat(newText);
	}

	public String findWordAndReplace(String word, String replacementWord) {
		if (text.contains(word)) {
			text = text.replace(word, replacementWord);
		}
		return text;
	}

	public String findWordAndDelete(String word) {
		if (text.contains(word)) {
			text = text.replace(word, "");
		}
		return text;
	}

	// Method to print text. -- Responsibility 2
	public void printText() {
		System.out.println(this.getText());
	}

}
