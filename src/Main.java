public class Main {
    public static void main(String[] args) {
        //Initialize subsystems
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        DvdPlayer dvd = new DvdPlayer();

        //Create the Facade and pass control of the devices to it
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, dvd);

        // Now we don't need to call each device separately in Main.
        homeTheater.watchMovie("Interstellar");

        homeTheater.endMovie();
    }
}