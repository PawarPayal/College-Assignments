/*FCFS*/
#include<stdio.h>
#include<string.h>
struct Input
{
	char pname[10];
	int bt,at,ft,tbt;
}tab[5];

struct Sequence
{
	int start,end;
	char pname[10];
}seq[100],seq1[20];

int finish,time,n,k,prev;

void getinput()
{
int i;
printf("\nEnter no.of processes:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Process name:");
scanf("%s",tab[i].pname);
printf("Burst Time:");
scanf("%d",& tab[i].bt);
printf("Arrival Time:");
scanf("%d",& tab[i].at);
tab[i].tbt=tab[i].bt;
}
}
void printinput()
{
int i;
printf("\n\n\nProcess\tBT\tAT:");
for(i=0;i<n;i++)
printf("\n%s\t%d\t%d",tab[i].pname,tab[i].tbt,tab[i].at);
}
void bubble()
{
struct Input t;
int i,j;
for(i=0;i<n;i++)
	for(j=0;j<(n-1)-i;j++)
	if(tab[j].at>tab[j+1].at)
	{	
	t=tab[j];
	tab[j]=tab[j+1];
	tab[j+1]=t;
	}
}
void printoutput()
{
int i;
float AvgTAT=0,AvgWT=0;
printf("\n*******Final Table********");
printf("\n\nProcess \tAT\tBT\tFT\tTAT\tWT");
for(i=0;i<n;i++)
{
printf("\n\n%s\t%d\t%d\t%d\t%d\t%d",tab[i].pname,tab[i].at,tab[i].bt,tab[i].ft,tab[i].ft-tab[i].at,
tab[i].ft-tab[i].at-tab[i].bt);
AvgTAT+=tab[i].ft-tab[i].at;
AvgWT+=tab[i].ft-tab[i].at-tab[i].bt;
}
AvgTAT/=n;
AvgWT/=n;
printf("\n\nAverage TAT=%f",AvgTAT);
printf("\n\nAverage WT=%f",AvgWT);
}
int arrived(int t)
{
int i;
for(i=0;i<n;i++)
if(tab[i].at<=t && tab[i].tbt!=0)
return 1;
return 0;
}
void processinput()
{
int i=0,j;
finish=k=0;
while(finish!=n)
{
if(arrived(time))
{
for(j=0;j<tab[i].bt;j++)
{
time++;
tab[i].tbt--;
tab[i].ft=time;
printinput();
seq[k].start=prev;
seq[k].end=time;
strcpy(seq[k++].pname,tab[i].pname);
prev=time;











if(tab[i].tbt==0)
{finish++;
break;
}

}
i++;
}
else
{
time++;
seq[k].start=prev;
seq[k].end=time;
strcpy(seq[k++].pname,"*");
prev=time;
}
}
}
void ganttchart()
{

int i,j=1;
seq1[0]=seq[0];
printf("\n**********GANTT CHART***********");
for(i=1;i<k;i++)
{
if(strcmp(seq1[j-1].pname,seq[i].pname)==0)
seq1[j-1].end=seq[i].end;
else
seq1[j++]=seq[i];
}
for(i=0;i<j;i++)
printf("\n\n%d\t%s\t%d",seq1[i].start,seq1[i].pname,seq1[i].end);
}
int main()
{
int i;










getinput();
printf("Entered Data");
printinput();
bubble();
printf("Data after sorting according to arrival time:");
printinput();
processinput();
printoutput();
ganttchart();
for(i=0;i<n;i++)
{
tab[i].tbt=tab[i].bt=rand()%10+1;
tab[i].at=tab[i].ft+2;
}
printf("\n\n******Data for second CPU Cycle*********");
printinput();
processinput();
printoutput();
ganttchart();
}


