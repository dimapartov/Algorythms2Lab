import java.util.Comparator;

public class MinionNameComparator implements Comparator<Minion> {

    @Override
    public int compare(Minion firstMinion, Minion secondMinion) {
        return firstMinion.getName().compareTo(secondMinion.getName());
    }
}