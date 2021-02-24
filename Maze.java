import java.util.*;

class Maze{
    private int width, height;
    private Cell[][] grid;
    private int[] pos = {0,0};
    /*
    Maze "legend":
    0 = wall (default)
    1 = path
    2 = exit
     */
    public Maze(int w,int h){
        width = w;
        height = h;
        grid = new Cell[h][w];
        for (int y=0; y<h;y++){
            for(int x=0;x<w;x++){
                grid[y][x]=new Cell(x,y);
            }
        }
    }

    //getters (sort of, since Java apparently doesnt *do* getters/setters -_-)
    public int[] getPos(){
        //does Java have a spread operator or anything similar (array.slice)?
        int[] posCopy={this.pos[0],this.pos[1]};
        return posCopy;
    }

    //methods
    public boolean move(char dir){
        int[] newPos = {this.pos[0],this.pos[1]};
        switch(dir){
            case 'N':
                System.out.println("Want to move NORTH");
                newPos[0]--;
                break;
            case 'E':
                System.out.println("Want to move EAST");
                newPos[1]++;
                break;
            case 'S':
                System.out.println("Want to move SOUTH");
                newPos[0]++;
                break;
            default:
                System.out.println("Want to move WEST (probly)");
                newPos[0]--;
        }
        if(newPos[0]<0 || newPos[1] <0 || newPos[0]>=this.width ||newPos[1] >=this.width|| grid[newPos[0]][newPos[1]].typeCode==0){
            return false;
        }else{

            this.pos[0] = newPos[0];
            this.pos[1] = newPos[1];
            return true;
        }
    }
    public void genMaze(){
        // stuff to generate maze (duh)
        int total = this.width*this.height;
        int curr = 0;
        int[] currPos = {0,0};
        Stack<Cell> visited = new Stack<Cell>();
        visited.push(grid[0][0]);
        while (curr<total){
            //
            curr++;
        }
    }
    public void testStuff(){
        Cell[][] testGrid = new Cell[4][4];
        System.out.println(Arrays.toString(testGrid[2]));
    }
}