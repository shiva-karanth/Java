public class Main{
    public static void main(String[] args){
        System.out.println("Hello guys");
        try {
        Thread.sleep(200);
        } catch(Exception e) {
            System.out.print("Ah Snap");
        }
        System.out.print("I am gym Kundar ");
         try {
        Thread.sleep(200);
        } catch(Exception e) {
            System.out.print("Ah Snap");
        }
        System.out.print("💪 ");
        for(int i=0;i<3;i++)
        {
        System.out.print("."); try {
        Thread.sleep(300);
        } catch(Exception e) {
            System.out.print("Ah Snap");
        }
        }
        System.out.print("!");
    }
}
