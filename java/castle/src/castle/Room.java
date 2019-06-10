package castle;
import java.util.HashMap;
public class Room {
    private String description;				//������private ͨ��ʵ�ַ�װ���������
//    private Room northExit;					//������ʵ�������
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;
    private HashMap<String, Room> exits = new HashMap<String, Room>();
    										//Ӳ���� �ĳɿ�ܼ�����
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
//    	String ret;						//����������ϵͳ���� ÿ����Ҫ�½�String
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
        
        StringBuffer sb = new StringBuffer();	//�����ǿ���ֱ���޸�
        for (String dir : exits.keySet()) {
        	sb.append(dir);
        	sb.append(' ');
        }
        return sb.toString();					//ע����ת���ַ���
    }
    
    public Room goExits(String direction) {
    	return exits.get(direction);
    }
}
