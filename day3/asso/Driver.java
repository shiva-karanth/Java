package day3.asso;

public class Driver {
    public static void main(String[] args) {
        Car c=new Car("red");
        c.displayCar();
        c.setMusicPlayer(new MusicPlayer("Sony"));
        System.out.println("----------------------------");
        c.getMusicPlayer().displayMusic();
    }
}
