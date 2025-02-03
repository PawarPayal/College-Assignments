#include<stdio.h>
main()
{
int pid,rnice;
printf("press DEL to step process\n");
pid=fork();
for(;;)
{
if(pid==0)
{
rnice=nice(-20);
printf("child gets higher CPU priority%d\n",rnice);
sleep(1);
}
else
{
rnice=nice(15);
printf("Parent gets lower CPU priority%d\n",rnice);
sleep(10);
}
}
}
