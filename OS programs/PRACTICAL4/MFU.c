#include<stdio.h>
int RefString[20],PT[10],nof,nor;
void Accept()
{
int i;
printf("enter freference string:\n");
for(i=0;i<nor;i++)
{
printf("[%d]=",i);
scanf("%d",&RefString[i]);
}
}
int Search(int s)
{
int i;
for(i=0;i<nof;i++)
if(PT[i]==s)
return(i);
return(-1);
}
int 
GetMFU(int e,int s)
{
int i,j,cnt1=0,cnt2,posi;
i=s;
do
{
cnt2=0;
for(j=e-1;j>=0;j--)
{
if(PT[i]==RefString[j])
{ cnt2++;
}
}
if(cnt2>cnt1)
{
cnt1=cnt2;
posi=i;
}
i=(i+1)%nof;
}
while(i!=s);
return(posi);
}
void MFU()
{
int i,j,k,Faults=0;
for(k=0,i=0;k<nof && i<nor;i++)
{
printf("%2d",RefString[i]);
if(Search(RefString[i])==-1)
{
PT[k]=RefString[i];
for(j=0;j<nof;j++)
{
if(PT[j])
printf("%2d",PT[j]);
}
Faults++;
k++;
}
printf("\n");
}
k=0;
while(i<nor)
{
printf("%2d",RefString[i]);
if(Search(RefString[i])==-1);
{
k=GetMFU(i,k);
PT[k]=RefString[i];

k=(k+1)%nof;
for(j=0;j<nof;j++)
{
if(PT[j])
printf("%2d",PT[j]);
}
Faults++;
}
i++;
printf("\n");
}
printf("total page faults:%d",Faults);
}
main()
{
printf("enter length of reference string:");
scanf("%d",&nor);
printf("enter no of frames:");
scanf("%d",&nof);
Accept();
MFU();
}



