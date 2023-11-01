import java.util.Comparator;

public class MinionAgeComparator implements Comparator<Minion> {

    @Override
    public int compare(Minion firstMinion, Minion secondMinion) {
        return Integer.compare(firstMinion.getAge(), secondMinion.getAge());
    }
}