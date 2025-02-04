#include<iostream>
using namespace std;
class addition
{
int a,b,c;
public:
int add()
{
cout<<"Enter the two number:";
cin>>a>>b;
c=a+b;
cout<<"addition is="<<c<<endl;
}
};
int main()
{
addition a1;
a1.add();
}
