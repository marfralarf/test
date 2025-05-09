import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    static Card[] guys = new Card[3];
    public static void main(String[] args) {
        guys[0] = new Card("Alice Abernacky", new ImageIcon("C:/Users/mkafr/IdeaProjects/test/src/AliceAbernacky.png"));
        guys[1] = new Card("Voltaire", new ImageIcon("C:/Users/mkafr/IdeaProjects/test/src/Voltaire.png"));
        guys[2] = new Card("MuscleGuy", new ImageIcon("C:/Users/mkafr/IdeaProjects/test/src/MuscleGuy.png"));

        Card r = guys[(int) (guys.length * Math.random())];
        Layout.display(r);
        }
        public static Card[] getGuys(){
        return guys;
    }
}

