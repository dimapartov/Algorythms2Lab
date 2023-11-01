import java.util.Comparator;

public class MinionEyesCountComparator implements Comparator<Minion> {

    @Override
    public int compare(Minion firstMinion, Minion secondMinion) {
        return Integer.compare(firstMinion.getEyesCount(), secondMinion.getEyesCount());
    }
}