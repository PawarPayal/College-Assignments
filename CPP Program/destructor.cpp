#include<iostream>
using namespace std;
class number
{
int a,*p;
public:
number(int x)
{
cout<<"enter no:"<<endl;
cin>>a;
p=new int [a];
}
void accept()
{
int i=0;
for(i=0;i<a;i++)
cin>>p[i];
}
void display()
{
int i=0;
for(i=0;i<a;i++)
cout<<p[i];
}
};	
~number(c)
{
delete p;
}
 
int main()
{
//int z;
number n(2);
n.accept();
n.display();
}

