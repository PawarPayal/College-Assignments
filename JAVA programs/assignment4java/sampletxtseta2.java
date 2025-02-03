import java.io.*;
class seta3
{
public static void main(String args[])throws IOException {
FileInputStream fis=new FileInputStream("2.txt");
BufferedInputStream bis=new BufferedInputStream(fis);
System.out.println("The contents in reversed order are:");
int size=fis.available();
for(int i=size-1;i>=0;i--)
{
bis.mark(i);
bis.skip(i);
System.out.println((char)bis.read());
bis.reset();
}
bis.close();
}
}
