/*using constructor*/
class Box
{
double width;
double height;
double depth;

Box()
{
width=10;
height=20;
depth=30;	
}
double volume()
{
return height*width*depth;
}
}

class BoxDemoconstructor
{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();

double vol;
vol=mybox1.volume();
System.out.println("volume of Box1"+vol);
vol= mybox2.volume();
System.out.println("volume of box2"+vol);
}
}