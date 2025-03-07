import java.lang.ref.Cleaner;

public class CleanResource {
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    public CleanResource(Family family) {
        cleanable = cleaner.register(this, () -> System.out.println("Cleaning up resources"));
    }
    public void start() {
        //System.out.println("Starting");
    }
    public void close() {
        cleanable.clean(); // Trigger cleanup immediately
    }

}
