public class App {
    public static void main(String[] args) throws Exception {
        
       User user = new User("Davi", "Galdino", "Floorsk", "flokinho@gmail.com");
       UserPremium userP = new UserPremium("Sophie", "Shrike", "Sokie", "Sokie@gmail.com", 40028922);
       Music song = new Music();
       
       user.listening();
       userP.listening();

       song.setTitle("Shrike");
       System.out.println(song.getTitle());

    }
}
