#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main()
{	
	// fork() Create a child process
	int pid=fork();
	if(pid>0)
	{
	//getpid() returns process id
	//while getpid() will return parent process id
	printf("Parent process\n");
	printf("ID:%d\n\n",getpid());
}


else if(pid==0)
{
printf("Child process\n");
printf("ID:%d\n",getpid());
printf("id:%\n\n",getpid());

sleep(10);
printf("\nChild process\n");
printf("ID:%d\n",getpid());;
printf("Parent-ID:%d\n",getpid());

}
else {
printf("Failed to create child process");

}
return 0;

}
