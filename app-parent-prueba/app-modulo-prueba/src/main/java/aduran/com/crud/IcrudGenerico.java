package aduran.com.crud;

import java.util.ArrayList;

public interface IcrudGenerico<T> {
	
	public ArrayList<T> create();

	public void delete();

	public void read();

	public void update();

}
