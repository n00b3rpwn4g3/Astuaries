// mockup #1 of game
// cisc275 team 8

/*  Model  View  Controller  */

/*
OUTLINE OF CODE:
class game
	contains the main() method where all other things are called and run; the game loop
class menu -- general class that includes any type of non-gameplay menu
	attributes should include position on screen and other things, and the view parts should take these
	...model attributes and actually deal with the rendering of it
class gameWorld -- the sort of universe of the game, everything happens in here during gameplay (i.e. not menus)
class gameEntity -- something that can exist and act in game world
	attributes:{collidable,movable,intelligent...}
	subclass player
	subclass npc
	subclass enemy
	subclass prop
*/
