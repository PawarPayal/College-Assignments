#include<iostream>
#include<fstream>
using namespace std;
int main()
{
char ch;
ifstream fp;
ofstream fp1;
fp.open("file1.txt");
if(fp==NULL)

{
cout<<"File dosen't exist\n";
return(0);
}
else
{
cout<<"file is present:";
}
fp1.open("file2.txt",ios::app);
while((ch==fp.get())!=EOF)
{
fp1.put(ch);

}
fp.close();
fp1.close();
}
