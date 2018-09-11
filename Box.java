class Box
{
double width;
double height;
double depth;
}
double value()
{
return height * width * depth;
}

class BoxDemo
{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;
mybox1.width=10;
mybox1.height=20;
mybox1.depth=30;

mybox2.width=5;
mybox2.height=15;
mybox2.depth=25;
vol=mybox1.volume();
System.out.println("volume of Box1"+vol);
vol= mybox2.volume();
System.out.println("volume of box2"+vol);
}
}