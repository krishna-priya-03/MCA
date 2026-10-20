public class complex {
    int real;
    int imaginary;

    void get(int real_get,int imag_get){
        real = real_get;
        imaginary = imag_get;
    }

    void show(){
        System.out.println("Real part is " + real);
        System.out.println("Imaginary part is " + imaginary);
    }
    public static complex sum(complex c1,complex c2){
        complex temp = new complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public static void main(String []args){
        complex c1 = new complex();
        complex c2 = new complex();
        c1.get(1,2);
        c2.get(3,4);
        complex temp = sum(c1,c2);
        System.out.println("Sum is : " + temp.real + "+" +temp.imaginary + "i");
    }
}