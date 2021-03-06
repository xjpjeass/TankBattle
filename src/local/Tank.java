package local;

import local.Data.DataType;
import local.Status.Direction;

import java.awt.Rectangle;


public abstract class Tank {
	
	protected Data data = null;
	private Gamer gamer = null;
	public static final int PER_MOVE = 10;
	public static final int SIZE = 50;
	
	public Tank()
	{
		data = new Data();
		gamer = new Gamer();
	}
	
	public void update(Data newData)
	{
		this.data.setAll(
				DataType.UPDATE, 
				newData.getX(), 
				newData.getY(), 
				newData.getShoot(), 
				newData.getDirect(), 
				newData.getHp()
				);
	}
	
	public Rectangle getBound() {
		return new Rectangle(data.getX(), data.getY(), SIZE, SIZE);
	}
	
	public abstract void move(Direction d);
	public abstract void shoot();
	
}
