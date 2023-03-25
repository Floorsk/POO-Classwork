public class App {
    public static void main(String[] args) throws Exception {
        
       User user = new User("Davi", "Galdino", "Floorsk", "flokinho@gmail.com");
       UserPremium userP = new UserPremium("Eliadja", "Cavalcanti", "WildFlower", "flower@gmail.com", 40028922); 

       user.listening();
       userP.listening();

    }
}
