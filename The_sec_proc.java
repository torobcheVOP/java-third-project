package date;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class The_sec_proc {
String y;
    public The_sec_proc(String y)
    {
        this.y=y;
    }
    public void Proc()
    {
int u=Integer.parseInt(y);
if(u<32)
{
    System.out.format("the date is 1/%d ",u);
}
else if(u<187)
{
int x=u%31;
int z=u/31+1;
if(x==0)
{
    x=31;
    z=z-1;
}
    System.out.format("the date is %d/%d ",z,x);
}
else if (186<u && u<337)
{
    int i=u-186;
int x=i%30;
int z=i/30+6;
    if(x==0)
    {
        x=30;

    }
    System.out.format("the date is %d/%d ",z,x);

}
else if(336<u && u<366)
{
int i=u-336;
int x=i;
int z=12;
    System.out.format("the date is 12/%d ",x);


}
    }
}
