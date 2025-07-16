//link: https://onlinegdb.com/V3bS04iNk

class Main
{
    int l,b,h;
    Main(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    int volume()
    {
        return (l*b*h);
    }
    public static void main (String[] args) {
        Main m=new Main(10,20,10);
        System.out.print(m.volume());
    }
}
