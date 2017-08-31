/**
 *Se establece la clase Casa para generar las casas de un blueprint generico.
 *@autor Joe Diaz
 */
class Casa
{
    // instance variables
    Circle window;
    Triangle roof;
    Square door;
    Square wall;
    
    // constructor
    /**
     * El constructor declara las variables a usar en el programa.
     */
    Casa()
    {
        window = new Circle();
        roof = new Triangle();
        wall = new Square();
        door = new Square();
    }
    
    // method
    /**
     * Metodo que hace que las piezas de la casa se dibujen.
     */
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
    
    /**
     * Metodo que hace que las piezas de la casa se arreglen en forma de
     *  una casa.
     */
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
    
    /**
     * Metodo mueve la casa entera horizontalmente.
     * @dist Es la distancia en pixeles que se mueve la casa.
     */
    void mueveHoriz(int dist)
    {
	wall.moveHorizontal(dist);
	door.moveHorizontal(dist);
	roof.moveHorizontal(dist);
	window.moveHorizontal(dist);
    }
    
    /**
     * Metodo mueve la casa entera verticalmente.
     * @dist Es la distancia en pixeles que se mueve la casa.
     */
    void mueveVert(int dist)
    {
	wall.moveVertical(dist);
	door.moveVertical(dist);
	roof.moveVertical(dist);
	window.moveVertical(dist);
    }
}    