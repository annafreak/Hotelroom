class hotelRoom{
  int roomNumber;
  int capacity;
double pricePerNight;
boolean isOccupied;

public hotelRoom(int roomNumber, int capacity, double pricePerNight, boolean isOccupied){
    this.roomNumber = roomNumber;
    this.capacity = capacity;
    this.pricePerNight = pricePerNight;
    this.isOccupied = isOccupied;


}
public void bookRoom(){
    if(isOccupied == true){
        System.out.println("You have reserved the cinema");
    }else{
        System.out.println("You have not reserved the cinema");
    }
}
public void releaseRoom(){
if(isOccupied == true){
    isOccupied = false;
    System.out.println("jest jusz wolny pokuj");

}else
    System.out.println("jest wolny pokuj");
}
public void displayInfo(){
    System.out.println("Room Number: " + roomNumber);
    System.out.println("Capacity: " + capacity);
    System.out.println("Price per Night: " + pricePerNight);
    System.out.println("Occupied: " + isOccupied);
    System.out.println("+______________________________+");

}




}

public class Main {
    public static void main(String[] args) {
    hotelRoom hotelRoom = new hotelRoom(5, 2, 280, true);
    hotelRoom.bookRoom();
    hotelRoom.displayInfo();
    hotelRoom.releaseRoom();
    hotelRoom.displayInfo();





    }
}