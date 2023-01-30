public class PwPattern {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<35;j++){
                if((i==0 && j<3)||j==0||(i==2 && j<3)||(j==2 && i<3)||j==4||(i+j==8 && j<7) || (j-i==4 && j>6)||j==8 ||(i==0 && (9<j&&j<13))||(j==10 && i<3)||(i==2 &&(9<j&&j<13))||(j==12 && i>=3)||(i==4 &&(9<j&&j<13))||(i+j==16&&i<3)||j==14 ||(j-i==12&&i>=3)|| j==18 ||j==20||(i==4 &&(19<j&&j<23))||j==24||(i==4 &&(23<j&&j<27))||(i==0 && (27<j&&j<31))||(j==28 && i<3)||(i==2 &&(27<j&&j<31))||(j==30 && i>=3)||(i==4 &&(27<j&&j<31))){
                    System.out.print("* ");
                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
