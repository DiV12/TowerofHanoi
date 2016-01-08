package towersofhanoi;
import java.util.Stack;

/**
 *
 * @author DIV
 */
public class Tower {
    private Stack<Integer> disk;
    private int towIndex;
    
    public Tower(int index) {
        disk = new Stack<Integer>(); //creates a new stack 
        towIndex = index;
    }
    
    public int getIndex(){
        return towIndex;
    }
    
    public void add(int diskNum) { 
        if(!disk.isEmpty() && (disk.peek() <= diskNum)){
            System.out.println("Conditions not satisfied");
        }
        else{
            disk.push(diskNum);
        }
    }
    
    void movetoDest(int disksCount, Tower destination, Tower intermediate) {
        if(disksCount>0){
        movetoDest(disksCount-1, intermediate, destination);  //recursion
        moveTopdisk(destination);
        intermediate.movetoDest(disksCount-1, destination, this); // recursion
        }
    }

    private void moveTopdisk(Tower destination) {
        int topDisk = disk.pop();
        destination.add(topDisk);
        System.out.println("The Disk " + topDisk + " is moved from " + getIndex() + " to " + destination.getIndex()  );
    }
    
    
}
