package day3.asso;

public class MusicPlayer {
    private String brand;

    public MusicPlayer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void displayMusic(){
        System.out.println("This is the music player class");
        System.out.println("----------------------------------------");
        System.out.println("Music player brand:"+brand);
    }
}
