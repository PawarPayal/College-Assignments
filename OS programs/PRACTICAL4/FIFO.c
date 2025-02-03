#include<stdio.h>
int RefString[20],PT[10],nof,nor;
void Accept()
{
int i;
printf("Enter Reference String: \n");
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
void FIFO()
{
int i,j,k=0, Faults=0;
for(i=0;i<nor;i++)
{
printf("%2d||\t",RefString[i]);
if(Search(RefString[i])==-1)
{
PT[k]=RefString[i];
for(j=0;j<nof;j++)
{
if(PT[j])
{
printf("%2d\t",PT[j]);
}
}
printf("\n");
Faults++;
k=(k+1)%nof;
}
}
printf("Total Page Faults: %d\n",Faults);
}
int main()
{
printf("Enter Length ofreference string: ");
scanf("%d",&nor);
printf("Enter No of Frames: ");
scanf("%d",&nof);
Accept();
FIFO();
} 
            
