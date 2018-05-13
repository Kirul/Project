package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cargo {
	private String Cargo_Id;
	private String Ship_Id;
	private int StartDate;
	private int EndDate;
	private String CargoContent;
	private String Status;
	private String LastPort;
	private String NextPort;
	
	public Cargo () {}

	public String getCargo_Id() {
		return Cargo_Id;
	}

	public void setCargo_Id(String cargo_Id) {
		Cargo_Id = cargo_Id;
	}

	public String getShip_Id() {
		return Ship_Id;
	}

	public void setShip_Id(String ship_Id) {
		Ship_Id = ship_Id;
	}

	public int getStartDate() {
		return StartDate;
	}

	public void setStartDate(int startDate) {
		StartDate = startDate;
	}

	public int getEndDate() {
		return EndDate;
	}

	public void setEndDate(int endDate) {
		EndDate = endDate;
	}

	public String getCargoContent() {
		return CargoContent;
	}

	public void setCargoContent(String cargoContent) {
		CargoContent = cargoContent;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getLastPort() {
		return LastPort;
	}

	public void setLastPort(String lastPort) {
		LastPort = lastPort;
	}

	public String getNextPort() {
		return NextPort;
	}

	public void setNextPort(String nextPort) {
		NextPort = nextPort;
	}
	
	
	//Inserting data to the database
	public boolean CargoFreightInsert() {
		DatabaseConnector dc = new DatabaseConnector();
		Connection con = dc.getConnection();
		String sql = "INSERT INTO Cargo (Cargo_Id,Ship_Id,StartDate,EndDate,CargoContent,Status,LastPort,NextPort) VALUES(?,?,?,?,?,?,?,?)";
		
		PreparedStatement statement;
		int rowInserted = 0;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, this.getCargo_Id());
			statement.setString(2, this.getShip_Id());
			statement.setInt(3, this.getStartDate());
			statement.setInt(4, this.getEndDate());
			statement.setString(5, this.getCargoContent());
			statement.setString(6, this.getStatus());
			statement.setString(7, this.getLastPort());
			statement.setString(8, this.getNextPort());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dc.closeConnection();
		return rowInserted > 0;
	}
	
	//Deleting data from the database
	public boolean CargoFreightDelete () {
		DatabaseConnector dc = new DatabaseConnector();
		Connection con = dc.getConnection();
		String sql = "DELETE FROM Cargo WHERE Cargo_Id=?,Ship_Id=?";
		
		PreparedStatement statement;
		int rowDeleted = 0;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, this.getCargo_Id());
			statement.setString(2, this.getShip_Id());
//			statement.setInt(3, this.getStartDate());
//			statement.setInt(4, this.getEndDate());
//			statement.setString(5, this.getCargoContent());
//			statement.setString(6, this.getStatus());
//			statement.setString(7, this.getLastPort());
//			statement.setString(8, this.getNextPort());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dc.closeConnection();
		return rowDeleted > 0;
	}
	
	//Updating data from the database
	public boolean CargoFreightUpdate() {
		DatabaseConnector dc = new DatabaseConnector();
		Connection con = dc.getConnection();
		String sql = "";
		
		PreparedStatement statement;
		int rowUpdated = 0;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, this.getCargo_Id());
			statement.setString(2, this.getShip_Id());
//			statement.setInt(3, this.getStartDate());
//			statement.setInt(4, this.getEndDate());
//			statement.setString(5, this.getCargoContent());
//			statement.setString(6, this.getStatus());
//			statement.setString(7, this.getLastPort());
//			statement.setString(8, this.getNextPort());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dc.closeConnection();
		return rowUpdated > 0;
	}
	
	
	
}
