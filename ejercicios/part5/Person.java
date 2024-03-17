public class Person {
    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String toString() {
        return this.name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }

    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }

    static class Pet {
        private String name;
        private String breed;

        public Pet(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }
    }
}
