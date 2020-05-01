class Notepad
{
public static void main(String a[])
{
Runtime rt=Runtime.getRuntime();
try
{
rt.exec("notepad.exe");
rt.exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\winword.exe");
}
catch(Exception e)
{
System.out.println(e);
}
int g=50/0;
System.out.println(g);
}
}









