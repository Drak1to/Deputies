import java.util.Scanner;

public class Deputy extends Human {
    private String surname;
    private String name;
    private int age;
    private boolean briber;
    private int bribeSize;

    public Deputy(int weight, int height, String surname, String name, int age, boolean briber) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.briber = briber;
    }

    public void giveBribe() {
        if (!briber) {
            System.out.println("This deputy doesnt take bribes");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount of the bribe");
            int choose = scanner.nextInt();
            if (choose >= 5000) {
                System.out.println("Deputy has been arrested");

            } else {
                bribeSize = choose;

            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    @Override
    public String toString() {
        return "Deputy{" + "surname='" + surname + '\'' + ", name='" + name + '\'' + ", age=" + age + ", briber=" + briber + ", bribeSize=" + bribeSize + '}';
    }

}
