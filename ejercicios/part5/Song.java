public class Song {
    private String artist;
    private String title;
    private int year;

    public Song(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    // Getters y Setters

    @Override
    public boolean equals(Object obj) {
        // Comprobamos si los objetos son idénticos
        if (this == obj) {
            return true;
        }

        // Comprobamos si el objeto es nulo o de diferente tipo
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Convertimos el objeto a tipo Song
        Song other = (Song) obj;

        // Comparamos las variables de estado de los objetos
        return year == other.year &&
                artist.equals(other.artist) &&
                title.equals(other.title);
    }

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
