import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
    @author Jay Le-Moigne, Student at Bournemouth University.
    Created and finalised 6th October 2024.
    This method reads in from several texts files throughout multiple methods, using a Random obj it selects a random one, then formats and prints in a desired format.

 */
public class PotionMaker {

    public int generatePotionAmount() {
        Scanner keyboard = new Scanner(System.in);
        String potionAmount;

        System.out.println("Enter how many potions you want to generate: ");
        potionAmount = keyboard.next();

        return Integer.parseInt(potionAmount);
    }

    public String writeOrPrint() {
        Scanner keyboard = new Scanner(System.in);
        String outcome;

        System.out.println("Do you want the potion(s) to be printed, or written into a file? \n" + "Please enter 'write' or 'print':");
        outcome = keyboard.next();
        keyboard.close();

        return outcome;
    }

    public String getTitle() throws IOException {

        File filename = new File("titles.txt");
        Scanner titleScan = new Scanner(filename);
        ArrayList<String> titles = new ArrayList<>();

        while (titleScan.hasNextLine()) {

            titles.add(titleScan.nextLine());

        }
        titleScan.close();

        Random randTitle = new Random();

        return titles.get(randTitle.nextInt(titles.size()));
    }

    public String getEffect() throws IOException {

        File filename = new File("effects.txt");
        Scanner effectScan = new Scanner(filename);
        ArrayList<String> effects = new ArrayList<>();

        while (effectScan.hasNextLine()) {

            effects.add(effectScan.nextLine());

        }
        effectScan.close();

        Random randEffect = new Random();

        return effects.get(randEffect.nextInt(effects.size()));
    }

    public String getStrength() throws IOException {

        File filename = new File("strength.txt");
        Scanner strengthScan = new Scanner(filename);
        ArrayList<String> strengths = new ArrayList<>();

        while (strengthScan.hasNextLine()) {

            strengths.add(strengthScan.nextLine());

        }
        strengthScan.close();

        Random randStrength = new Random();

        return strengths.get(randStrength.nextInt(strengths.size()));
    }

    public String getSideEffect() throws IOException {

        File filename = new File("sideeffect.txt");
        Scanner sideEffectScan = new Scanner(filename);
        ArrayList<String> sideEffects = new ArrayList<>();

        while (sideEffectScan.hasNextLine()) {

            sideEffects.add(sideEffectScan.nextLine());

        }
        sideEffectScan.close();

        Random randSideEffect = new Random();

        return sideEffects.get(randSideEffect.nextInt(sideEffects.size()));
    }


    public String getContainer() throws IOException {

        File filename = new File("containers.txt");
        Scanner containerScan = new Scanner(filename);
        ArrayList<String> containers = new ArrayList<>();

        while (containerScan.hasNextLine()) {

            containers.add(containerScan.nextLine());

        }
        containerScan.close();

        Random randContainer = new Random();

        return containers.get(randContainer.nextInt(containers.size()));
    }


    public String getColour() throws IOException {

        File filename = new File("colour.txt");
        Scanner colourScan = new Scanner(filename);
        ArrayList<String> colours = new ArrayList<>();

        while (colourScan.hasNextLine()) {

            colours.add(colourScan.nextLine());

        }
        colourScan.close();

        Random randColour = new Random();

        return colours.get(randColour.nextInt(colours.size()));
    }

    public String getAppearance() throws IOException {

        File filename = new File("appearance.txt");
        Scanner appearanceScan = new Scanner(filename);
        ArrayList<String> appearances = new ArrayList<>();

        while (appearanceScan.hasNextLine()) {

            appearances.add(appearanceScan.nextLine());

        }
        appearanceScan.close();

        Random randAppearance = new Random();

        return appearances.get(randAppearance.nextInt(appearances.size()));
    }

    public String getTexture() throws IOException {

        File filename = new File("texture.txt");
        Scanner textureScan = new Scanner(filename);
        ArrayList<String> textures = new ArrayList<>();

        while (textureScan.hasNextLine()) {

            textures.add(textureScan.nextLine());

        }
        textureScan.close();

        Random randTexture = new Random();

        return textures.get(randTexture.nextInt(textures.size()));
    }

    public String getTaste() throws IOException {

        File filename = new File("taste.txt");
        Scanner tasteScan = new Scanner(filename);
        ArrayList<String> tastes = new ArrayList<>();

        while (tasteScan.hasNextLine()) {

            tastes.add(tasteScan.nextLine());

        }
        tasteScan.close();

        Random randTaste = new Random();

        return tastes.get(randTaste.nextInt(tastes.size()));
    }

    public String getLabel() throws IOException {

        File filename = new File("labels.txt");
        Scanner labelScan = new Scanner(filename);
        ArrayList<String> labels = new ArrayList<>();

        while (labelScan.hasNextLine()) {

            labels.add(labelScan.nextLine());

        }
        labelScan.close();

        Random randLabel = new Random();

        return labels.get(randLabel.nextInt(labels.size()));
    }

    public String getDuration() throws IOException {

        File filename = new File("duration.txt");
        Scanner durationScan = new Scanner(filename);
        ArrayList<String> durations = new ArrayList<>();

        while (durationScan.hasNextLine()) {

            durations.add(durationScan.nextLine());

        }
        durationScan.close();

        Random randDuration = new Random();

        return durations.get(randDuration.nextInt(durations.size()));
    }

    public String getCurability() throws IOException {

        File filename = new File("curability.txt");
        Scanner cureScan = new Scanner(filename);
        ArrayList<String> curability = new ArrayList<>();

        while (cureScan.hasNextLine()) {

            curability.add(cureScan.nextLine());

        }
        cureScan.close();

        Random randCurability = new Random();

        return curability.get(randCurability.nextInt(curability.size()));
    }

}