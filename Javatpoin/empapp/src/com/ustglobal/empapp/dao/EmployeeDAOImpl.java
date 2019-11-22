package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public  class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData() {
		
		
		String url ="Jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql ="select *from employee_info ";

		Connection conn=null;
		Statement stmt =null;
		ResultSet rs=null;

		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
//			String result="";
			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while(rs.next()) {
				
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				
				result.add(bean);
				
//				System.out.println("id is     :"+rs.getInt("id"));
//				System.out.println("name is   :"+rs.getString("name"));
//				System.out.println("salary is :"+rs.getInt("sal"));
//				System.out.println("gender is :"+rs.getString("gender"));
//				System.out.println("***************************************");

			}
			return result;
			}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				if(conn!=null) {
					conn.close();

				}

				if(stmt!=null) {
					stmt.close();

				}

				if(rs!=null) {
					rs.close();

				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public EmployeeBean searchEmployeeData(int id) {
		String url ="Jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql ="select * from employee_info where id=? ";
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else {
				return null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();

				}

				if(pstmt!=null) {
					pstmt.close();

				}

				if(rs!=null) {
					rs.close();

				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		}
//	public  insertEmployeeData(int id,String name,int salary,String gender) {
//		
//		String url ="Jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		String sql ="insert into employee_info values(?,?,?,?) ";
//		Connection conn =null;
//		PreparedStatement pstmt =null;
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn=DriverManager.getConnection(url);
//			pstmt=conn.prepareStatement(sql);
//			
//			
//			pstmt=conn.prepareStatement(sql);
//
//			
//			
//			pstmt.setInt(1, id);
//			pstmt.setString(2, name);
//			
//			pstmt.setString(4, gender);
//			pstmt.setInt(3, salary);
//			
//			int count=pstmt.executeUpdate();
//			System.out.println(count);
//			return count;
////			if(rs.next()) {
////				EmployeeBean bean = new EmployeeBean();
////				bean.setId(rs.getInt("id"));
////				bean.setName(rs.getString("name"));
////				bean.setSal(rs.getInt("sal"));
////				bean.setGender(rs.getString("gender"));
////				//return bean;
////			}else {
////				//return null;
////			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			//return null;
//		}
//		finally {
//			try {
//				if(conn!=null) {
//					conn.close();
//
//				}
//
//				if(pstmt!=null) {
//					pstmt.close();
//
//				}
//
////				if(rs!=null) {
////					rs.close();
////
////				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
}
