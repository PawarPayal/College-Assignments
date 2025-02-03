import java.io.*;
class emp
{
        private int id;
        private String name,dept;
        private float salary;

        public emp()
        {
                id=0;
                dept=" ";
                name=" ";
                salary=0;
        }

        public emp(int i,String d,String nm,float sal)
        {
                id=i;
                dept=d;
                name=nm;
                salary=sal;
        }

        public void accept()throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter ID = ");
                id=Integer.parseInt(br.readLine());
                System.out.println("Enter Name = ");
                name=(br.readLine());
                System.out.println("Enter Department = ");
                dept=(br.readLine());
                System.out.println("Enter Salary = ");
                salary=Float.parseFloat(br.readLine());
        }

        public void display()
        {
                System.out.println("Id = "+id);
                System.out.println("Name = "+name);
                System.out.println("Department = "+dept);
                System.out.println("Salary = "+salary);
        }

        public float retsal()
        {
                return salary;
        }

}

class manager extends emp
{
         private float bonus;

        public manager()
        {
                bonus=0;
        }

        public manager(float b)
        {
                bonus=b;
        }

        public void accept()throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                super.accept();
                System.out.println("Enter Bonus = ");
                bonus=Float.parseFloat(br.readLine());
        }

        public void display()
        {
                super.display();
                System.out.println("Bonus = "+bonus);
        }


        float computesal()
        {
                return(super.retsal()+bonus);
        }

}

class sa1
{
        public static void main(String[] arg)throws IOException
        {
                int i,n;
                float max;

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number of objects = ");
                n=Integer.parseInt(br.readLine());

                manager m[] = new manager[n];
                float tot[] = new float[n];

                for(i=0;i<n;i++)
                {
                        m[i] = new manager();
                        m[i].accept();
                }

                System.out.println("\nRecords Are\n");

                for(i=0;i<n;i++)
                {
                        m[i].display();
                        tot[i]=m[i].computesal();
                }

                max=tot[0];

                for(i=1;i<n;i++)
                {
                        if(tot[i]>max)
                                max=tot[i];
                }

                System.out.println("\n\nManger with Maximum Salary is \n");

                for(i=0;i<n;i++)
                {
                        if(tot[i] == max)
                        {
                                m[i].display();
                                System.out.println("Maximum salary is = "+max);
                        }
                }
        }
}

