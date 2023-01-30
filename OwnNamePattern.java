public class OwnNamePattern {
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            for(int j=0;j<40;j++){
                if((i+j==4) ||(i==2 && j<=6 && j>=2)||(j-i==4)||(j==9)||(j-i==9)||j==12||(i+j==17) ||(i==2 && j<=19 && j>=15)||(j-i==17)||(j==22)||(j-i==22)||j==25 || j==27||(i==0&&j<30 &&j>27)||(j==30 &&i>0 &&i<3)||(i==3&&j<30 && j>27) ||i+j==35||(j-i==35)||(i==2 && j<=37 && j>=34) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
System.out.println("  ");
        }
    }
}
