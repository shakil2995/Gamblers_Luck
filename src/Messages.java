import java.util.Scanner;
public class Messages extends GameCore{
    //**********************IO*************************
    public boolean getInput(){
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
        return s.equals("y") || s.equals("Y");
    }
    //***************************Message********************
    public void welcomeMessage() {
        System.out.println("\n\n             ********************************");
        System.out.println("        ********** WELCOME TO LUCK STRIKE *********");
        System.out.println("             ********************************\n\n");
        callHelp();
    }
    public void instruction(){
        System.out.println("\n      Instruction:");
        System.out.println("        1.keep inputting numbers until You hit THE JACKPOT.");
        System.out.println("        2.In Easy mode there is a 12% chance to hit a JACKPOT");
        System.out.println("        3.In Normal mode there is a 6% chance to hit a JACKPOT");
        System.out.println("        4.In Hard mode there is a 0.9% chance to hit a JACKPOT");
    }
    public void selectLevel(){
        System.out.print("      Select a level from 1 , 2 or 3 :");
        Scanner input=new Scanner(System.in);
        System.out.println(" ");
        int x=input.nextInt();
     if(x>=1&&x<=3) {

         level(x);
         endNote();}
     else{
         System.out.println("       Wrong  level. Choose again: ");
         selectLevel();
         }
    }
    public void endNote(){

        System.out.print("\n        Do you want to play again ? (y/n)");
        boolean x=getInput();
        if (x){
            selectLevel();
        }
    }
    public void callHelp(){
            System.out.print("      Do you want to read the manual ? (y/n) : ");
            boolean inputCheck = getInput();
            if (inputCheck) instruction();
          //  else System.out.println("False");
        selectLevel();

    }
}
