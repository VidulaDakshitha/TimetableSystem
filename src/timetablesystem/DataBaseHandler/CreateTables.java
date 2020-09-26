package timetablesystem.DataBaseHandler;

public class CreateTables {

    static String timeSolts="CREATE TABLE IF NOT EXISTS timeslots ( id int PRIMARY KEY AUTO_INCREMENT ,tSlots varchar(100) )";

    static String building ="CREATE TABLE IF NOT EXISTS building (" +
            "  BuildingName varchar(60) NOT NULL ," +
            "  ID int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT" +
            ")";


    static String room ="CREATE TABLE IF NOT EXISTS room (" +
            "  RoomName varchar(60) NOT NULL," +
            "  Capacity int(11) NOT NULL," +
            "  BuildingName varchar(60) NOT NULL," +
            "  ID int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT" +
            ")";

    static String student = "CREATE TABLE IF NOT EXISTS student (" +
            "  ID int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT," +
            "  Name varchar(60) NOT NULL," +
            "  AcadamicYear varchar(60) NOT NULL," +
            "  AcadamicSemester varchar(60) NOT NULL," +
            "  SubgroupID int(11) NOT NULL " +
            ")";
    static String subject ="CREATE TABLE IF NOT EXISTS subject (" +
          "ID int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,"+
  "year varchar(10) NOT NULL,"+
  "semester varchar(10) NOT NULL,"+
  "subject varchar(50) NOT NULL,"+
  "code varchar(50) NOT NULL,"+
  "lecturehrs varchar(10) NOT NULL,"+
  "tutehrs varchar(10) NOT NULL,"+
  "labhrs varchar(10) NOT NULL,"+
  "evaluationhrs varchar(10) NOT NULL"+
            ")";
    
    static String lecturers ="CREATE TABLE IF NOT EXISTS lecturers (" +
            "ID int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,"+
  "name varchar(150) NOT NULL,"+
  "lectureID varchar(50) NOT NULL,"+
  "faculty varchar(50) NOT NULL,"+
  "department varchar(50) NOT NULL,"+
  "center varchar(50) NOT NULL,"+
  "building varchar(50) NOT NULL,"+
  "level varchar(50) NOT NULL,"+
  "rank varchar(20) NOT NULL"+
                    ")";




}
