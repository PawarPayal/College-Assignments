#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main()
{
int pid=fork();
if(pid>0)
{
printf("Parent process\n");
printf("ID:%d\n\n",getpid());
}
else if(pid==0)
{
printf("Child process\n");
printf("ID:%d\n\n",getpid());
printf("Parent-ID:%d\n\n",getpid());
sleep(10);
printf("\n Child process\n");
printf("ID:%d\n",getpid());
printf("Parent-ID:%d\n",getpid());
}
return 0;
}
