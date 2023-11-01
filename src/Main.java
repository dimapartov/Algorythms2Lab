import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws Exception {

        Minion minion1 = new Minion("Dima", 12, 1);
        Minion minion2 = new Minion("Art", 13, 2);
        Minion minion3 = new Minion("Gena", 15, 2);
        Minion minion4 = new Minion("Lo", 22, 1);
        Minion minion5 = new Minion("Anabolik", 35, 2);
        Minion minion6 = new Minion("Dimon", 64, 1);
        Minion minion7 = new Minion("Zheeenya", 234, 4);
        Minion minion8 = new Minion("Bartur", 33, 2);
        Minion minion9 = new Minion("Jerry", 11, 2);
        Minion minion10 = new Minion("Pedro", 256, 1);
        Minion minion11 = new Minion("Gog", 867, 2);
        Minion minion12 = new Minion("Nemo", 844, 6);

////  Stack
//
//        Stack<Minion> myStack = new Stack<>();
//
////      Push
//        myStack.push(minion1);
//        myStack.push(minion2);
//        myStack.push(minion3);
//        myStack.push(minion4);
//        myStack.push(minion5);
//
////      Print all minions from stack
//        for (Minion minion : myStack) {
//            System.out.println(minion);
//        }
//////      2) using SOUT(myStack), which will use myStack.toString()
////        System.out.println(myStack);
//        System.out.println("Peek:");
//
////      Peek
//        System.out.println(myStack.peek());
//        System.out.println("Pop:");
//
////      Pop
//        System.out.println(myStack.pop());
//        System.out.println("After pop:");
//        System.out.println(myStack);

//  Iterator and indexer

        DoubleLinkedList<Minion> minionDoubleLinkedList = new DoubleLinkedList<>();

        minionDoubleLinkedList.addFirst(minion1);
        minionDoubleLinkedList.addLast(minion2);
        minionDoubleLinkedList.addLast(minion3);
        minionDoubleLinkedList.addLast(minion4);
        minionDoubleLinkedList.addLast(minion5);
        minionDoubleLinkedList.addLast(minion6);
        minionDoubleLinkedList.addLast(minion7);
        minionDoubleLinkedList.addLast(minion8);
        minionDoubleLinkedList.addLast(minion9);
        minionDoubleLinkedList.addLast(minion10);
        minionDoubleLinkedList.addLast(minion11);
        minionDoubleLinkedList.addLast(minion12);

////      Iterator
//        Iterator<Minion> doubleLinkedListIterator = minionDoubleLinkedList.iterator();
//        while (doubleLinkedListIterator.hasNext()){
//            Minion minion = doubleLinkedListIterator.next();
//            System.out.println(minion);
//        }
//
////      Indexer
//        System.out.println(minionDoubleLinkedList.indexer(0));
//

//  Comparator

        MinionAgeComparator minionAgeComparator = new MinionAgeComparator();
        MinionEyesCountComparator minionEyesCountComparator = new MinionEyesCountComparator();
        MinionNameComparator minionNameComparator = new MinionNameComparator();
        MinionCustomComparator minionCustomComparator = new MinionCustomComparator();

        minionDoubleLinkedList.getAll();

//        minionDoubleLinkedList.sortByComparison(minionAgeComparator);
//        minionDoubleLinkedList.getAll();
//
//        minionDoubleLinkedList.sortByComparison(minionEyesCountComparator);
//        minionDoubleLinkedList.getAll();
//
//        minionDoubleLinkedList.sortByComparison(minionNameComparator);
//        minionDoubleLinkedList.getAll();

        minionDoubleLinkedList.sortByComparison(minionCustomComparator);
        minionDoubleLinkedList.getAll();
    }
}