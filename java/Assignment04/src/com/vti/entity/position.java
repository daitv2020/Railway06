package com.vti.entity;

public class position {
	public		byte positionId;
	private 	PositionName positionName;
	@Override
	public String toString() {
		return "position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
	
	
	
	// tạo getter and setter
	public PositionName getPositionName() {
		return positionName;
	}
	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}
	
	
	
	
}
