import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction("Burger");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            scanner.nextLine();
            switch (choose) {
                case "1": {
                    SupremeCouncil.getInstance().addFraction();
                    break;
                }
                case "2": {
                    SupremeCouncil.getInstance().removeFraction();
                    break;
                }
                case "3": {
                    SupremeCouncil.getInstance().showFractions();
                    break;
                }
                case "4": {
                    SupremeCouncil.getInstance().clearFraction();
                    break;
                }
                case "5": {
                    SupremeCouncil.getInstance().getAllDeputiesFromFraction();
                    break;
                }
                case "6": {
                    SupremeCouncil.getInstance().addDeputiesToSpecificFraction();
                    break;
                }
                case "7" : {
                    SupremeCouncil.getInstance().removeDeputiesASpecificFraction();
                    break;
                }
                case "8" : {
                    SupremeCouncil.getInstance().showBribersFromFraction();
                    break;
                }
                case "9" : {
                    SupremeCouncil.getInstance().getLargestBribersFromFraction();
                    break;
                }
                default:{
                    System.out.println("You should write a number form 1 to 9");
                    break;
                }
            }
        }


    }
    private static void menu(){
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to add a faction to the Verkhovna Rada");
        System.out.println("Enter 2 to remove a faction from the Verkhovna Rada");
        System.out.println("Enter 3 to display all factions in the Verkhovna Rada");
        System.out.println("Enter 4 to clear the entered faction");
        System.out.println("Enter 5 to show the entered faction");
        System.out.println("Enter 6 to add a deputy to the faction");
        System.out.println("Enter 7 to remove a deputy from the faction");
        System.out.println("Enter 8 to display a list of bribe takers");
        System.out.println("Enter 9 to display the biggest bribe taker");
    }

}