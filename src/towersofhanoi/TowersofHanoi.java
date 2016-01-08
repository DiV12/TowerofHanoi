package towersofhanoi;

import java.util.Scanner;
/**
 *
 * @author DIV
 */
public class TowersofHanoi {
    public static void main(String[] args) {
        int towerCount = 3; 
        System.out.println("The towers are named as : 0   1   2 ");
        Tower[] tower = new Tower[towerCount]; // object array tower[] of type Tower. 
        int disksCount; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of disks:  ");
        disksCount = sc.nextInt();
        for (int towNum=0; towNum<towerCount; towNum++){
            tower[towNum] = new Tower(towNum);  // Tower objects instantiated using the constructor and the references are assigned to the array elements. 
        }
        for (int disk=disksCount-1; disk>=0; disk--){
            System.out.println("Disk " + disk  + " is added to the Tower 0 \n" );
            tower[0].add(disk); 
        }
        System.out.println("The solution: ");
        tower[0].movetoDest(disksCount, tower[2], tower[1]); 
    }
}
