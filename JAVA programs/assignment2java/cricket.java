import java.io.*;
class cricketplayer
{
  String name;
  int inning,totnotout,totalruns;
  float batavg;
  public cricketplayer()
  {
    name=null;
    inning=0;
    totnotout=0;
    totalruns=0;
    batavg=0;
  }
  public void get() throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name,Enter no of innings,no of times not out,total runs");
    name=br.readLine();
    inning=Integer.parseInt(br.readLine());
    totnotout=Integer.parseInt(br.readLine());
    totalruns=Integer.parseInt(br.readLine());
  }
  
  public void display()
  {
    System.out.println("Name="+name);
    System.out.println("Innings="+inning);
    System.out.println("No. of times not out="+totnotout);
    System.out.println("Total runs="+totalruns);
    System.out.println("Batting average="+batavg);    
  }
  
  static void avg(int n,cricketplayer c[])
  {
    try
    {
      for(int i=0;i<n;i++)
      {
        c[i].batavg=c[i].totalruns/c[i].inning;
      }
    }
    catch(Exception e)
    {
      System.out.println(e); 
    }
  }
  
  static void sort(int n,cricketplayer c[])
  {
    String temp1;
    int temp2,temp3,temp4;
    float temp5;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(c[i].batavg<c[j].batavg);
        {
          temp1=c[i].name;
          c[i].name=c[j].name;
          c[j].name=temp1;
          
          temp2=c[i].inning;
          c[i].inning=c[j].inning;
          c[j].inning=temp2;
          
          temp3=c[i].totnotout;
          c[i].totnotout=c[j].totnotout;
          c[j].totnotout=temp3;
          
          temp4=c[i].totalruns;
          c[i].totalruns=c[j].totalruns;
          c[j].totalruns=temp4;
          
          temp5=c[i].batavg;
          c[i].batavg=c[j].batavg;
          c[j].batavg=temp5;
        }
      }
    }
  }
}

class Main
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the limit");
    int n=Integer.parseInt(br.readLine());
    cricketplayer c[]=new cricketplayer[n];
    for(int i=0;i<n;i++)
    {
      c[i]=new cricketplayer();
      c[i].get();
    }
    cricketplayer.avg(n,c);
    cricketplayer.sort(n,c);
    for(int i=0;i<n;i++)
    {
      c[i].display();
    }
  }
}
