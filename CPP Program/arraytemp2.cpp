#include"iostream"
using namespace std;
template <class T>
int add(T a[10],int n)
{
int i;
float sum;

for(i=0;i<n;i++)
{
sum=sum+a[i];
}
cout<<"addition is:"<<sum<<endl;
}

int main()
{
int n,i,c[10];
float b[10];
cout<<"how many no.you want to add:"<<endl;
cin>>n;
cout<<"enter integer  array no."<<endl;

for(i=0;i<n;i++)
{
cin>>c[i];
}

cout<<"enter floating array no."<<endl;

for(i=0;i<n;i++)
{
cin>>b[i];
}
add(c,n);
add(b,n);
return 0;
}
 
