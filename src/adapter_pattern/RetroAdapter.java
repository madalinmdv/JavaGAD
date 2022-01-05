package adapter_pattern;

import adapter_pattern.filtre.Retro;

public class RetroAdapter implements Filter{

    private Retro retro;

    public RetroAdapter(Retro retro) {
        this.retro = retro;
    }

    @Override
    public void apply(Image image) {
        retro.init();
        retro.render(image);
    }
}
