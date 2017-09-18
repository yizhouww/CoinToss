import java.util.Scanner;
public class Cointester{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("After constructor:");
      System.out.print("Number of Trials [exp: 0] ");
      int numTrials = in.nextInt();
      in.nextLine();
      CoinTossSimulator cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 0] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      } cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();


      System.out.println("After run(1):");
      System.out.print("Number of Trials [exp: 1] ");
      numTrials = in.nextInt();
      in.nextLine();
      cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 1] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      }cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();

      System.out.println("After run(11):");
      System.out.print("Number of Trials [exp: 11] ");
      numTrials = in.nextInt();
      in.nextLine();
      cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 11] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      }cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();

      System.out.println("After run(100):");
      System.out.print("Number of Trials [exp: 111] ");
      numTrials = in.nextInt();
      in.nextLine();
      cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 111] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      }cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();

      System.out.println("[ . . . output for tests with different number of trials were here . . .]");
      System.out.println();

      System.err.println("After reset:");
      System.out.print("Number of Trials [exp: 0] ");
      numTrials = in.nextInt();
      in.nextLine();
      cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 0] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      }cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();

      System.out.println("After run(1000):");
      System.out.print("Number of Trials [exp: 1000] ");
      numTrials = in.nextInt();
      in.nextLine();
      cointoss1 = new CoinTossSimulator(numTrials);
      while(numTrials < 0){
        System.out.println("ERROR: Number entered must be greater than or equal to 0.");
        cointoss1.reset();
        System.out.print("Number of Trials [exp: 1000] ");
        numTrials = in.nextInt(); if(numTrials >= 0) break;
      }cointoss1.run(numTrials);
      System.out.println("Twe-head Tosses: " + cointoss1.getTwoHeads());
      System.out.println("Two-tail Tosses: " + cointoss1.getTwoTails());
      System.out.println("One-head and One-tail tosses: " + cointoss1.getHeadTails());
      cointoss1.reset();
      System.out.println();
   }
}
