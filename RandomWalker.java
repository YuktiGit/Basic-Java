class RandomWalker {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    System.out.println("(0, 0)");
    int distance = 0;
    int steps = 0;

    while(distance != r){
      double randomNumber = Math.random();
      if(randomNumber < 0.25){
        // move up
        y = y + 1;
      }else if(randomNumber < 0.5){
        // move down
        y = y - 1;
      }else if(randomNumber < 0.75){
        // move left
        x = x - 1;
      }else{
        // move right
        x = x + 1;
      }
      distance = Math.abs(x) + Math.abs(y);
      System.out.println("(" + x + ", " + y + ")");
      steps += 1;
    }
    System.out.println("steps = " + steps);
  }
}