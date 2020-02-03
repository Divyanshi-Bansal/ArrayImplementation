package recursion;

public class TowerOfHanoi {
    public void towerOfHanoi(int n,char beg,char aux,char end){ //no. of disks , begin pipe , auxilliary pipe , end pipe
        if(n>=1){
            towerOfHanoi ( n-1,beg,end,aux);
            System.out.printf("Disk moved from %c to %c\n",beg,end);
            towerOfHanoi (n-1,aux,beg,end);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi ();
        towerOfHanoi.towerOfHanoi ( 3,'A','B','C' );
    }
}
