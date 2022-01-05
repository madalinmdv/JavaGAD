package adapter_pattern;

public class BlackWhiteFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Se aplica filtrul alb-negru");
    }
}
