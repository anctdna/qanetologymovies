import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilmsTest {

    @Test
    public void shouldAddNewFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.findAll();
        String[] expected = { "film1", "film2", "film3" };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastLimitFilms() {
        FilmsManager manager = new FilmsManager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");

        String[] actual = manager.findLast();
        String[] expected = { "film6", "film5", "film4", "film3", "film2", "film1" };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilms() {
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");

        String[] actual = manager.findLast();
        String[] expected = { "film6", "film5", "film4", "film3", "film2" };

        assertArrayEquals(expected, actual);
    }
}
