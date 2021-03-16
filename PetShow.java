// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2021T1, Assignment 2
 * Name: Nathan Bridge-Earney
 * Username:bridgenath1
 * ID:300565456
 */

import ecs100.*;

/** Program to create simple animated animal character using the
 *  Animal class.  
 */

public class PetShow{

    /** animate creates two or several animals on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the animals.
     *  
     *  CORE
     */
    public void animate(){
        /*# YOUR CODE HERE */
        Animal dog = new Animal("dog","Scruff",100,100);
        Animal bird = new Animal("bird", "Fletcher", 400,200);
        bird.jump(200);
        bird.speak("Scruff come");
        dog.goRight(100);
        bird.shout("jump");
        dog.jump(20);
        bird.think("This dumb dog listens to me");

    }

    /** threeAnimalsRoutine creates three animals on the window.
     *  Then makes each animal do the same routine in turn.
     *  You should define a routine method, and threeAnimalsRoutine
     *   should call the routine method three times, to make
     *   each of the three animals perform the routine in turn.
     *   
     *   COMPLETION
     */
    public void threeAnimalsRoutine(){
        /*# YOUR CODE HERE */
        Animal dog = new Animal("dog","Gin",100,100);
        Animal bird = new Animal("bird", "Fletcher", 400,200);
        Animal snake = new Animal("snake", "Tonic", 250,200);
        this.routine(dog,bird,snake);
    }

    /** makes the animal character do a little routine*/
    public void routine(Animal dog, Animal bird, Animal snake){
    /*# YOUR CODE HERE */
        
        dog.goRight(20);

     }

    /** Make buttons to let the user run the methods */
    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Animate", this::animate );
        UI.addButton("Three", this::threeAnimalsRoutine );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(0);       // Expand the graphics area
    }

    public static void main(String[] args){
        PetShow ps = new PetShow();
        ps.setupGUI();
    }
}

