import java.util.Scanner;

class java {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int [] upDisk=new int[5];
        int [] downDisk=new int[5];
        int d=0,u=0;
        String sum="";

        for (int i = 0; i < 5; i++) {
            upDisk[i]=scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            downDisk[i]=scan.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum="";
                u= i==0 ? 4:i-1;
                d= j==0 ? 4:j-1;

                sum += (upDisk [u] + downDisk [d])%10;

                sum += (upDisk [i] + downDisk [j])%10;

                u= i==4 ? 0:i+1;
                d= j==4 ? 0:j+1;

                sum += (upDisk [u] + downDisk [d])%10;

                if(Integer.parseInt(sum)%6==0){
                    System.out.println("Boro joloo :)");
                    return;
                }
            }
        }

        System.out.println("Gir oftadi :(");
    }
}
