import java.util.Comparator;

public class MinionCustomComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion minion1, Minion minion2) {
        int minionNameComparison = Integer.compare(minion2.getName().length(), minion1.getName().length());
        if (minionNameComparison != 0) {
            return minionNameComparison;
        }else {
            int minionAgeAndEyesComparison = Integer
                    .compare(minion1.getAge() + minion1.getEyesCount(), minion2.getAge() + minion2.getEyesCount());
            return minionAgeAndEyesComparison;
        }
    }
}