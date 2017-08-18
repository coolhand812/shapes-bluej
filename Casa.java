class Casa
{
    // instance variables
    Circle window;
    Triangle roof;
    Square door;
    Square wall;
    
    // constructor
    Casa()
    {
        window = new Circle();
        roof = new Triangle();
        wall = new Square();
        door = new Square();
    }
    
    // method
    void Drawyourself()
    {
        window.makeVisible();
        roof.makeVisible();
        wall.makeVisible();
        door.makeVisible();
        wall.changeSize(100);
        roof.changeSize(50,120);
        wall.changeColor("green");
        door.changeColor("blue");
        roof.changeColor("black");
        window.changeColor("red");
    }
    
    void Arrange()
    {
        wall.moveHorizontal(50);
        wall.moveVertical(50);
        door.moveVertical(120);
        door.moveHorizontal(85);
        roof.moveHorizontal(110);
        roof.moveVertical(40);
        window.moveHorizontal(130);
        window.moveVertical(10);
    }
}    