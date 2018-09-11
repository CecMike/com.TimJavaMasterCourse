package CompositionChallenge;

public class Room {


    private Walls roomWalls;
    private Windows roomWindows;
    private Door roomDoor;
    private Lights lights;
    private Furniture bed;
    private Furniture dresser;
    private Furniture table;

    public Room(Walls roomWalls, Windows roomWindows, Door roomDoor, Lights lights, Furniture bed, Furniture dresser, Furniture table) {
        this.roomWalls = roomWalls;
        this.roomWindows = roomWindows;
        this.roomDoor = roomDoor;
        this.lights = lights;
        this.bed = bed;
        this.dresser = dresser;
        this.table = table;
    }

    public void freshenUpRoom(boolean fresh) {
        roomWindows.setOpened(fresh);
        roomDoor.setOpened((fresh));

        if (fresh) {
            System.out.println("There is a breeze as the door and windows are opened");
        } else {
            System.out.println("It is fresh enough and it is to chilly so you close the door and windows");
        }
    }

    public Walls getRoomWalls() {
        return roomWalls;
    }

    public void setRoomWalls(Walls roomWalls) {
        this.roomWalls = roomWalls;
    }

    public Windows getRoomWindows() {
        return roomWindows;
    }

    public void setRoomWindows(Windows roomWindows) {
        this.roomWindows = roomWindows;
    }

    public Door getRoomDoor() {
        return roomDoor;
    }

    public void setRoomDoor(Door roomDoor) {
        this.roomDoor = roomDoor;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public Furniture getBed() {
        return bed;
    }

    public void setBed(Furniture bed) {
        this.bed = bed;
    }

    public Furniture getDresser() {
        return dresser;
    }

    public void setDresser(Furniture dresser) {
        this.dresser = dresser;
    }

    public Furniture getTable() {
        return table;
    }

    public void setTable(Furniture table) {
        this.table = table;
    }
}
