public class ArtistDemo {
    public static void main(String[] args) {
        Singer singer = new Singer("Chaeyoung", 25, Singer.Genre.POP);
        System.out.println("Singer's Info:");
        singer.displayInfo();
        System.out.println();
        
        Painter painter = new Painter("Claude Monet", 86, Painter.Medium.OIL);
        System.out.println("Painter's Info:");
        painter.displayInfo();
        System.out.println();
        
        Writer writer = new Writer("Andrzej Sapkowski", 76, Writer.WritingStyle.FICTION);
        System.out.println("Writer's Info:");
        writer.displayInfo();
        System.out.println();
        
        Dancer dancer = new Dancer("Momo Hirai", 28, Dancer.DanceStyle.HIPHOP);
        System.out.println("Dancer's Info:");
        dancer.displayInfo();
        System.out.println();
    }
}
