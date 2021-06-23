class RandomWalkers {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i=0;i<trials;i++){
            int x = 0;
            int y = 0;
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
                steps += 1;
            }
            sum += steps;
        }
        System.out.println("average number of steps = "+((double)sum)/trials);
    }
}