package CompositionChallenge;

public class MainRoomChallenge {

    public static void main(String[] args) {


        Walls tallWalls = new Walls(4, 240, 5);
        Windows appleWindows = new Windows(3, true);
        Door lastDeence = new Door(195, 90);
        Furniture bed = new Furniture("bed", 5);
        Furniture dresser = new Furniture("dresser", 10);
        Furniture coffeTable = new Furniture("coffeTable", 3);
        Lights ledLights = new Lights(4, 75);

        Room bedroom = new Room(tallWalls, appleWindows, lastDeence, ledLights, bed,dresser,coffeTable);

        bedroom.freshenUpRoom(true);
        bedroom.freshenUpRoom(false);
        bedroom.getRoomWindows().openOrClose();
        bedroom.getLights().lightSwitch();


    }
}
