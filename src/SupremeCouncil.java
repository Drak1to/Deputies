import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public final class SupremeCouncil {
    private static SupremeCouncil instance;
    ArrayList<Fraction> supremeCouncilArray = new ArrayList<>();

    public static SupremeCouncil getInstance() {
        if (instance == null) {
            instance = new SupremeCouncil();
        }
        return instance;
    }

    public static void setInstance(SupremeCouncil instance) {
        SupremeCouncil.instance = instance;
    }

    public void addFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of fraction");
        String fractionName = scanner.next();
        Fraction fraction = new Fraction(fractionName);
        supremeCouncilArray.add(fraction);
        System.out.println("Fraction " + fraction.getNameOfFraction() + " has been added");


    }

    public void removeFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of fraction");
        String fractionName = scanner.next();
        if (isFractionExist(fractionName, supremeCouncilArray)) {
            Iterator<Fraction> iterator = supremeCouncilArray.iterator();
            while (iterator.hasNext()) {
                Fraction nextFraction = iterator.next();
                if (nextFraction.getNameOfFraction().equalsIgnoreCase(fractionName)) {
                    iterator.remove();
                    System.out.println(fractionName + " has been remove");
                }
            }
        } else {
            System.out.println("Fraction doesn't has been founded");
        }

    }

    public boolean isFractionExist(String nameOfFraction, List<Fraction> fractions) {
        for (Fraction f : fractions) {
            if (f.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
                return true;

            }
        }
        return false;
    }

    public void showFractions() {
        System.out.println("Fractions registered in supremeCouncil: ");
        for (Fraction f : supremeCouncilArray) {
            System.out.println(f);
        }
    }

    public ArrayList<Fraction> getSupremeCouncilArray() {
        return supremeCouncilArray;
    }


    public void showASpecificFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Fraction");
        String name = scanner.next();
        if (isFractionExist(name, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                if (f.getNameOfFraction().equalsIgnoreCase(name)) {
                    System.out.println(f.getNameOfFraction() + ": ");
                    f.getDeputies();
                }

            }
        }else{
            System.out.println("Fraction with name " + name + " has not exist");
        }
    }

    public void showBribersFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String fraction = scanner.next();
        if (isFractionExist(fraction, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                f.showBribers();
            }
        } else {
            System.out.println("Fraction with name " + fraction + " has not exist");
        }

    }

    public void getAllDeputiesFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String fraction = scanner.next();
        if (isFractionExist(fraction, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                f.showDeputies();
            }
        } else {
            System.out.println("Fraction with name " + fraction + " has not exist");
        }
    }

    public void getLargestBribersFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String fraction = scanner.next();
        if (isFractionExist(fraction, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                if(f.getNameOfFraction().equalsIgnoreCase(fraction)){
                    f.getLargestBriberTaker();
                }

            }
        } else {
            System.out.println("Fraction with name " + fraction + " has not exist");
        }

    }

    public void addDeputiesToSpecificFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String fraction = scanner.next();
        if (isFractionExist(fraction, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                if(f.getNameOfFraction().equalsIgnoreCase(fraction)){
                    f.addDeputy();
                }
            }
        } else {
            System.out.println("Fraction with name " + fraction + " has not exist");
        }

    }

    public void removeDeputiesASpecificFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String delete = scanner.next();
        if (isFractionExist(delete, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                if (f.getNameOfFraction().equalsIgnoreCase(delete)) {
                    f.deleteDeputy();
                }
            }

        } else {
            System.out.println("Fraction with name " + delete + " has not exist");

        }


    }

    public void clearFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write fraction");
        String fraction = scanner.next();
        if (isFractionExist(fraction, supremeCouncilArray)) {
            for (Fraction f : supremeCouncilArray) {
                if (f.getNameOfFraction().equalsIgnoreCase(fraction)) {
                    f.clearFraction();
                }
            }
        } else {
            System.out.println("Fraction with name " + fraction + " has not exist");
        }
    }


}
