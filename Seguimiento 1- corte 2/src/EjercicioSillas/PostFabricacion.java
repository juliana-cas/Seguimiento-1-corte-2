package EjercicioSillas;

public class PostFabricacion extends Fabricacion {

    @Override
    public void sitOn() {
        super.sitOn();
        System.out.println("Se puede sentar");
    }

    @Override
    public void hasLegs() {
        super.hasLegs();
        System.out.println("Tiene patas");
    }

    @Override
    public void color() {
        super.color();
        System.out.println("Color naranja");
    }
}