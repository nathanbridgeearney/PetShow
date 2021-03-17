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
        routine(dog); routine(bird); routine(snake);
    }

    /** makes the animal character do a little routine*/
    public void routine(Animal pet){
    /*# YOUR CODE HERE */
        pet.goRight(20); pet.goLeft(20); pet.jump(10); pet.shout("3"); pet.shout("2");
        pet.shout("1"); pet.jump(40);
     }
    public void challengeRoutine(){
        Animal dog = new Animal("dog","Gin",100,100);
        Animal bird = new Animal("bird", "Fletcher", 100,400);
        Animal snake = new Animal("snake", "Tonic", 400,200);
        UI.fillRect(300,200,100,100);
        introJump(dog); introJump(bird); introJump(snake); bird.down(300);dog.down(300);upLeft(snake);
        moveRightJump(dog); moveRightJump(bird); snake.down(300); dog.up(300); bird.up(300); eat(snake,bird);
        dog.goRight(150); bird.up(150); snake.goRight(300); upLeft(bird); dog.goLeft(130);
        bird.goLeft(500); giveUp(snake,bird);chase(dog,snake);giveUp(dog,snake); offScreen(dog,snake);


    }
    public void introJump(Animal pet){
        pet.introduce("");
        pet.jump(20);
    }
    public void upLeft(Animal pet){
        pet.up(125);
        pet.goLeft(300);
    }
    public void moveRightJump(Animal pet){
        pet.goRight(300);
        pet.jump(20);
    }
    public void eat(Animal pred, Animal prey){
        pred.shout("Im going");
        pred.shout("To eat you");
        prey.speak("Dog can you help?");
    }
    public void giveUp(Animal pred, Animal prey){
        pred.speak("I give up");
        prey.speak("Im leaving");

    }
    public void offScreen(Animal pred, Animal prey){
        prey.goLeft(600);
        pred.goLeft(600);
    }

    public void chase(Animal pred, Animal prey){
        for (int i = 0; i<2; i++ ){
            prey.goLeft(300);
            pred.down(500);
            prey.up(350);
            pred.goLeft(300);
            prey.goRight(300);
            pred.up(400);
            prey.down(500);
            pred.goRight(300);
        }
        pred.down(50);
    }


    /** Make buttons to let the user run the methods */
    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Animate", this::animate );
        UI.addButton("Three", this::threeAnimalsRoutine );
        UI.addButton("Challenge", this::challengeRoutine);
        UI.addButton("Quit", UI::quit );
        UI.setDivider(0);       // Expand the graphics area
    }

    public static void main(String[] args){
        PetShow ps = new PetShow();
        ps.setupGUI();
    }
}

