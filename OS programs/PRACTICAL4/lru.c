#include<stdio.h>
struct frame
{
	int page_no,reftime;
}
	f[20];
	int n, replace_fno=-1;
	int page_found(int page_no)
	{
	int frame_no;
	for(frame_no=0;frame_no<n;frame_no++)
			{
			if(f[frame_no].page_no==page_no)
			return(frame_no);
			}
	return(-1);
	}
int get_free_frame()
{
	int frame_no;
	for(frame_no=0;frame_no<n;frame_no++)
	{
		if(f[frame_no].page_no==-1)
		return(frame_no);
	}
	return(-1);
}
int get_lru_frame()
{
	int frame_no,lrufno=0;
	for(frame_no=0;frame_no<n;frame_no++)
		{
		if(f[frame_no].reftime<f[lrufno].reftime)
		lrufno=frame_no;
		}
		return(lrufno);
}
void main()
{
	int p_request[30];
	int page_faults=0,i,curtime=0,j,k,frame_no,size;
	
	printf("\n how many frames?");
	scanf("%d",&n);
	printf("\n how many page request?");
	scanf("%d",&size);
	printf("\n page request:");
	for(i=0;i<size;i++);
	scanf("%d",&p_request[i]);
	for(i=0;i<n;i++)
	f[i].page_no=-1;
	printf("\n page no.page frames page faults:\n");
	for(i=0;i<size;i++)
	{
		j=page_found(p_request[i]);
		if(j==-1)
		{
			j=get_free_frame();
			if(j==-1)
			j=get_lru_frame();
			page_faults++;
			f[j].page_no=p_request[i];
			printf("%4d",p_request[i]);
			for(frame_no=0;frame_no<n;frame_no++)
			printf("%4d",f[frame_no].page_no);
			printf(":YES\n\n");
		}	
		else
		{
			printf("%4d",p_request[i]);
			for(frame_no=0;frame_no<n;frame_no++)
			printf("%4d",f[frame_no].page_no);
			printf(":NO\n\n");
		}
		f[j].reftime=curtime;
		curtime++;
	}
printf("\n number of page faults=%d",page_faults);
}

