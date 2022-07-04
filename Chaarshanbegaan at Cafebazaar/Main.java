import java.util.Scanner;

public class java {
    public static Double DistanceFinder(int x ,int y){
        return Math.sqrt((x*x)+(y*y));
    }

    public static int Score(double distance){
        int topScore=10;
        int lowDistance=10;

        while (true){
            if (distance <= lowDistance)
                return topScore;

            if (distance>190)
                return 0;

            if (distance>lowDistance && distance<= lowDistance+20) {
                topScore--;
                return topScore;
            }
            else{
                lowDistance+=20;
                topScore--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int score=0;

        for (int i = 0; i < n; i++) {
            int x=scan.nextInt();
            int y=scan.nextInt();

            score += Score(DistanceFinder(x,y));
        }

        System.out.println(score);
    }
}

/*
3
12 16
180 100
152 10
 */
