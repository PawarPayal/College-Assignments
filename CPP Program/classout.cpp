#include<iostream>
using namespace std;
class addition
{
int a,b,c;
public:
int add();
};
int addition :: add()
{
cout<<"Enter the two number"<<endl;
cin>>a>>b;
c=a+b;
cout<<"Addition is="<<c<<endl;
}
int main()
{
addition a1;
a1.add();
}
