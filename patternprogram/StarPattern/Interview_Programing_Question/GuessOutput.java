package Interview_Programing_Question;

public class GuessOutput extends Sample {
    public static void main(String[] args) {
        int m=2,n=4;
        Sample sa=new Sample();
        sa.put(m,n);
        System.out.println(Sample.tally);
    }
}
class Sample{
    static int tally=0;
    public void put(int a,int b){
        for(;a<10;++a)//a=2
        ++b;
        tally+=b;
    }
}
