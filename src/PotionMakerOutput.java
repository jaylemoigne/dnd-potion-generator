import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PotionMakerOutput {

    public static void main(String[] args) throws IOException {
        PotionMaker potionMaker = new PotionMaker();

        int potionAmount = potionMaker.generatePotionAmount();

        Scanner keyboard = new Scanner(System.in);

        if (potionAmount > 50) {
            System.out.println("Enter a number lower than 50!");
        } else {
            String userChoice = potionMaker.writeOrPrint();
            if (userChoice.equals("write")) {
                for (int i = 0; i < potionAmount; i++) {
                    PrintWriter potionWriter = new PrintWriter("C:\\Users\\jayle\\Documents\\Java Projects\\D&D Potion Maker\\DnD Potion Maker\\PotionsList\\Potion #" + i);
                    potionWriter.print("Random Potion: \n" + "---------------\n" +
                            "Title: " + potionMaker.getTitle() + "\n" +
                            "Effect: " + potionMaker.getEffect() + "\n" +
                            "Strength: " + potionMaker.getStrength() + "\n" +
                            "Side Effect: " + potionMaker.getSideEffect() + "\n" +
                            "Container: " + potionMaker.getContainer() + "\n" +
                            "Colour: " + potionMaker.getColour() + "\n" +
                            "Appearance: " + potionMaker.getAppearance() + "\n" +
                            "Texture: " + potionMaker.getTexture() + "\n" +
                            "Taste: " + potionMaker.getTaste() + "\n" +
                            "Label: " + potionMaker.getLabel() + "\n" +
                            "Duration: " + potionMaker.getDuration() + "\n" +
                            "Curability (if applicable): " + potionMaker.getCurability() + "\n" + "---------------\n");
                    potionWriter.close();
                }
            }

            else if (userChoice.equals("print")) {
                for (int i = 0; i < potionAmount; i++) {
                    System.out.println("Random Potion: \n" + "---------------\n" +
                            "Title: " + potionMaker.getTitle() + "\n" +
                            "Effect: " + potionMaker.getEffect() + "\n" +
                            "Strength: " + potionMaker.getStrength() + "\n" +
                            "Side Effect: " + potionMaker.getSideEffect() + "\n" +
                            "Container: " + potionMaker.getContainer() + "\n" +
                            "Colour: " + potionMaker.getColour() + "\n" +
                            "Appearance: " + potionMaker.getAppearance() + "\n" +
                            "Texture: " + potionMaker.getTexture() + "\n" +
                            "Taste: " + potionMaker.getTaste() + "\n" +
                            "Label: " + potionMaker.getLabel() + "\n" +
                            "Duration: " + potionMaker.getDuration() + "\n" +
                            "Curability (if applicable): " + potionMaker.getCurability() + "\n" + "---------------\n");
                }
            }
        }
        keyboard.close();
    }
}
