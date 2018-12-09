package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovellus;
    private TextField syotekentta;
    private Button undo;
    private TextField nollaa;
    private TextField tuloskentta;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        try {
            sovellus.nollaa();
        } catch (Exception e) {

        }
        syotekentta.setText("");
    }
}
