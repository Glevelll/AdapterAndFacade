package Facade;

public class CarFacade {
    Lights lights;
    Music music;
    Conditioner conditioner;
    Windows windows;
    Eco eco;
    public CarFacade(Lights lights, Music music, Conditioner conditioner, Windows windows, Eco eco) {
        this.lights = lights;
        this.music = music;
        this.conditioner = conditioner;
        this.windows = windows;
        this.eco = eco;
    }
    public void getInTheCar() {
        System.out.println("Всё готово к поездке");
        lights.OnOffNear(1);
        music.on();
        music.setVolume(20);
        windows.OnOffLeftFront(1);
        windows.OnOffRightFront(1);
        conditioner.on();
        conditioner.setTemperature(20);
        eco.on();
    }
    public void getOutOfTheCar() {
        System.out.println("Все выключено, можно выходить из машины");
        lights.OnOffNear(0);
        music.off();
        windows.OnOffRightFront(0);
        windows.OnOffLeftFront(0);
        conditioner.off();
        eco.off();
    }
}
