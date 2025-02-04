#include<iostream>
using namespace std;
class student
{
int sid;
char sname[10];
char sadd[10];
public:
int accept();
int display();
};
int student :: accept()
{
cout<<"enter sid:"<<endl;
cin>>sid;
cout<<"enter sname:"<<endl;
cin>>sname;
cout<<"enter sadd:"<<endl;
cin>>sadd;
}
int student :: display()
{
cout<<"sid="<<sid<<endl;
cout<<"sname="<<sname<<endl;
cout<<"sadd="<<sadd<<endl;
}
int main()
{
student s1;
s1.accept();
s1.display();
}
