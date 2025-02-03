#include<stdio.h>
#include<sys/types.h>
void ChildProcess();
void ParentProcess();
void print(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
	printf("%d",a[i]);
	}
}
void insert(int a[],int n)
    {
	int i,j,temp;
	for(i=0;i<n;i++)
      {
	temp=a[i];
	j=i-1;
	while(j>=0&&temp<=a[j])
	{
	a[j+1]=a[j];
	j=j-1;
	}
	a[j+1]=temp;
      }
   }
void bubble(int a[],int n)
	{
	int i,j,temp;
	for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;i++)
	{
	if(a[j]<a[i])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	}
	}
void ChildProcess()
{
printf("\n I am child process\nI am sorting integer using Insertion sort:\n");
}
void ParentProcess()
{
printf("\n I am paraent process\n I am sorting integer using bubble sort:\n");
}
void main()
{
pid_t pid;
int i,j,temp;
int a[100];
int n =sizeof(a)/sizeof(a[0]);
printf("How many  number you want to sort");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter the number:");
scanf("%d",&a[i]);
}
pid=fork(); 
if(pid==0)
{
ChildProcess();
printf("\n Before sorting array elements are:\n");
print(a,n);
insert(a,n);
printf("\n After sorting array elementa are:\n");
print(a,n);
}
else
{
ParentProcess();
printf("\n Before sorting array elements are:\n");
print(a,n);
printf("\n After sorting array elements are:\n");
print(a,n);


}
}
