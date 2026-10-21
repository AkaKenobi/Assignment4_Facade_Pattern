public class HomeTheaterFacade {
    private final Amplifier amp;
    private final Projector projector;
    private final DvdPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, Projector projector, DvdPlayer dvd) {
        this.amp = amp;
        this.projector = projector;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        try {
            System.out.println("Get ready to watch a movie...");
            projector.on();
            projector.wideScreenMode();
            amp.on();
            amp.setVolume(5);
            dvd.on();
            dvd.play(movie);
        } catch (DeviceException e) {
            throw new TheaterStartupException("Theater failed to start", e);
        }
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        amp.off();
        dvd.off();
    }
}