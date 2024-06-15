import java.util.*;

class tictactoe{
    static void display(char[][] mat){
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(mat[x][y]+" ");
            }
            System.out.println();
        }
    }
    static int check(char[][]mat, String user,int f){
        if((mat[0][0]==mat[0][1] && mat[0][1]==mat[0][2] && mat[0][1]!='\0') ||
                (mat[1][0]==mat[1][1] && mat[1][1]==mat[1][2] && mat[1][1]!='\0') ||
                (mat[2][0]==mat[2][1] && mat[2][1]==mat[2][2] && mat[2][1]!='\0') ||
                (mat[0][0]==mat[1][0] && mat[1][0]==mat[2][0] && mat[1][0]!='\0') ||
                (mat[0][1]==mat[1][1] && mat[1][1]==mat[2][1] && mat[1][1]!='\0') ||
                (mat[0][2]==mat[1][2] && mat[1][2]==mat[2][2] && mat[1][2]!='\0') ||
                (mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2] && mat[1][1]!='\0') ||
                (mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0] && mat[1][1]!='\0')){
            System.out.println(user + "WINS");
            return 1;
        }else{
            return 0;
        }
    }
    int flag=0;
    tictactoe(){
        Scanner sc=new Scanner(System.in);
        char mat[][]=new char[3][3];


        System.out.println("Welcome to Tic-Tac-Toe");
        display(mat);

        System.out.println("Enter name of USER 1");
        String user1=sc.next();
        System.out.println("Enter name of USER 2");
        String user2=sc.next();
        System.out.println();
        System.out.println("General Instructions");
        System.out.println("KEYS : User1 -> 'O'   User2 -> 'X'");
        System.out.println();
        System.out.println(user1 +" can use O");
        System.out.println(user2 +" can use X");
        System.out.println();
        for(int i=0;i<9/2;i++){
            System.out.println(user1 +"'s turn (O)");
            int a=sc.nextInt();
            int aa=a%10;
            a=a/10;
            if(mat[a][aa]!='O' && mat[a][aa]!='X'){
                mat[a][aa]='O';
            }else{
                System.out.println("Invalid input");
            }
            display(mat);
            flag=check(mat,user1,flag);
            if(flag==1){
                break;
            }

            System.out.println(user2 +"'s turn (X)");
            int b=sc.nextInt();
            int bb=b%10;
            b=b/10;
            if(mat[b][bb]!='O' && mat[b][bb]!='X'){
                mat[b][bb]='X';
            }else{
                System.out.println("Invalid input");
            }
            display(mat);
            flag=check(mat,user2,flag);
            if(flag==1){
                break;
            }

        }
        if(flag==0){
            System.out.println("It's a TIE");
        }
    }
}
public class TTT {
    public static void main(String[] args) {
        tictactoe game=new tictactoe();
        if(game.flag==0){
            tictactoe game1=new tictactoe();
        }
    }
}