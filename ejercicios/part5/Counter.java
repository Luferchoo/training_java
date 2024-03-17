public class Counter {
    private int value;

    // Constructor with parameter to set start value
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Default constructor sets start value to 0
    public Counter() {
        this.value = 0;
    }

    // Method to return current value of the counter
    public int value() {
        return value;
    }

    // Method to increase value by 1
    public void increase() {
        value++;
    }

    // Method to decrease value by 1
    public void decrease() {
        value--;
    }

    // Method to increase value by a specified amount
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Method to decrease value by a specified amount
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    // Main method to demonstrate usage of the Counter class
    public static void main(String[] args) {
        // Creating counter objects using different constructors
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();

        // Printing initial values
        System.out.println("Counter 1 value: " + counter1.value());
        System.out.println("Counter 2 value: " + counter2.value());

        // Increasing and decreasing counter values
        counter1.increase();
        counter2.decrease();

        // Printing updated values
        System.out.println("Counter 1 value after increase: " + counter1.value());
        System.out.println("Counter 2 value after decrease: " + counter2.value());

        // Using increase and decrease methods with parameters
        counter1.increase(3);
        counter2.decrease(2);

        // Printing values after using parameterized methods
        System.out.println("Counter 1 value after increasing by 3: " + counter1.value());
        System.out.println("Counter 2 value after decreasing by 2: " + counter2.value());
    }
}
