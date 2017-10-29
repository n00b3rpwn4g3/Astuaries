// mockup #1 of game
// cisc275 team 8

/*
remember:
 _____ ______           ___      ___      ________     
|\   _ \  _   \        |\  \    /  /|    |\   ____\    
\ \  \ \__\ \  \       \ \  \  /  / /    \ \  \___|    
 \ \  \ |__| \  \       \ \  \/  / /      \ \  \       
  \ \  \    \ \  \       \ \    / /        \ \  \____  
   \ \__\    \ \__\       \ \__/ /          \ \_______\
    \|__|     \|__|        \|__|/            \|_______|

*/

/*   OUTLINE OF CODE:

MODEL:
class game
	contains the main() method where all other things are called and run; the game loop; this is how the one lab game worked and it was ok
class menu
	> general class that includes any type of non-gameplay menu
	attributes could include position on screen and other GUI things, and the view parts should take these
	model attributes and actually deal with the rendering of it
class gameWorld
	> the sort of universe of the game, everything happens in here during gameplay (i.e. not menus)
	> has Collection of all live game objects
class gameEntity
	> something that can exist and act in game world
	attributes:{collidable,movable,intelligent,health,...}
	subclass player
	subclass npc
	subclass enemy
	subclass prop
class gameRules
	> has the rules and game-logic such as telling when the game is over, counting score,
	> what to do on collision between harmful objects etc.
class physics --> MAYBE MAKE INTERFACEs THAT OBJECTS OBEY? like some objects are 'Movable' and stuff
	> has all the game physics, including especially collision detection and movement and time flow
	METHODS LIKE move() SHOULD BE OWNED BY THE OBJECT??? I guess it makes sense because it's more intuitive to think that the things move,
	...maybe the function calls should pass relevant physical attributes of the object to the physics class to do the calculation???
	maybe collision detection should only happen whenever something moves? otherwise it probably wont collide lol

VIEW:
for this mockup, just for testing physics and stuff, it will just be terminal i/o, no GUI
should print things including:
	menus
	state of various objects in game at some time step
	alert message every time a collision or other event happens

CONTROLLER:
class tick
	> it ticks lmao--but what does tick DO? does it call other functions or something?

* there are many equivalent correct formulation structures this can take, the important thing is to find a correct one AND KEEP THE CODE CONSISTENT WITH IT

*/

import java.util.*;

