public class Minion {

    private String name;
    private int age;
    private int eyesCount;

    public Minion(String name, int age, int eyesCount) {
        this.name = name;
        this.age = age;
        this.eyesCount = eyesCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEyesCount() {
        return eyesCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyesCount(int eyesCount) {
        this.eyesCount = eyesCount;
    }

    @Override
    public String toString() {
        return "Minion{ " +
                "name = " + name +
                ", age = " + age +
                ", eyesCount = " + eyesCount +
                '}';
    }
}