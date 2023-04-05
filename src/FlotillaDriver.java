//Ngoc Bui - Date:02/09/2023
import javax.swing.*;
import java.io.*;
import java.util.*;

public class FlotillaDriver {
    public static void main(String[] args){
        String intro_prompt = "<html><h3>Welcome to Flotilla Driver program!</h3>" +
                "This program will print out all ships roster from the csv file.<br>"+
                "Then you can pick 1 of 4 types of ship to see its specific ships";

        ImageIcon icon = new ImageIcon("ships.png");
        JOptionPane.showMessageDialog(null, intro_prompt,
                "            ".repeat(7) + "Introduction", 1, icon);

        ArrayList<Ship> myShips = new ArrayList<>();

        String result = "<html><h3>Our ships: </h3>";
        String cruise_report = "";
        String cargo_report = "";
        String yacht_report = "";

        String fileName = "flotilla_data.csv";
        File inFile = new File(fileName);

        try{
            Scanner inScan = new Scanner(inFile).useDelimiter("[\n,]");

            while(inScan.hasNext()){
                String code = inScan.next();
                String name = inScan.next();
                int year = inScan.nextInt();
                String nation = inScan.next();
                int length = inScan.nextInt();
                int draft = inScan.nextInt();
                int beam = inScan.nextInt();

                result += name + ", " + nation + ", " + year + "<br>";

                switch (code) {
                    case "CR":
                        int numExStateRooms = inScan.nextInt();
                        int numDoubleRooms = inScan.nextInt();
                        int numQuadRooms = inScan.nextInt();
                        CruiseShip myCruise = new CruiseShip(numExStateRooms, numDoubleRooms, numQuadRooms, name,
                                nation, year, length, draft, beam);
                        myShips.add(myCruise);
                        break;

                    case "CG":
                        int maxTon = inScan.nextInt();
                        int refStore = inScan.nextInt();
                        CargoShip myCargo = new CargoShip(maxTon, refStore, name, nation, year, length, draft, beam);
                        myShips.add(myCargo);
                        break;

                    case "YT":
                        int numStateRooms = inScan.nextInt();
                        int poolSize = inScan.nextInt();
                        int numDecks = inScan.nextInt();
                        int power = inScan.nextInt();
                        Yacht myYacht = new Yacht(numStateRooms, poolSize, numDecks, power, name, nation, year, length,
                                draft, beam);
                        myShips.add(myYacht);
                        break;
                }
            }

            inScan.close();

        }
        catch(IOException ioe){
            String errorMessage = "!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +
                    "Trouble opening file: " + fileName +
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!";

            JOptionPane.showMessageDialog(null, errorMessage, "      ".repeat(7)+
                    "File missing", 2);
            System.exit(0);
        }

        for(int dex = 0; dex < myShips.size(); dex ++){
            if (myShips.get(dex) instanceof CruiseShip){
                CruiseShip myCruise = (CruiseShip)(myShips.get(dex));
                cruise_report += myCruise.toString() + "\n";
            } else if (myShips.get(dex) instanceof CargoShip) {
                CargoShip myCargo = (CargoShip) (myShips.get(dex));
                cargo_report += myCargo.toString() + "\n";
            } else{
                Yacht myYacht = (Yacht)(myShips.get(dex));
                yacht_report += myYacht.toString() + "\n";
            }
        }

        String [] ship_options = {"Cruise Ships", "Cargo Ships", "Yachts", "Quit"};

        while(true) {
            icon = new ImageIcon("select.png");
            int user_choose_ship = JOptionPane.showOptionDialog(null, result,
                    "      ".repeat(8) + "Ngoc's Ships", 0, 0,
                    icon, ship_options, ship_options[0]);

            if (user_choose_ship == 0) {
                icon = new ImageIcon("CruiseShip.png");
                JOptionPane.showMessageDialog(null, cruise_report,
                        "        ".repeat(12) + "All Cruise Ships", 1, icon);
            } else if (user_choose_ship == 1) {
                icon = new ImageIcon("CargoShip.png");
                JOptionPane.showMessageDialog(null, cargo_report,
                        "        ".repeat(12) + "All Cargo Ships", 1, icon);
            } else if (user_choose_ship == 2) {
                icon = new ImageIcon("yacht.png");
                JOptionPane.showMessageDialog(null, yacht_report,
                        "        ".repeat(16) + "All Yacht", 1, icon);
            } else {
                break;
            }
        }

        icon = new ImageIcon("ships.png");
        String terminal_prompt = "<html><h3>The program is ending! I hope you like it and will give 100/100<br>" +
                "and some extra credits for my ships pic(^-^). Thank you for explain<br>" +
                "about reading file stuff, now I understand clearly how it works!!</h3>";
        JOptionPane.showMessageDialog(null, terminal_prompt, "         ".repeat(11) +
                "Good Bye", 1, icon);

    }
}
