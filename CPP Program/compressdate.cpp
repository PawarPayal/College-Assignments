#include<iostream>
using namespace std;
class date
{
int day,month,year;
int userdate;
int compressdate;
public:
date(int d,int m,int y)
{
day=d;
month=m;
year=y;
}
void cdate()
{
compressdate=((day*100)+month)*10000+year;
}
void getdate()
{
cin>>userdate;
}
int noofDays()
{
int tmp=(userdate-compressdate);
int y=(tmp%10000)*365;
tmp=tmp/10000;
int m=(tmp%100)*30;
tmp=tmp/100;
int d=tmp+m+y;
return d;
}
};

int main()
{
date d(2,02,2020);
d.cdate();
cout<<"Enter the date to count the days:";
d.getdate();
cout<<"Number of days are:"<<d.noofDays()<<endl;
}
