import java.util.Scanner;

public class Project{
    public static void main(String[] args) {
        // getting initials
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();

        // printing negatibe if it is negative

        if (input<-99||input>99)
        {
            System.out.println("عدد صحیح نمیباشد");
            System.exit(0);
        }
        if (input < 0&&input>-100) {
            System.out.print("منفی ");
            input = Math.abs(input);
        }
        if (input==0)
            System.out.println("صفر");
        // most stupid part
        String n0 = "صفر", n1 = "یک", n2 = "دو", n3 = "سه", n4 = "چهار", n5 = "پنج", n6 = "شش", n7 = "هفت", n8 = "هشت",
                n9 = "نه";
        String dah="ده";
        String b = "بیست";
        String si = "سی";
        String che = "چهل";
        String p = "پنجاه";
        String sh = "شصت";
        String hf = "هفتاد";
        String hs = "هشتاد";
        String nv = "نود";
        // main body


        if(input%10==0)
        {
            int t=input/10;
            if(t==1)
                System.out.print(dah);
            if(t==2)
                System.out.print(b);
            if(t==3)
                System.out.print(si);
            if(t==4)
                System.out.print(che);
            if(t==5)
                System.out.print(p);
            if(t==6)
                System.out.print(sh);
            if(t==7)
                System.out.print(hf);
            if(t==8)
                System.out.print(hs);
            if(t==9)
                System.out.print(nv);
        }
        else if (input < 10) {
            if (input == 0)
                System.out.println(n0);
            if (input == 1)
                System.out.println(n1);
            if (input == 2)
                System.out.println(n2);
            if (input == 3)
                System.out.println(n3);
            if (input == 4)
                System.out.println(n4);
            if (input == 5)
                System.out.println(n5);
            if (input == 6)
                System.out.println(n6);
            if (input == 7)

                System.out.println(n7);
            if (input == 8)
                System.out.println(n8);
            if (input == 9)
                System.out.println(n9);
        }
        else if (input > 10 && input < 20) {
            if (input == 11)
                System.out.println("یازده");
            if (input == 12)
                System.out.println("دوازده");
            if (input == 13)
                System.out.println("سیزده");
            if (input == 14)
                System.out.println("چهارده");
            if (input == 15)
                System.out.println("پانزده");
            if (input == 16)
                System.out.println("شانزده");
            if (input == 17)
                System.out.println("هفده");
            if (input == 18)
                System.out.println("هجده");
            if (input == 19)
                System.out.println("نوزده");
        } else {
            if (20 < input && input < 30) {
                System.out.print(b + " و ");
                if (input % 20 == 1)
                    System.out.print(n1);
                if (input % 20 == 2)
                    System.out.print(n2);
                if (input % 20 == 3)
                    System.out.print(n3);
                if (input % 20 == 4)
                    System.out.print(n4);
                if (input % 20 == 5)
                    System.out.print(n5);
                if (input % 20 == 6)
                    System.out.print(n6);
                if (input % 20 == 7)
                    System.out.print(n7);
                if (input % 20 == 8)
                    System.out.print(n8);
                if (input % 20 == 9)
                    System.out.print(n9);
            } else if (30 < input && input < 40) {
                System.out.print(si + " و ");
                if (input % 30 == 1)
                    System.out.print(n1);
                if (input % 30 == 2)
                    System.out.print(n2);
                if (input % 30 == 3)
                    System.out.print(n3);
                if (input % 30 == 4)
                    System.out.print(n4);
                if (input % 30 == 5)
                    System.out.print(n5);
                if (input % 30 == 6)
                    System.out.print(n6);
                if (input % 30 == 7)
                    System.out.print(n7);
                if (input % 30 == 8)
                    System.out.print(n8);
                if (input % 30 == 9)
                    System.out.print(n9);
            } else if (40 < input && input < 50) {
                System.out.print(che + " و ");
                if (input % 40 == 1)
                    System.out.print(n1);
                if (input % 40 == 2)
                    System.out.print(n2);
                if (input % 40 == 3)
                    System.out.print(n3);
                if (input % 40 == 4)
                    System.out.print(n4);
                if (input % 40 == 5)
                    System.out.print(n5);
                if (input % 40 == 6)
                    System.out.print(n6);
                if (input % 40 == 7)
                    System.out.print(n7);
                if (input % 40 == 8)
                    System.out.print(n8);
                if (input % 40 == 9)
                    System.out.print(n9);
            }
            else if (50 < input && input < 60) {
                System.out.print(p + " و ");
                if (input % 50 == 1)
                    System.out.print(n1);
                if (input % 50 == 2)
                    System.out.print(n2);
                if (input % 50 == 3)
                    System.out.print(n3);
                if (input % 50 == 4)
                    System.out.print(n4);
                if (input % 50 == 5)
                    System.out.print(n5);
                if (input % 50 == 6)
                    System.out.print(n6);
                if (input % 50 == 7)
                    System.out.print(n7);
                if (input % 50 == 8)
                    System.out.print(n8);
                if (input % 50 == 9)
                    System.out.print(n9);
            }
            else if (60<input && input<70)
            {
                System.out.print(sh+" و ");
                if(input%60==1)
                    System.out.print(n1);
                if(input%60==2)
                    System.out.print(n2);
                if(input%60==3)
                    System.out.print(n3);
                if(input%60==4)
                    System.out.print(n4);
                if(input%60==5)
                    System.out.print(n5);
                if(input%60==6)
                    System.out.print(n6);
                if(input%60==7)
                    System.out.print(n7);
                if(input%60==8)
                    System.out.print(n8);
                if(input%60==9)
                    System.out.print(n9);
            }
            else if (70<input && input<80)
            {
                System.out.print(hf+" و ");
                if(input%70==1)
                    System.out.print(n1);
                if(input%70==2)
                    System.out.print(n2);
                if(input%70==3)
                    System.out.print(n3);
                if(input%70==4)
                    System.out.print(n4);
                if(input%70==5)
                    System.out.print(n5);
                if(input%70==6)
                    System.out.print(n6);
                if(input%70==7)
                    System.out.print(n7);
                if(input%70==8)
                    System.out.print(n8);
                if(input%70==9)
                    System.out.print(n9);
            }
            else if (80<input && input<90)
            {
                System.out.print(hs+" و ");
                if(input%80==1)
                    System.out.print(n1);
                if(input%80==2)
                    System.out.print(n2);
                if(input%80==3)
                    System.out.print(n3);
                if(input%80==4)
                    System.out.print(n4);
                if(input%80==5)
                    System.out.print(n5);
                if(input%80==6)
                    System.out.print(n6);
                if(input%80==7)
                    System.out.print(n7);
                if(input%80==8)
                    System.out.print(n8);
                if(input%80==9)
                    System.out.print(n9);
            }
            else if (90<input && input<100)
            {
                System.out.print(nv+" و ");
                if(input%90==1)
                    System.out.print(n1);
                if(input%90==2)
                    System.out.print(n2);
                if(input%90==3)
                    System.out.print(n3);
                if(input%90==4)
                    System.out.print(n4);
                if(input%90==5)
                    System.out.print(n5);
                if(input%90==6)
                    System.out.print(n6);
                if(input%90==7)
                    System.out.print(n7);
                if(input%90==8)
                    System.out.print(n8);
                if(input%90==9)
                    System.out.print(n9);
            }


        }

    }

}

