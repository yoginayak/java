/*adding method*/
class Box
{
double width;
double height;
double depth;

double volume()
{
return height*width*depth;
}
void set(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo1
{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;
mybox1.set(10,20,30);
mybox2.set(5,15,25);
vol=mybox1.volume();
System.out.println("volume of Box1"+vol);
vol= mybox2.volume();
System.out.println("volume of box2"+vol);
}
}