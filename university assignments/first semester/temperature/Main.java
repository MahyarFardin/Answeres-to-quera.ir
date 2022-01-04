import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //wether stream programm

        //initializing variables
        Scanner scan=new Scanner(System.in);

        //this is where i get variables as string and split it to float
        String input;
        String input2[]=new String[100];
        input=scan.nextLine();
        scan.close();

        input2=input.split(" ");
        float input1[]=new float[input2.length-1];

        //these will help to find the maxumum and minimum of slop
        Float max=-100.0f,min=100.0f;

        float sum=0;
        //casting to float and finding maximum and minimum
        for(int i=0;i<input2.length-1;i++)
        {
            input1[i]=Float.parseFloat(input2[i]);
            sum=sum + input1[i];
            max=Math.max(max,input1[i]);
            min=Math.min(min,input1[i]);
        }

        //this is where i determine the slops
        float temp=input1[0];
        int counter=1;

        //finding the 0 slops length
        int sabetnahayi=-100;
        for (int i = 1; i < input1.length; i++)
        {
            if(input1[i]==temp)
            {
                counter++;
                if(i==input1.length-1)
                {
                    if(counter>=sabetnahayi)
                    {
                        sabetnahayi=counter;
                    }
                    break;
                }
            }
            else
            {
                if(counter>=sabetnahayi)
                {
                    sabetnahayi=counter;
                }
                counter=1;
            }
            temp=input1[i];
        }

        //finding positive slop
        float aval=0;
        float afzayesh=-100;
        int counterafzayesh=0;
        counter=0;
        temp=input1[0];

        for (int i = 1; i < input1.length; i++)
        {
            if(input1[i]>temp)
            {
                if(counter==0)
                {
                    aval=temp;
                }
                counter++;
                if(i==input1.length-1)
                {
                    if(counter>=counterafzayesh)
                    {
                        afzayesh=input1[i]-aval;
                        counterafzayesh=counter;
                    }
                    break;
                }
            }
            else
            {
                if(counter>=counterafzayesh)
                {
                    afzayesh=input1[i-1]-aval;
                    counterafzayesh=counter;
                }
                counter=0;
            }
            temp=input1[i];
        }

        //finding negative slop
        aval=0;
        float kahesh=100;
        int counterkahesh=0;
        counter=0;
        temp=input1[0];
        int rang=0;

        for (int i = 1; i <input1.length; i++)
        {
            if(input1[i]<temp)
            {
                if(counter==0)
                {
                    aval=temp;
                }
                counter++;
                if(i==input1.length-1)
                {
                    if(counter>=counterkahesh)
                    {
                        kahesh=aval-input1[i];;
                        counterkahesh=counter;
                    }
                    break;
                }
            }
            else
            {
                if(counter>=counterkahesh)
                {
                    kahesh=aval-input1[i-1];
                    counterkahesh=counter;
                }
                counter=0;
            }
            temp=input1[i];
        }


        //printing statements
        System.out.print(Math.abs(Math.round(afzayesh))+","+Math.abs(Math.round(kahesh))+","+sabetnahayi+",");
        System.out.print(Math.round(max)+","+Math.round(min)+","+Math.round(sum/input1.length));

    }
}
