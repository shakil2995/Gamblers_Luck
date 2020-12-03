import java.util.Random;
import java.util.Scanner;
public class GameCore {
    public void score(int z,double token){
        double percentile=(token/z)*100;
        System.out.println("         *****Guess accuracy "+percentile+"%*****\n");
        if (percentile==100.0)
            alien();
    }
    public void engineMain(int limit,int token){
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int z=token;
        System.out.println("       You Get "+token+" tries");
        while(token!=0) {
           System.out.print("       Guess any number between (1-"+limit+") : ");
           int x=scan.nextInt();
           int random=1+rand.nextInt(limit);
          // System.out.println("Lucky number is "+random);
           if (x==random){
               System.out.println("                 ************************************\n" +
                       "            ************You Have Just Hit THE JACKPOT***********\n" +
                       "                 ************************************\n");
               score(z,token);
               break;
           }
           else {
               System.out.println("     Missed ! The lucky number was "+random);
           }
            token--;
           if (token==0){
               System.out.println("     Out of chances");
               score(z,token);
           }
       }
    }
    public void level(int level){
        switch (level){
            case 1:
                //System.out.println("        case 1");
                engineMain(10,3);
                break;
            case 2:
                engineMain(15,5);

                //System.out.println("        case 2");
                break;
            case 3:
                engineMain(25,8);

               // System.out.println("        case 3");
                break;
        }
    }
   public void alien(){
       System.out.println("     Hidden level ***GAMBLER'S DOOM*** unlocked !!!  \n     Do you want too play ? (y/n)");
       boolean x=getInput();
       if (x) engineMain(100, 10);
    }
    public boolean getInput(){
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
        return s.equals("y") || s.equals("Y");
    }
}
