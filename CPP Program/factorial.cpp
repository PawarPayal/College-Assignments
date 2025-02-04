#include<iostream>
using namespace std;
int main()
{
int i,a,fact=1;
cout<<"enter the number:"<<endl;
cin>>a;
for(i=1;i<=a;i++)
fact=fact*i;
cout<<"factorial of a is="<<fact<<endl;
}
