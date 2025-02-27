interface Camera {
    void clickPhoto();
}
interface Phone {
    void call();
}
interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, Phone, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }
    
    @Override
    public void call() {
        System.out.println("Play music");
    }
    
    @Override
    public void clickPhoto() {
        System.out.println("Play music");       
    }     
}


public class MultipleInheritanceEX {
    public static void main(String[] args) {
        SmartPhone s1  = new SmartPhone();

        s1.clickPhoto();
    } 
}
