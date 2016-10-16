class Int
{
public void main(String... args)
{
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int s=0;
while(a!=0)
{
s=s*10;
s=a%10+s;
a=a/10;

}
System.out.println("op",s);
}
}
