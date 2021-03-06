package moduleTwice.labwork23;

public class Window {
    private double height;
    private double width;
    private int numberOfGlass;
    private String colour;
    private boolean isOpen;

    public Window(double height, double width, int numberOfGlass, String colour, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.numberOfGlass = numberOfGlass;
        this.colour = colour;
        this.isOpen = isOpen;
    }

    public Window() {
    }

    public Window(double height, double width) {
        this(height,width,5,"White",true);
    }

    public Window(double height, double width, int numberOfGlass) {
        this(height,width,numberOfGlass,"White",true);
    }

    public Window(double height, double width, int numberOfGlass, String colour) {
        this(height,width,numberOfGlass,colour,true);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Window{" +
                "height=" + height +
                ", width=" + width +
                ", numberOfGlass=" + numberOfGlass +
                ", colour='" + colour + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public void printFields() {
        System.out.println(toString());
    }
}