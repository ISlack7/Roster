import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Adding in Mr. Barry's roster array
    String[] barrysRoster = new String[10]; 
    String[] msBennysRoster = new String[12]; 
    Scanner scan = new Scanner(System.in);

    for (int index = 0; index < barrysRoster.length; index++){ 
      System.out.println("What's your name?");
      barrysRoster[index] = scan.next();
      System.out.println(BarrysRoster[index]);
    }
      
    
  for (int index = 0; index < barrysRoster.length; index++){
    msBennysRoster[index] = barrysRoster[index];
   System.out.println(msBennysRoster[index]);
    }
    //access the second to last element in msBennysRoster
    //save a random name to that element
    msBennysRoster[11] = "bob";
    System.out.println(msBennysRoster[10]);
    //access the last element in msBennysRoster
    //save a random name to that element
    msBennysRoster[12] = "ashley";
    System.out.println(msBennysRoster[11]);
  }
}
 