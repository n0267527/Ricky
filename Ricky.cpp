#include "stdafx.h"
#include "gwin.h"

int main()
{
	GWindow Gwin;
	Gwin.showDebugOverlay(false);
	Gwin.clear();
	
	// Write some text and refresh the screen
	Gwin.setPenColour(BLACK);
	Gwin.writeText(100, 100, "Hello!");
	Gwin.refresh();
	
	//
	// Insert your code here 
	//	
	// Remember to use Gwin.refresh() if you want your changes to appear on screen!
	//
	
	// Wait for a key to be pressed
	Keyboard.waitKey();
	
	return 0;
}
	
