import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Scholarly extends HumanConstruct {
    public Scholarly(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public int askQuestion() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                System.out.println("");
                return 0;
            case 1:
                System.out.println("dd");
                return 1;
            case 2:
                System.out.println("ddd");
                return 2;
        }

        return 0;
    }
}
