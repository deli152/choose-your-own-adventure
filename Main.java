import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        //Welcome
        System.out.print("Welcome, weary traveler! In this game you are a sulfur atom navigating the sulfur cycle. Your journey will take you through varoius resevoirs and processes, encountering both natural and human-induced pathways.\nReady? (y/n): ");
        choice = scanner.nextLine();
        if(choice.equals("y")){
            System.out.println();
            System.out.println("Great! Let's get started!");
            
        }
        else{
            System.out.println();
            System.out.println("Too bad! Let's get started!");
        }

        System.out.println("You start your journey deep in the Earth's crust, resting in a sedimentary rock formation rich in sulfur.\nWhat do you want to do?\n(a) Stay in the rocks and await natural processes.\n(b) Be mined as part of a human extraction process.");
        choice = scanner.nextLine();
        if(choice.equals("a")){
            System.out.println();
            System.out.println("Great! Over time, weathering breaks down the rocks, and you are released into the soil.\nWhat will you do next?\n(a) Be taken up by a plant as a nutrient.\n(b) Decompose in the soil and return to sulfide form (S2-).");
            choice = scanner.nextLine();
            if(choice.equals("a")){
                System.out.println();
                System.out.println("Great! You have been absorbed by a plant. As a producer, you are now part of the food chain as well.\nWhat's your next step.\n(a) Be consumed by a herbivore (animal).\n(b) Decaying plant matter returns you to the soil");
                choice = scanner.nextLine();
                if(choice.equals("a")){
                    System.out.println();
                    System.out.println("Great! You continue up the food chain moving all the way from primary to quaternary consumer. In the end the final animal you reach dies and you are decomposed to a a sulfide (S2- atom) once again.\nWhat will you do next?\n(a) Be taken up by plants again.\n(b) Leach into groundwater and reach the ocean sediments.");
                    choice = scanner.nextLine();
                    if(choice.equals("a")){
                        System.out.println();
                        System.out.println("You have already discovered this pathway, choice b autoselected.");
                    }
                    System.out.println("You've settled into the ocean sediments, where bacteria converts you into dimethyl sulfide as a byproduct.\nYou are released into the atmosphere and then rain down as sulfiric acid rain. Joining the cycle again as sulfur in the soil. The end!");
                }
                if(choice.equals("b")){
                    System.out.println();
                    System.out.println("Great! As you decay, you return to sulfide (S2-) in the soil, enriching it for future plant growth.\nWhat will you do next?\n(a) Be taken up by plants.\n(b) Leach into groundwater and reach the ocean sediments.");
                    choice = scanner.nextLine();
                    if(choice.equals("a")){
                        System.out.println();
                        System.out.println("You have already discovered this pathway, choice b autoselected.");
                    }
                    System.out.println("You've settled into the ocean sediments, where bacteria converts you into dimethyl sulfide as a byproduct.\nYou are released into the atmosphere and then rain down as sulfiric acid rain. Joining the cycle again as sulfur in the soil. The end!");
                }
            } 
            if(choice.equals("b")){
                System.out.println();
                System.out.println("Great! As you decay, you return to sulfide (S2-) in the soil, enriching it for future plant growth.\nWhat will you do next?\n(a) Be taken up by plants.\n(b) Leach into groundwater and reach the ocean sediments.");
                choice = scanner.nextLine();
                if(choice.equals("a")){
                    System.out.println();
                    System.out.println("You have already skipped over this pathway, choice b autoselected.");
                }
                System.out.println("You've settled into the ocean sediments, where bacteria converts you into dimethyl sulfide as a byproduct.\nYou are released into the atmosphere and then rain down as sulfiric acid rain. Joining the cycle again as sulfur in the soil. The end!");
            }
        }
                
        if(choice.equals("b")){
            System.out.println();
            System.out.println("Great! You are extracted from the Earth and taken to a processing facility. Here you have several pathways (that all lead to the same thing).\nWhat's your next move?\n(a) Undergo smelting to create sulfure dioxide (SO2).\n(b) Be burned as coal, releasing sulfur dioxide (SO2) into the atmosphere.\n(c) Be refined from fossil fuels, contributing to sulfur emissions.");
            choice = scanner.nextLine();
            System.out.println();
            System.out.println("Great! You are released into the atmosphere. From here you really only have one choice:\n(a) Fall to the ground as sulfuric acid and sulfate deposited as acid rain");
            choice = scanner.nextLine();
            System.out.println("You have now joined the cycle again as sulfur in the soil. The end!");
        }
                         
    }
}
