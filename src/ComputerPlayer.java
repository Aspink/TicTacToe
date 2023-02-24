public class ComputerPlayer extends Player{
    public ComputerPlayer() {
        setName("Komputer");
    }
    @Override
    public void yourTurn() {
        System.out.println("Teraz mój ruch!");
    }
}
