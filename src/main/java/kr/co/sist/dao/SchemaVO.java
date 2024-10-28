package kr.co.sist.dao;

public class SchemaVO {
	private String columnName,columnLabelName,isNullable;
	private int dataSize;
	public SchemaVO() {
	}
	public SchemaVO(String columnName, String columnLabelName, String isNullable, int dataSize) {
		this.columnName = columnName;
		this.columnLabelName = columnLabelName;
		this.isNullable = isNullable;
		this.dataSize = dataSize;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnLabelName() {
		return columnLabelName;
	}
	public void setColumnLabelName(String columnLabelName) {
		this.columnLabelName = columnLabelName;
	}
	public String getIsNullable() {
		return isNullable;
	}
	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}
	public int getDataSize() {
		return dataSize;
	}
	public void setDataSize(int dataSize) {
		this.dataSize = dataSize;
	}
	@Override
	public String toString() {
		return "SchemaVO [columnName=" + columnName + ", columnLabelName=" + columnLabelName + ", isNullable="
				+ isNullable + ", dataSize=" + dataSize + "]";
	}
	
	
	
	
	
	
	
}
