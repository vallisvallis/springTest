package com.beans;

public class Computer {
private MainFrame mainFrame;
private Display display;
public void show(){
	
	mainFrame.show();
	display.show();
	
}
public MainFrame getMainFrame() {
	return mainFrame;
}
public void setMainFrame(MainFrame mainFrame) {
	this.mainFrame = mainFrame;
}
public Display getDisplay() {
	return display;
}
public void setDisplay(Display display) {
	this.display = display;
}


}
