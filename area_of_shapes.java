import java.util.Scanner;
public class area_of_shapes
 {
    static Scanner var1=new Scanner(System.in);
    static double area_triangle()
    {
        System.out.print("enter the hight of thr trangle:");
        double height=var1.nextDouble();
        System.out.print("enter the base of the triangle:");
        double base=var1.nextDouble();
        double area=0.5*height*base;
        return area;
    }
    static double perimeter_triangle()
    {
        System.out.print("enter the first side of thr trangle:");
        double first=var1.nextDouble();
        System.out.print("enter the second side of the triangle:");
        double second=var1.nextDouble();
        System.out.print("enter the third of the triangle:");
        double third=var1.nextDouble();
        double perimeter=first+second+third;
        return perimeter;
    }
    static double area_circle()
    {
        System.out.print("enter the radius of thr circle:");
        double radius=var1.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        return area;
    }
    static double perimeter_circle()
    {
        System.out.print("enter the radius of thr circle:");
        double radius=var1.nextDouble();
        double pi=3.14;
        double perimeter=pi*radius*2;
        return perimeter;
    }
    static double area_square()
    {
        System.out.print("enter the side of thr square:");
        double side=var1.nextDouble();
        
        double area=side*side;
        return area;
    }
    static double perimeter_square()
    {
        System.out.print("enter the side of thr square:");
        double side=var1.nextDouble();
        
        double perimeter=4*side;
        return perimeter;
    }
    static double area_rectangle()
    {
        System.out.print("enter the hight of thr rectangle:");
        double height=var1.nextDouble();
        System.out.print("enter the width of the rectangle:");
        double width=var1.nextDouble();
        double area=height*width;
        return area;
    }
    static double perimeter_rectangle()
    {
        System.out.print("enter the hight of thr rectangle:");
        double height=var1.nextDouble();
        System.out.print("enter the width of the rectangle:");
        double width=var1.nextDouble();
        double perimeter=2*(height+width);
        return perimeter;
    }
    static double area_cube()
    {
        System.out.print("enter the side of the cube:");
        double cube=var1.nextDouble();
        
        double area=6*cube*cube;
        return area;
    }
    static double voloum_cube()
    {
        System.out.print("enter the side of the cube:");
        double cube=var1.nextDouble();
        
        double voloum=cube*cube*cube;
        return voloum;
    }
    static double area_cuboid()
    {
        System.out.print("enter the length of the cuboid:");
        double length=var1.nextDouble();
        System.out.print("enter the width of the cuboid:");
        double width=var1.nextDouble();
        System.out.print("enter the hight of the cuboid:");
        double hight=var1.nextDouble();
        double area=2*((length*width)+(width*hight)+(hight*length));
        return area;
    }
    static double voloum_cuboid()
    {
        System.out.print("enter the length of the cuboid:");
        double length=var1.nextDouble();
        System.out.print("enter the width of the cuboid:");
        double width=var1.nextDouble();
        System.out.print("enter the hight of the cuboid:");
        double hight=var1.nextDouble();
        double voloum=length*width*hight;
        return voloum;
    }
    static double surfaceArea_cylinder()
    {
        double pi=3.14;
        System.out.print("enter the radius of the cylinder:");
        double radius=var1.nextDouble();
        System.out.print("enter the hight of the cylinder:");
        double hight=var1.nextDouble();
        double area=2*pi*radius*(radius+hight);
        return area;
    }
   

    public static void main(String[] args)
    {
        
        System.out.println("\tpress 1:for area of triangle");
        System.out.println("\tpress 2 for perimeter of traingle");
        System.out.println("\tpress 3 for area of circle");
        System.out.println("\tpress 4 for perimeter of circle");
        System.out.println("\tpress 5 for area of square");
        System.out.println("\tpress 6 for perimeter of square");
        System.out.println("\tpress 7 for area of rectangle");
        System.out.println("\tpress 8 for perimeter of rectangle");
        System.out.println("\tpress 9 for area of cube");
        System.out.println("\tpress 10 for voloum of cube");
        System.out.println("\tpress 11 for area of cuboid");
        System.out.println("\tpress 12 for voloum of cuboid");
        System.out.println("\tpress 13 for area of cylinder");
        System.out.println("enter the choice");
        int num=var1.nextInt();
        switch(num)
        {
            case 1:
                {
                    System.out.println("area of triangle= "+area_triangle());
                    break;
                }
            case 2:
                {
                    System.out.println("perimeter of triangle= "+perimeter_triangle());
                    break;
                }
            case 3:
                {
                    System.out.println("area of circle ="+area_circle());
                    break;
                }
            case 4:
                {
                    System.out.println("perimeter of= "+perimeter_circle());
                    break;
                }
            case 5:
                {
                    System.out.println("area of square="+area_square());
                    break;
                }
            case 6:
                {
                    System.out.println("perimeter of square= "+perimeter_circle());
                    break;
                }
            case 7:
                {
                    System.out.println("area of rectangle "+area_rectangle());
                    break;
                }
            case 8:
                {
                    System.out.println("perimeter of rectangle "+perimeter_rectangle());
                    break;
                }
            case 9:
                {
                    System.out.println("area of cube "+area_cube());
                    break;
                }
            case 10:
                {
                    System.out.println("perimeter of cube "+voloum_cube());
                    break;
                }
            case 11:
                {
                    System.out.println("area of cuboid "+area_cuboid());
                    break;
                }
            case 12:
                {
                    System.out.println("area of triangle "+voloum_cuboid());
                    break;
                }
            case 13:
                {
                    System.out.println("area of triangle "+surfaceArea_cylinder());
                    break;
                }
        }

    }


    
}
