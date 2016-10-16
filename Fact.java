class Fact
{
public static void main(String... args)
{
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int fact=1,a;
if(n!=0)
{
for(int i=n;i<=1;i--)
{
a=i*fact;
fact=a;
}
else
{
System.out.println(1);
}
}
System.out.println(+a);
}
}
