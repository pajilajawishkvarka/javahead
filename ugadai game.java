public class Main {
    public static void main (String[] args) {
         class Player{
             int number = 0;
             public void guess() {
                 number = (int) (Math.random() * 10);
             }
        }
         class GuessGame {
             Player p1;
             Player p2;
             Player p3;


    public void startGame(){
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();

         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;
         boolean p1IsRight = false;
         boolean p2IsRight = false;
         boolean p3IsRight = false;
         int targetNumber = (int)(Math.random()*10);
         System.out.println("число яке потрібно вгадати " + targetNumber);
         while (true){
             p1.guess();
             p2.guess();
             p3.guess();
             guessp1 = p1.number;
             guessp2 = p2.number;
             guessp3 = p3.number;
             System.out.println("перший ігрок думає " +guessp1);
             System.out.println("другий ігрок думає " +guessp2);
             System.out.println("третій ігрок думає " +guessp3);
             if (guessp1 == targetNumber){
                 p1IsRight = true;
             }
             if (guessp2 == targetNumber){
                 p2IsRight = true;}
                 if (guessp3 == targetNumber){
                     p3IsRight = true;
             }
                 if(p1IsRight || p2IsRight || p3IsRight){
                     System.out.println("перший ігрок вгадав?" + p1IsRight);
                     System.out.println("другий ігрок вгадав?" + p2IsRight);
                     System.out.println("третій ігрок вгадав?" + p3IsRight);
                     break;
                 }else {System.out.println("reload");}
         }
    }
    }



              GuessGame game = new GuessGame();
              game.startGame();
