/**
 * Name: Eric Truong
 * Date: October 16, 2019
 * Description: Create rectangles with a series of different methods to choose from
 */
public class Rect {

    /**
     * Height of rectangle
     */
    private int recHeight;

    /**
     * Width of rectangle
     */
    private int recWidth;

    /**
     * Construct height and width for rectangle
     */
    public Rect(){
        recHeight = 0;

        recWidth = 0;
    }

    /**
     * Construct a rectangle with user's input
     * @param x user's input
     */
    public Rect(int x){
        if (x < 0){
            recHeight = 0;

            recWidth = 0;
        }
        else {
            recHeight = x;

            recWidth = x;
        }
    }

    /**
     * Construct a rectangle with user input
     * @param x user's height
     * @param y user's width
     */
    public Rect(int x, int y){
        if (x < 0){
            recWidth = 0;
        }
        else{
            recWidth = x;

        }
        if (y < 0){
            recHeight = 0;
        }
        else {
            recHeight = y;
        }

    }

    /**
     * Construct a rectangle based on another rectangle
     * @param r other rectangle
     */
    public Rect(Rect r){
        recHeight = r.getHeight();

        recWidth = r.getWidth();
    }

    /**
     * Get height of a rectangle
     * @return  return height of rectangle
     */
    public int getHeight(){
        return recHeight;
    }

    /**
     * Get width of a rectangle
     * @return  return width of a rectangle
     */
    public int getWidth(){
        return recWidth;
    }

    /**
     * Determines if two rectangles are equal to each other in height and width
     * @param o second rectangle
     * @return  return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof Rect){
            Rect r = (Rect) o;
            return this.getWidth() == r.getWidth() && this.getHeight() == r.getHeight();

        }
        return false;

    }

    /**
     * Compare two rectangles
     * @param other second rectangle
     * @return      return difference of the two rectangles
     */
    public int compareTo(Rect other){
        if (this.getHeight() - other.getHeight() == 0){
            if (this.getWidth() - other.getWidth() == 0){
                return 0;
            }
            else{
                return this.getWidth() - other.getWidth();
            }
        }
        else{
            return this.getHeight() - other.getHeight();
        }

    }

    /**
     * Scale rectangles height and width
     * @param x value to scale height and width
     */
    public void scale (double x){
        if (x < 0.0){
            recHeight *= 1;
            recWidth *= 1;
        }
        else{
            recHeight *= x;
            recWidth *= x;
        }
    }

    /**
     * Scale rectangle's height and width
     * @param x value to scale the width
     * @param y value to scale the height
     */
    public void scale (double x, double y){
        if (x < 0.0){
            recWidth *= 1;
            recHeight *= y;
        }

        if (y < 0.0){
            recHeight *= 1;
            recWidth *= x;
        }

        else {
            recWidth *= x;
            recHeight *= y;
        }
    }

    /**
     * Scale rectangle based on another rectangle
     * @param r other rectangle
     */
    public void scale (Rect r){
        recHeight += r.getHeight();
        recWidth += r.getWidth();
    }

    /**
     * Calculate the area of a rectangle
     * @return  return area of rectangle
     */
    public int area(){
        int area = this.getHeight() * this.getWidth();
        return area;
    }

    /**
     * Draw a rectangle
     * @return  drawing of a rectangle
     */
    @Override
    public String toString(){
        String box = "";
        for (int i = 0; i < getHeight(); i++){
            for(int j = 0; j < getWidth(); j++){
                box += "* ";
            }
            box += "\n";

        }
        return box;
    }

}