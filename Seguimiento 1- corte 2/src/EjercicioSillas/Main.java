package EjercicioSillas;

public class Main {
    public static void main(String[] args) {

        PostFabricacion pF = new PostFabricacion();

        System.out.println("silla: ");
        pF.hasLegs();
        pF.sitOn();
        System.out.println("==================");
        System.out.println("Sofá: ");
        pF.numCojines();
        System.out.println("==================");
        System.out.println("Mesa: ");
        pF.color();
        pF.tamañoTabla();


    }
}