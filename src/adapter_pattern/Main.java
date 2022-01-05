package adapter_pattern;

import adapter_pattern.filtre.Retro;

public class Main {
    public static void main(String[] args) {
        var vizualizareImagine = new ImageView(new Image());
        vizualizareImagine.apply(new BlackWhiteFilter());

        vizualizareImagine.apply(new RetroAdapter(new Retro()));
    }
}
