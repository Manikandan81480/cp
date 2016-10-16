class Cp
{
public static void main(String... args)
{
int i=0;
Scanner x=new Scanner(System.in);
public String lcsp(String[] strs)
{
String lp="";
if(strs.length>0)
{
lp=strs[0];
}
for(i=1;i<strs.length();i++)
{
String analys=strs[i];
int j=0;
for(;Math.min(lp.length(),strs[i].length());j++)
if(lp.charAt(j)!=analys.charAt(j))
break;
}
}
lp=strs.substring(0,j);
}
return lp;
}

}
}
