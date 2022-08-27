package day3.asso;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*--------------------*/
    // HAS-A Relationship
    private MusicPlayer musicPlayer;

    public MusicPlayer getMusicPlayer() {
        return this.musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    /*---------------------*/

    private Engine engine=new Engine(1500);
    public Engine getEngine(){
        return engine;
    }

    public void displayCar(){
        System.out.println("car details");
        System.out.println("----------------------------------");
        System.out.println("Car color:"+color);
    }    
}
