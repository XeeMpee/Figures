import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // ------------------------------ <demo>
        // Demo Message:
        int screenWidth = 60;
        int screenHight = 40;  
        System.out.println((new String(new char[screenWidth])).replace('\0', '-'));
        System.out.println("Hello World! I presents you drawing program:");
        System.out.println((new String(new char[screenWidth])).replace('\0', '-'));

        Screen screen = new Screen(screenWidth, screenHight, '.', '*', true);
        
        Triangle triangle = new Triangle(new Point(-14,14),new Point(-14,3),new Point(0,0));     
        Circle circle = new Circle(new Point(-14,-12),10);
        Quadrangle quadrangle = new Quadrangle(new Point(10,12),new Point(20,12),new Point(15,17),new Point(5,17));
        Rectangle rectangle = new Rectangle(20,6, new Point(-5, 15),Placement.rightupcorner);
        Square square = new Square(10, new Point(15,-10), Placement.center);

        ArrayList<Figure> figuresList = new ArrayList<Figure>();
        figuresList.add(triangle);
        figuresList.add(circle);
        figuresList.add(rectangle);
        figuresList.add(quadrangle);
        figuresList.add(square);
        for(Figure i: figuresList){
            i.placeFigureOnScreen(screen);
        }
        screen.draw();
        //------------------------------------</demo>

        //------------------------------------<interface>
        figuresList.clear();
        screen.clear();
        boolean loopCond = true;
        Scanner scaner = new Scanner(System.in);
        while(loopCond){
            printMenu();
            int choose = Integer.parseInt(scaner.nextLine());
            switch(choose){
                case 1:
                addTriangle(figuresList);
                break;
                case 2:
                addCircle(figuresList);
                break;
                case 3:
                addQuadrangle(figuresList);
                break;
                case 4:
                addRectangle(figuresList);
                break;
                case 5:
                addSquare(figuresList);
                break;
                case 6:
                clearScreen(screen, figuresList);;
                break;
                case 7:
                screen = newScreen();
                break;
                case 8:
                draw(screen, figuresList);
                break;
                case 9:
                loopCond = quit();
                break;
                default:
                break;
            }
        }



    }

    public static void printMenu(){
        System.out.println("Menu:");
        System.out.println("1) Add Triangle");
        System.out.println("2) Add Circle");
        System.out.println("3) Add Quadrangle");
        System.out.println("4) Add Rectangle");
        System.out.println("5) Add Square");
        System.out.println("6) Clear Screen");
        System.out.println("7) New Screen");
        System.out.println("8) Draw");
        System.out.println("9) Quit");
    }

    public static void addTriangle(ArrayList<Figure> list){
        int Ax;
        int Ay;
        int Bx;
        int By;
        int Cx;
        int Cy;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ax: ");
        Ax = Integer.parseInt(scaner.nextLine());
        System.out.print("Ay: ");
        Ay = Integer.parseInt(scaner.nextLine());
        System.out.print("Bx: ");
        Bx = Integer.parseInt(scaner.nextLine());
        System.out.print("By: ");
        By = Integer.parseInt(scaner.nextLine());
        System.out.print("Cx: ");
        Cx = Integer.parseInt(scaner.nextLine());
        System.out.print("Cy: ");
        Cy = Integer.parseInt(scaner.nextLine());
        
        Triangle triangle = new Triangle(new Point(Ax,Ay),new Point(Bx,By),new Point(Cx,Cy));
        list.add(triangle);   
    }

    public static void addCircle(ArrayList<Figure> list){
        int Sx;
        int Sy;
        double r;
        
        Scanner scaner = new Scanner(System.in);
        System.out.print("Sx: ");
        Sx = Integer.parseInt(scaner.nextLine());
        System.out.print("Sy: ");
        Sy = Integer.parseInt(scaner.nextLine());
        System.out.print("r: ");
        r = Double.parseDouble(scaner.nextLine());
        
        Circle circle = new Circle(new Point(Sx,Sy),r);
        list.add(circle);    
    }

    public static void addQuadrangle(ArrayList<Figure> list){
        int Ax;
        int Ay;
        int Bx;
        int By;
        int Cx;
        int Cy;
        int Dx;
        int Dy;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Ax: ");
        Ax = Integer.parseInt(scaner.nextLine());
        System.out.print("Ay: ");
        Ay = Integer.parseInt(scaner.nextLine());
        System.out.print("Bx: ");
        Bx = Integer.parseInt(scaner.nextLine());
        System.out.print("By: ");
        By = Integer.parseInt(scaner.nextLine());
        System.out.print("Cx: ");
        Cx = Integer.parseInt(scaner.nextLine());
        System.out.print("Cy: ");
        Cy = Integer.parseInt(scaner.nextLine());
        System.out.print("Dx: ");
        Dx = Integer.parseInt(scaner.nextLine());
        System.out.print("Dy: ");
        Dy = Integer.parseInt(scaner.nextLine());
        
        Quadrangle quadrangle = new Quadrangle(new Point(Ax,Ay),new Point(Bx,By),new Point(Cx,Cy),new Point(Dx,Dy));
        list.add(quadrangle);
    }

    public static int choosePlacementOptions(){
        System.out.println("PlacementOptions:");
        System.out.println("1) Left-down corner");
        System.out.println("2) Right-down corner");
        System.out.println("3) Right-up corner");
        System.out.println("4) Left-up corner");
        System.out.println("5) Center");
        Scanner scaner = new Scanner(System.in);
        int choose = Integer.parseInt(scaner.nextLine());
        while(choose > 5 || choose < 1){
            choose = choosePlacementOptions();
        }
        return choose;
    }
    
    public static void addRectangle(ArrayList<Figure> list){
        int Px;
        int Py;
        int a;
        int b;

        Scanner scaner = new Scanner(System.in);
        System.out.print("Px: ");
        Px = Integer.parseInt(scaner.nextLine());
        System.out.print("Py: ");
        Py = Integer.parseInt(scaner.nextLine());
        System.out.print("a: ");
        a = Integer.parseInt(scaner.nextLine());
        System.out.print("b: ");
        b = Integer.parseInt(scaner.nextLine());

        int placementOption = choosePlacementOptions();
        Placement placement;
        switch(placementOption){
            case 1:
            placement = Placement.leftdowncorner;
            break;
            case 2:
            placement = Placement.rightdowncorner;
            break;
            case 3:
            placement = Placement.rightupcorner;
            break;
            case 4:
            placement = Placement.leftupcroner;
            break;
            case 5:
            placement = Placement.center;
            break;
            default:
            placement = Placement.center;
            break;
        }
        Rectangle rectangle = new Rectangle(a,b, new Point(Px, Py),placement);
        list.add(rectangle); 
    }

    public static void addSquare(ArrayList<Figure> list){
        int Px;
        int Py;
        int a;


        Scanner scaner = new Scanner(System.in);
        System.out.print("Px: ");
        Px = Integer.parseInt(scaner.nextLine());
        System.out.print("Py: ");
        Py = Integer.parseInt(scaner.nextLine());
        System.out.print("a: ");
        a = Integer.parseInt(scaner.nextLine());

        int placementOption = choosePlacementOptions();
        Placement placement;
        switch(placementOption){
            case 1:
            placement = Placement.leftdowncorner;
            break;
            case 2:
            placement = Placement.rightdowncorner;
            break;
            case 3:
            placement = Placement.rightupcorner;
            break;
            case 4:
            placement = Placement.leftupcroner;
            break;
            case 5:
            placement = Placement.center;
            break;
            default:
            placement = Placement.center;
        }
        Square square = new Square(a, new Point(Px,Py), placement);
        list.add(square);
    }

    public static void clearScreen(Screen screen, ArrayList<Figure> list){
        list.clear();
        screen.clear();
    }

    public static Screen newScreen(){
        char backgroundSign;
        char figureSign;
        int width;
        int height;
        boolean axises;

        Scanner scaner = new Scanner(System.in);
        System.out.print("Background sign: ");
        backgroundSign = scaner.nextLine().charAt(0);
        System.out.print("Figure sign: ");
        figureSign = scaner.nextLine().charAt(0);
        System.out.print("Width: ");
        width = Integer.parseInt(scaner.nextLine());
        System.out.print("Height: ");
        height = Integer.parseInt(scaner.nextLine());
        System.out.print("Axises [Y]: ");
        char tmpAxises = scaner.nextLine().charAt(0);
        if(tmpAxises == 'Y' || tmpAxises == 'y'){
            axises = true;
        } else {
            axises = false;
        }

        Screen screen = new Screen(width, height, backgroundSign, figureSign, axises);
        return screen;
    }

    public static void draw(Screen screen, ArrayList<Figure> list){
        for(Figure i : list){
            i.placeFigureOnScreen(screen);
        }
        screen.draw();
    }

    public static boolean quit(){
        System.out.println("Thank you for your time! Hope you enjoyed.");
        return false;
    }

    //------------------------------------</interface>


}