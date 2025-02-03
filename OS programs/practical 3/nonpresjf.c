#include<stdio.h>
#include<string.h>
struct process
{
char pname[10];
float bt,at,st,ft,wt,tat;
}p[100];
int n,i;
void input()
{
printf("Enter how many bprocesses");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter process name");
scanf("%s",&p[i].pname);
printf("Enter cpu burst time");
scanf("%f",&p[i].bt);
printf("Enter arrival time");
scanf("%f",&p[i].at);
}
}
void display()
{
printf("\n______________________________________________________________________________\n");
printf("\nprocess name\t burst time\tarrival time\n");
printf("\n------------------------\n");

for(i=0;i<n;i++)


{
printf("\n %s               \t   %.2f   \t%.2f",p[i].pname,p[i].bt,p[i].at);
}
printf("\n--------------------\n");
}
void display1()
{
float swt=0,awt,stat=0,astat;
printf("\n-----------------\n");
printf("\n process name\tburst time\tarrival time\tstart time\twait time\tfinish time\t turn around time\n");
printf("\n--------------------\n");
for(i=0;i<n;i++)
{
swt+=p[i].wt;
stat+=p[i].tat;
printf("\n %s \t %.2f \t %.2f \t%2.f \t%2.f \t%2.f \t%2.f",p[i].pname,p[i].bt,p[i].at,p[i].st,p[i].wt,p[i].ft,p[i].tat);
}
printf("\nAverage  wait time=%.2f\n",swt/n);

printf("\nAverage turn around time=%.2f\n",stat/n);
}
void sort()
{
int i,j;
struct process t1,t2;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(p[i].bt>=p[j].bt)
{
t2=p[i];
p[i]=p[j];
p[i]=t2;
}
}
}
for(i=1;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(p[i].at>p[j].at)
{
t2=p[i];
p[i]=p[j];
p[j]=t2;
}
}
}
display();
}
void nsjf()
{
int s=0;
sort();
printf("\nganttchart\n");
printf("o|");
p[0].st=0;
p[1].ft=0;
for(i=0;i<n;i++)
{
printf("  %.2f |",p[i].bt);
p[i+1].st=p[i].bt+s;
s+=p[i].bt;
p[i].ft=p[i].st-p[i].at;
p[i].wt=p[i].st+p[i].bt;
p[i].tat=p[i].ft-p[i].at;
}
}
int main()
{
input();
display();
nsjf();
display1();
for(i=0;i<n;i++)
{
p[i].bt=rand()%10+1;
p[i].at=p[i].ft+2;
}
display();
nsjf();
display1();
}


