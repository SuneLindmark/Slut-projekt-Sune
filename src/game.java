import javax.swing.*; import java.util.*;

public class game {
    public static void main(String[] args) {
        choices choices = new choices();

        Random rand = new Random();
        int codeLock = rand.nextInt(9999) + 1;

        String namn = JOptionPane.showInputDialog(null, "What is your name?");

        JOptionPane.showMessageDialog(null, namn + " enters the big spooky cave");

        JOptionPane.showMessageDialog(null, "Before you left the Inn you rested in, an old man shouted THE CODE TO THE DOOR IS" + " " + codeLock);
        JOptionPane.showMessageDialog(null, "The cave is big and dark, very spooky");
        JOptionPane.showMessageDialog(null, "You come up to a big door that has some weird numbers engraved into some keypad");
        JOptionPane.showMessageDialog(null, "The door has a note attached to it that reads...");

        String code = JOptionPane.showInputDialog(null, "What is the code?");
        int codeResult = Integer.parseInt(code);

        if (codeResult == codeLock) {
            JOptionPane.showMessageDialog(null, "The Big door opens");
        } else {
            JOptionPane.showMessageDialog(null, "You hear a loud bell chime when you enter the code, Then from no where an arrow strikes you in the back and kills you instatly");
            System.out.println("You Died");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "This cave sure is spooky");
        Object jOptionPane = JOptionPane.showInputDialog(null, "A big scary man appears", "What do you do?", JOptionPane.WARNING_MESSAGE, null, choices.getOptionsArray(), choices.getOptionsArray()[0]);
        if (jOptionPane.equals("Fight the old man!")) {
            JOptionPane.showMessageDialog(null, "You stab the old and dusty man and he dies");

        } else if (jOptionPane.equals("Run away!")) {
            JOptionPane.showMessageDialog(null, "The big scary man throws a rock at you and you die");
            System.out.println("You Died");
            System.exit(0);

        } else {
            JOptionPane.showMessageDialog(null, "You lay down and accept death.");
            System.out.println("You Died");
            System.exit(0);

        }
        int Loot = JOptionPane.showConfirmDialog(null, "Do you want to loot the dead man?", "LOOT?", JOptionPane.YES_NO_OPTION);

        if (Loot == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You find a weird canister on the man");
            JOptionPane.showMessageDialog(null, "The Canister proceeds to explode in your face and you die");
            System.out.println("You Died");
            System.exit(0);

        }
        if (Loot == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You leave the old mans corpse alone and walk deeper in the cave");
        }
        JOptionPane.showMessageDialog(null, "Deeper into the cave you stumble upon a small pond");

        int pond = JOptionPane.showConfirmDialog(null, "Do you want to walk up to the small pond?", "POND?", JOptionPane.YES_NO_OPTION);

        if (pond == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You walk away from the pond.");
            JOptionPane.showMessageDialog(null, "But suddenly you feel a sharp pain in you shoulder");
            JOptionPane.showMessageDialog(null, "You fall to the ground and die from a large wooden spear...");
            System.out.println("You Died");
            System.exit(0);
        }
        if (pond == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You walk up to the pond and start looking down into it");
            JOptionPane.showMessageDialog(null, "As you peer down into the pond a massive fish man jumps out of the lake!");
            Object jOptionPane2 = JOptionPane.showInputDialog(null, "The Burly Fish Man lunges towards you", "What do you do?", JOptionPane.WARNING_MESSAGE, null, choices.getOptionsArray2(), choices.getOptionsArray2()[0]);
            if (jOptionPane2.equals("Run away!")) {
                JOptionPane.showMessageDialog(null, "You run away from the fish man, Luckily the fish man has fin legs wich makes him slow as shit");
            } else if (jOptionPane2.equals("Fight the spooky fish")) {
                JOptionPane.showMessageDialog(null, "The fish man stabs you in the gut with his spear and you die");
                System.out.println("You Died");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "You Throw a rock at the large fish man to no avail, He in return lobs his spear into your chest and you die.");
                System.out.println("You Died");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "While running away from the burly fish man you stumble upon a large gate at the end of the tunnel");
        JOptionPane.showMessageDialog(null, "As you walk up towards the large gate it starts to speak to you");
        String gate = JOptionPane.showInputDialog(null, "WHOM STANDS BEFORE ME?");
        if (gate.equals(namn)) {
            JOptionPane.showMessageDialog(null, "SO YOU SPEAK THE TRUTH? WELL ANSWER ME THIS");
        } else {
            JOptionPane.showMessageDialog(null, "SO YOU DARE LIE TO ME? I SHALL SMITE THEE TO THE GROUND");
            JOptionPane.showMessageDialog(null, "A large lightning bolt flies out of the gate and smites you into ashes");
            System.out.println("You Died");
            System.exit(0);
        }
        Object jOptionPane3 = JOptionPane.showInputDialog(null, "WHOM SENT YOU HERE?", "Who Sent You?", JOptionPane.QUESTION_MESSAGE, null, choices.getOptionsArray3(), choices.getOptionsArray3()[0]);
        if (jOptionPane3.equals("I Found This Place Myself")) {
            JOptionPane.showMessageDialog(null, "FOR THY HONESTY YOU SHALL PASS THROUGH THE GATES");
        } else {
            JOptionPane.showMessageDialog(null, "SO YOU DARE LIE TO ME? I SHALL SMITE THEE TO THE GROUND");
            JOptionPane.showMessageDialog(null, "A large lightning bolt flies out of the gate and smites you into ashes");
            System.out.println("You Died");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "The massive gates slowly opens..");
        JOptionPane.showMessageDialog(null, "Once the gates have finally opened you see a fork in the road");
        Object jOptionPane4 = JOptionPane.showInputDialog(null, "The right path leads to a small mineshaft, The left path leads to a large open space.", "Which path do you take?", JOptionPane.QUESTION_MESSAGE, null, choices.getOptionsArray4(), choices.getOptionsArray4()[0]);
        if (jOptionPane4.equals("UNFINISHED I take the right path")) {
            JOptionPane.showMessageDialog(null, namn + " walks toward the old mineshaft...");
            JOptionPane.showMessageDialog(null, "You reach the old mineshaft wich seems abandoned since long ago..");

        } else {
            JOptionPane.showMessageDialog(null, namn + " walks toward the large open space...");
            JOptionPane.showMessageDialog(null, "The large open space is ieriely empty...");
            JOptionPane.showMessageDialog(null, "But out of nowhere an arrow comes flying past you");
            Object jOptionPane5 = JOptionPane.showInputDialog(null, "You hear several more arrows come flying toward you!", "What do you do?", JOptionPane.WARNING_MESSAGE, null, choices.getOptionsArray5(), choices.getOptionsArray5()[0]);
            if (jOptionPane5.equals("Pretend to die")) {
                JOptionPane.showMessageDialog(null, "You pretend to get hit by an arrow and fall to the ground");
                JOptionPane.showMessageDialog(null, "As you lay on the ground pretending to be dead you start hearing footsteps..");
                JOptionPane.showMessageDialog(null, "");
            } else if (jOptionPane5.equals("Run from the arrow volley!")) {
                JOptionPane.showMessageDialog(null, "You turn around and start running from the volley of arrows!");
                JOptionPane.showMessageDialog(null, "But as you run trough the large open nothingness you feel a sharp pain in your back");
                JOptionPane.showMessageDialog(null, "You fall to the ground just as you get to the end of the room, then everything goes dark");
                System.out.println("You Died");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "You charge toward the archers in the dark room");
                JOptionPane.showMessageDialog(null, "But you take an arrow right in the forehead and you fall to the ground");
                System.out.println("You Died");
                System.exit(0);
            }
        }


    }
}