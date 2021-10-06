class Box{
    int length;
    int breadth;// instance variables
    int height;

    Box(int l,int b,int h){
        length=l;
        breadth=b;//constructor
        height=h;
    }

    /*void setDim(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }*/
    int volume(){//method
        return length*breadth*height;
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Box blackBox=new Box(2,9,5);
       // blackBox.setDim(11,22,33);
        System.out.println("vol of black box is "  + blackBox.volume());// calling method
    }
}
