public class parameter {
    public static void main(String[] args) {
        int[] A=new int[2];
        A[0]=0;
        A[1]=2;
        f(A[0],A[A[0]]);
        System.out.println(A[1]);
    }
    static void f(int x, int y){
        x=1;
        y=3;
    }
}



