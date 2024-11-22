public class Painter extends Artist {
    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Painting");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
