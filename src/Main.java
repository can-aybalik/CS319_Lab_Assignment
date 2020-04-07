import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);

        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);

        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);

        ArrayOrganizer organizer = new ArrayOrganizer();
        ArrayList<Integer> result = organizer.concatAndSort(ArrayList1, ArrayList2, ArrayList3);

        System.out.println("Result => " + result);

        System.out.println("------------------------------");

        Player tom = new Player("Tom");
        Player john = new Player("John");
        Player james = new Player("James");
        Player henry = new Player("Henry");

        Die die = new Die();
        for (int i = 0; i < 5; i++){
            tom.addScore(die.rollDie());
            john.addScore(die.rollDie());
            james.addScore(die.rollDie());
            henry.addScore(die.rollDie());
        }

        System.out.println(tom.toString() + "\n" + john.toString() + "\n" + james.toString() + "\n" + henry.toString() );

    }

}
