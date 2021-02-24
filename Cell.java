class Cell{
    public boolean north=true;
    public boolean east=true;
    public boolean south=true;
    public boolean west=true;
    public int typeCode = 0;
    private int x,y;
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }
}