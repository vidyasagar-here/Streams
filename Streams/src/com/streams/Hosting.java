/**
 * 
 */
package com.streams;

/**
 * @author Sagar
 *
 */
public class Hosting {
	
	private int Id;
	private String name;
	private String websites;
	private long cost;
	
	
	/**
	 * @param id
	 * @param name
	 * @param websites
	 * @param cost
	 */
	public Hosting(int id, String name, String websites, long cost) {
		super();
		Id = id;
		this.name = name;
		this.websites = websites;
		this.cost = cost;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the websites
	 */
	public String getWebsites() {
		return websites;
	}
	/**
	 * @param websites the websites to set
	 */
	public void setWebsites(String websites) {
		this.websites = websites;
	}
	/**
	 * @return the cost
	 */
	public long getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(long cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Hosting [Id=" + Id + ", name=" + name + ", websites=" + websites + ", cost=" + cost + "]";
	}
	
	
	
}
