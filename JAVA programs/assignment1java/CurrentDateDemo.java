import java.util.*;
import java.text.*;

class CurrentDateDemo
{
  public static void main(String args[])
{
   Date d=new Date(); 

   System.out.println("current date is"+d);

  String Pattern="dd/MM/yyyy";
 SimpleDateFormat sdp=new SimpleDateFormat(Pattern);
 String date=sdp.format(new Date());
 System.out.println("current date is="+date);

String Pattern1="MM-dd-yyyy";
 SimpleDateFormat sdp1=new SimpleDateFormat(Pattern1);
 String date1=sdp1.format(new Date());
 System.out.println("current date is="+date1);

String Pattern2="EEEEE MMMMM dd yyyy";
 SimpleDateFormat sdp2=new SimpleDateFormat(Pattern2);
 String date2=sdp2.format(new Date());
 System.out.println("current date is="+date2);

String Pattern3="dd/MM/yyyy HH:mm:ss a Z";
 SimpleDateFormat sdp3=new SimpleDateFormat(Pattern3);
 String date3=sdp3.format(new Date());
 System.out.println("current date  and time is="+date3);

String Pattern4="HH:mm:ss";
 SimpleDateFormat sdp4=new SimpleDateFormat(Pattern4);
 String date4=sdp4.format(new Date());
 System.out.println("current time is="+date4);

String Pattern5="w";
 SimpleDateFormat sdp5=new SimpleDateFormat(Pattern5);
 String date5=sdp5.format(new Date());
 System.out.println("current week of year is="+date5);

String Pattern6="W";
 SimpleDateFormat sdp6=new SimpleDateFormat(Pattern6);
 String date6=sdp6.format(new Date());
 System.out.println("current week of month is="+date6);

String Pattern7="D";
 SimpleDateFormat sdp7=new SimpleDateFormat(Pattern7);
 String date7=sdp7.format(new Date());
 System.out.println("current week of year is="+date7);


     }
}
