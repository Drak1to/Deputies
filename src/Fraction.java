import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
    List<Deputy> deputies = new ArrayList<>();
    private String nameOfFraction;

    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public Fraction(List<Deputy> deputies, String nameOfFraction) {
        this.deputies = deputies;
        this.nameOfFraction = nameOfFraction;
    }

    public String getNameOfFraction() {
        return nameOfFraction;
    }

    public void setNameOfFraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    @Override
    public String toString() {
        return "Fraction{" + "nameOfFraction='" + nameOfFraction + '\'' + '}';
    }

    public void addDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write surname of Deputy");
        String surname = scanner.nextLine();
        System.out.println("Write name of Deputy");
        String name = scanner.nextLine();
        System.out.println("Write age of Deputy");
        int age = scanner.nextInt();
        System.out.println("Write weight of Deputy");
        int weight = scanner.nextInt();
        System.out.println("Write height of Deputy");
        int height = scanner.nextInt();
        System.out.println("Write is Deputy briber");
        boolean briber = scanner.nextBoolean();
        Deputy deputy = new Deputy(weight, height, surname, name, age, briber);
        if (deputy.isBriber()) {
            deputy.giveBribe();
        }
        deputies.add(deputy);
        System.out.println("Deputy " + deputy.toString() + " has been added !");
    }

    public void showDeputies() {
        for (Deputy d : deputies) {
            System.out.println(d);

        }
    }

    public void showBribers() {
        for (Deputy b : deputies) {
            if (b.isBriber()) {
                System.out.println(b);
            }
        }


    }
    public void getLargestBriberTaker() {
        Deputy largestBribeTaker = null;
        int max = 0;
        for (Deputy d: deputies) {
            if(d.isBriber() && d.getBribeSize() > max){
                largestBribeTaker = d;
                max = d.getBribeSize();

            }

        }
        if(largestBribeTaker != null){
            System.out.println("The largest bribe taker is " + largestBribeTaker);
        }else {
            System.out.println("In this fraction doesnt founded briber");
        }

    }

    public void deleteDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.next();
        System.out.println("Write surname");
        String surname = scanner.next();
        if (isDeputyExist(name, surname, deputies)) {
            Iterator<Deputy> iterator = deputies.iterator();
            while (iterator.hasNext()) {
                Deputy nextDeputy = iterator.next();
                if(nextDeputy.getName().equalsIgnoreCase(name) && nextDeputy.getSurname().equalsIgnoreCase(surname) ){
                    iterator.remove();
                    System.out.println("Deputy" + name + surname + " has been deleted");
                }
            }
        }


    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    public boolean isDeputyExist(String name, String surname, List<Deputy> deputies) {
        for (Deputy d : deputies) {
            if (d.getName().equalsIgnoreCase(name) && d.getSurname().equalsIgnoreCase(surname)) {
                return true;

            }
        }
        return false;
    }
    public void clearFraction(){
        deputies.clear();
        System.out.println("All deputies has been deleted from fraction");
    }

}
