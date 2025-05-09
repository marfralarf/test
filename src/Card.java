import javax.swing.*;

public class Card {
    String name;
    ImageIcon image;

    public Card(){}
    public Card(String initName, ImageIcon initImage){
        name = initName;
        image = initImage;
    }

    public static void main(String[] args) {
        // A JFrame is a window where we can design our UI
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setImage(ImageIcon newImage){
        this.image = newImage;
    }
}
