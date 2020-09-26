package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import timetablesystem.DataBaseHandler.DBHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Lecture {

    private  int ID;
    private  String Name;
    private  String Faculty;
    private  String Department;
    private  String Center;
    private  String Level;

    public Lecture() {
    }

    public Lecture(int ID, String name, String faculty, String department, String center, String level) {
        this.ID = ID;
        Name = name;
        Faculty = faculty;
        Department = department;
        Center = center;
        Level = level;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getFaculty() {
        return Faculty;
    }

    public String getDepartment() {
        return Department;
    }

    public String getCenter() {
        return Center;
    }

    public String getLevel() {
        return Level;
    }

    public ResultSet getAllData(){
        String selectAllQuerry="SELECT * FROM lecturers";
        DBHandler sqlConnection=new DBHandler();
        ResultSet getAllBuilding=sqlConnection.DbGet(selectAllQuerry);
        return  getAllBuilding;
    }

    public ResultSet GroupBy(String group,String table,String uniq){
        String groupQuerry="SELECT COUNT("+uniq+"),"+group+" FROM "+table+" GROUP BY "+group;
        System.out.println(groupQuerry);
//        SQLConnection sqlConnection=new SQLConnection();
        DBHandler sqlConnection=new DBHandler();
        ResultSet getAllBuilding=sqlConnection.DbGet(groupQuerry);
        return  getAllBuilding;
    }

    public ObservableList<PieChart.Data> getPiCtartData(ResultSet resultSet) throws SQLException {
        ObservableList<PieChart.Data> lecture_groups= FXCollections.observableArrayList();
            while (resultSet.next()){
                lecture_groups.add(new PieChart.Data(resultSet.getString(2), resultSet.getInt(1)));

            }

            return lecture_groups;

    }



}
