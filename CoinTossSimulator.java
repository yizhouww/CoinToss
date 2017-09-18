// Name:
// USC NetID:
// CS 455 PA1
// Fall 2017

/**
 * class CoinTossSimulator
 *
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 *
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants,
 * and private methods to the class.  You will also be completing the
 * implementation of the methods given.
 *
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 *
 */
import java.util.Scanner;
import java.util.Random;
public class CoinTossSimulator {
   public Random random = new Random();
   public int side = random.nextInt(2);
   public int tweTails = 0;
   public int tweheads = 0;
   public int headtail = 0;
   public int numTrials = 0;
   public int head = 0;
   public int tail = 0;

   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      numTrials = 0;
}
   public CoinTossSimulator(int enternumber){
     numTrials = enternumber;
   }
   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.

      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
     for(int i = 1; i <= numTrials; i++){
       for(int o = 1; o <= 2; o++){
         if(side == 0){
           head++; side = random.nextInt(2);
         }
         else {
           tail++; side = random.nextInt(2);
         }
       }
       if (head == 0) {
         tweTails++;
         }
       else if (head == 1){
         headtail++;
       }
       else{
         tweheads++;
       }
       head = 0; tail = 0;
     }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials;// DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return tweheads; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */
   public int getTwoTails() {
       return tweTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headtail; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
       tweTails = 0; tweheads = 0; headtail = 0;
   }

   public boolean check(){
     if(numTrials == tweheads + tweTails + headtail){
       return true;
     }
     else{
       return false;
     }
   }

}
