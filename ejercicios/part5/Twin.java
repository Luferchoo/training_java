public class Twin {
    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Twin(String name, SimpleDate birthday, int weight, int height) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Twin)) {
            return false;
        }

        Twin comparedTwin = (Twin) compared;

        return this.name.equals(comparedTwin.name) &&
               this.birthday.equals(comparedTwin.birthday) &&
               this.weight == comparedTwin.weight &&
               this.height == comparedTwin.height;
    }

    // Getters and setters (if needed)

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Twin leo = new Twin("Leo", date, 62, 9);
        Twin lily = new Twin("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Twin leoWithDifferentWeight = new Twin("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}

class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedDate = (SimpleDate) compared;

        return this.day == comparedDate.day &&
               this.month == comparedDate.month &&
               this.year == comparedDate.year;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
