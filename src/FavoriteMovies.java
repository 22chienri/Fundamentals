/*
Ryan Chien
Period 4
Fundamentals
FavoriteMovies
 */

public class FavoriteMovies {
    public static void main(String[] args) {
        // define arrays
        String[] favMovies = {"Infinity War", "Guardians of the Galaxy", "Pirates of the Caribbean"};
        String[] favSongs = {"Bohemian Rhapsody", "Mr. Blue Sky", "Come Sail Away"};

        // print movies on separate lines
        for (String i : favMovies) {
            System.out.println(i);
        }
        // spacing
        System.out.print("\n\n");

        // index integer
        int i = 0;
        // print songs on same line with commas
        while (i < favSongs.length) {
            System.out.print(favSongs[i]);
            // print comma if not the last item
            if (i < favSongs.length - 1) {
                System.out.print(", ");
            }
            // increment i by 1
            i++;
        }
    }
}
