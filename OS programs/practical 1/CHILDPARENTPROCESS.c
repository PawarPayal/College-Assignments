#include<stdio.h>
#include<sys/types.h>
void ChildProcess();
void ParentProcess();
int main()
{
	pid_t pid,p_pid;
	pid=fork();
	if(pid==0)
	{
	ChildProcess();
	pid=getpid();
	pid=getpid();
	printf("\n Child process id is:%d\n",pid);
	return 0;
	}
else
	{	
	ParentProcess();
	p_pid=getpid();
	printf("\n Parent process id is:%d\n",p_pid);
	return 0;
	}	
}
	void ChildProcess()
	{
	printf("\n I am Child process");
	}
	void ParentProcess()
	{
	printf("\nI am Parent Process");
	}

