package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private TextField syotekentta;
    private Button undo;
    private TextField nollaa;
    private TextField tuloskentta;

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        try {
            //sovellus.plus(Integer.parseInt(syotekentta.getText()));
            syotekentta.setText("");
            tuloskentta.setText(Integer.parseInt(tuloskentta.getText())+Integer.parseInt(syotekentta.getText())+"");
        } catch (Exception e) {

        }

    }
}
