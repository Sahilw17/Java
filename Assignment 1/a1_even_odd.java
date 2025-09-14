class num{
    void evennum(){
        for(int i =0;i<=20;i++)
        {
            if(i%2==0){
                System.out.print(i+",");
            }
        }
        System.out.println(" ");
    }
    void oddnum(){
        for(int i=0;i<=20;i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
        System.out.println(" ");
    }
}

class a1_even_odd{
    public static void main(String [] args){
        num n=new num();
        n.evennum();
        n.oddnum();
    }
}