package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus implements Komento {

    private Sovelluslogiikka sovellus;
    private TextField syotekentta;
    private Button undo;
    private TextField nollaa;
    private TextField tuloskentta;

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        try {
            sovellus.miinus(Integer.parseInt(syotekentta.getText()));
        } catch (Exception e) {

        }
        syotekentta.setText("");
    }
}
