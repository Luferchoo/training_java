public class HealthStation {
    private int weighingsCount;

    public HealthStation() {
        this.weighingsCount = 0;
    }

    public int weigh(Person person) {
        this.weighingsCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.weighingsCount;
    }

    public static void main(String[] args) {
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrensHospital.weigh(peter) + " kilos");

        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrensHospital.weigh(peter) + " kilos");

        System.out.println("Weighings performed: " + childrensHospital.weighings());
    }
}

class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
