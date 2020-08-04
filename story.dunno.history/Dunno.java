/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Dunno extends HumanConstruct implements Creature {

    private Planet planet;

    public Dunno(String name, String lastname, Planet planet) {
        super(name, lastname);
        this.planet = planet;
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

    @Override
    public Planet getPlanet() {
        return null;
    }

    @Override
    public void setPlanet(Planet planet) {

    }

    void getQuestions(HumanConstruct humanConstruct, int question_number) {
        System.out.printf(" Question from %s %s \n", humanConstruct.getName(), humanConstruct.getName());
        System.out.printf(" Answer from %s %s \n", humanConstruct.getName(), humanConstruct.getName());
        if(humanConstruct instanceof Journalist) {
            switch (question_number) {
                case 0:
                    System.out.println("");
                case 1:
                    System.out.println("dd");
                case 2:
                    System.out.println("ddd");
            }
        } else {
            switch (question_number) {
                case 0:
                    System.out.println("");
                case 1:
                    System.out.println("dd");
                case 2:
                    System.out.println("ddd");
            }
        }
    }

    void talkAboutRocket() {

    }
}
