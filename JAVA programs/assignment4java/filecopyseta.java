import java.io.*;
 class Filecopy
{
public static void main(String a[])throws IOException
{
FileInputStream f1=new FileInputStream(a[0]);
FileOutputStream f2=new FileOutputStream(a[1]);

int i;
do
{
i=f1.read();
if(i!=-1)
{
if(Character.isUpperCase((char)i))
f2.write(Character.toLowerCase((char)i));
else
if(Character.isLowerCase((char)i))
f2.write(Character.toUpperCase((char)i));
else
if(Character.isDigit((char)i))
f2.write('*');
}
}
while(i!=1);
f1.close();
f2.close();
}
}
