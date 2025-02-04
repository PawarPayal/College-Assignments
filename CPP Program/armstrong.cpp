#include<iostream>
using namespace std;
int main()
{
int a,b,remainder,result=0;
cout<<"enter a three digit number:";
cin>>a;
b=a;
while(b!=0)
{
remainder=b%10;
result+=remainder*remainder*remainder;
b/=10;
}
if(result==a)
cout<<a<<"is armstrong no.";
else
cout<<a<<"is not armstrong no.=";
return 0;
}
