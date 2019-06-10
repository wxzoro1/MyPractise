package castle;
import java.util.HashMap;
public class Room {
    private String description;				//尽量用private 通过实现封装来降低耦合
//    private Room northExit;					//用容器实现灵活性
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;
    private HashMap<String, Room> exits = new HashMap<String, Room>();
    										//硬代码 改成框架加数据
    public Room(String description) 
    {
        this.description = description;
    }
    public void setExit(String dir, Room room) {
    	exits.put(dir, room);
    }
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String goExitsDisc() {
//    	String ret;						//问题是增加系统开销 每次需要新建String
//    	ret = "";				
//        if(northExit != null)
//        	ret += "north";		
//        if(eastExit != null)
//        	ret += "east";		
//        if(southExit != null)
//        	ret += "south";		
//        if(westExit != null)   
//        	ret += "west";		
//        return ret;			
        
        StringBuffer sb = new StringBuffer();	//优势是可以直接修改
        for (String dir : exits.keySet()) {
        	sb.append(dir);
        	sb.append(' ');
        }
        return sb.toString();					//注意需转成字符串
    }
    
    public Room goExits(String direction) {
    	return exits.get(direction);
    }
}
