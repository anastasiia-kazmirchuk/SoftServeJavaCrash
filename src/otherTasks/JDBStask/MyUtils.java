package otherTasks.JDBStask;

import java.sql.Connection; //jdbc:h2:mem:test
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    private Connection connection;
    private Statement statement;
    private String schemaName;

    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver());
        connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();

    }

    public Statement createStatement() throws SQLException {
        this.statement = connection.createStatement();
        return statement;

    }

    public void closeStatement() throws SQLException {
        if (statement != null) {
            statement.close();
        }

    }

    public void createSchema(String schemaName) throws SQLException {
        this.schemaName = schemaName;
        statement.executeUpdate("create SCHEMA " + schemaName);

    }

    public void dropSchema() throws SQLException {
        statement.executeUpdate("drop schema " + schemaName);

    }

    public void useSchema() throws SQLException {
        statement.execute("set schema " + schemaName);

    }

    public void createTableRoles() throws SQLException {

        statement.executeUpdate("create table Roles (id int auto_increment primary key, roleName varchar (255))");
    }

    public void createTableDirections() throws SQLException {

        statement.executeUpdate("create table Directions(id int auto_increment primary key , directionName varchar (255))");
    }

    public void createTableProjects() throws SQLException {

        statement.executeUpdate("create table Projects(id int auto_increment primary key ,projectName varchar(100),directionId int,foreign key (directionId) references  Directions(id))");
    }

    public void createTableEmployee() throws SQLException {
        statement.executeUpdate("create table Employee(id int auto_increment primary key, firstName varchar (255), roleid int, projectid int, foreign key (roleid) references Roles(id), foreign key (projectid) references Projects(id));");

    }

    public void dropTable(String tableName) throws SQLException {
        statement.executeUpdate("drop table " + tableName);

    }

    public void insertTableRoles(String roleName) throws SQLException {
        statement.executeUpdate("insert into Roles (roleName) values ('" + roleName + "')");

    }

    public void insertTableDirections(String directionName) throws SQLException {
        statement.executeUpdate("insert into Directions (directionName) values ('" + directionName + "')");

    }

    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Directions where directionName = '" + directionName + "'");
        resultSet.next();
        String id = resultSet.getString("id");
        statement.executeUpdate("insert into Projects (projectName, directionid) values ('" + projectName + "','" + id + "')");
        resultSet.close();
    }

    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Roles where roleName= '" + roleName + "'");
        resultSet.next();
        String roleId = resultSet.getString("id");
        resultSet = statement.executeQuery("select id from Projects where projectName = '" + projectName + "'");
        resultSet.next();
        String projectId = resultSet.getString("id");
        statement.executeUpdate("insert into Employee (firstName, roleid, projectid) values ('" + firstName + "','" + roleId + "','" + projectId + "')");
        resultSet.close();
    }

    public int getRoleId(String roleName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Roles where roleName= '" + roleName + "'");
        resultSet.next();
        int roleId = resultSet.getInt("id");
        resultSet.close();
        return roleId;
    }

    public int getDirectionId(String directionName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Directions where directionName = '" + directionName + "'");
        resultSet.next();
        int directionId = resultSet.getInt("id");
        resultSet.close();
        return directionId;
    }

    public int getProjectId(String projectName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Projects where projectName = '" + projectName + "'");
        resultSet.next();
        int projectId = resultSet.getInt("id");
        resultSet.close();
        return projectId;
    }

    public int getEmployeeId(String firstName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select id from Employee where firstName = '" + firstName + "'");
        resultSet.next();
        int employerId = resultSet.getInt("id");
        resultSet.close();
        return employerId;


    }

    public List<String> getAllRoles() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Roles;");
        List<String> allRoles = new ArrayList<>();
        while (resultSet.next()) {
            allRoles.add(resultSet.getString("roleName"));
        }
        resultSet.close();
        return allRoles;

    }

    public List<String> getAllDirestion() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Directions;");
        List<String> allDirections = new ArrayList<>();
        while (resultSet.next()) {
            allDirections.add(resultSet.getString("directionName"));
        }
        resultSet.close();
        return allDirections;
    }

    public List<String> getAllProjects() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Projects;");
        List<String> allProjects = new ArrayList<>();
        while (resultSet.next()) {
            allProjects.add(resultSet.getString("projectName"));
        }
        resultSet.close();
        return allProjects;
    }

    public List<String> getAllEmployee() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Employee;");
        List<String> allEmployer = new ArrayList<>();
        while (resultSet.next()) {
            allEmployer.add(resultSet.getString("firstName"));
        }
        resultSet.close();
        return allEmployer;
    }

    public List<String> getAllDevelopers() throws SQLException {
        int roleId = getRoleId("Developer");
        ResultSet resultSet = statement.executeQuery("select * from Employee where roleId = '" + roleId + "';");
        List<String> allDevelopers = new ArrayList<>();
        while (resultSet.next()) {
            allDevelopers.add(resultSet.getString("firstName"));
        }
        resultSet.close();
        return allDevelopers;
    }

    public List<String> getAllJavaProjects() throws SQLException {
        int directionId = getDirectionId("Java");
        ResultSet resultSet = statement.executeQuery("select * from Projects where directionId = '" + directionId + "'");
        List<String> allJavaProjects = new ArrayList<>();
        while (resultSet.next()) {
            allJavaProjects.add(resultSet.getString("projectName"));
        }
        resultSet.close();
        return allJavaProjects;
    }

    public List<String> getAllJavaDevelopers() throws SQLException {
        List<String> allJavaDevelopers = new ArrayList<>();
        int directionId = getDirectionId("Java");
        int roleId = getRoleId("Developer");
        ResultSet projectsJava = statement.executeQuery("select * from Projects where directionId = '" + directionId + "'");
        List<String> projectList = new ArrayList<>();
        while (projectsJava.next()) {
            projectList.add(projectsJava.getString("id"));
        }
        projectsJava.close();
        ResultSet resultSet = null;
        for (String s : projectList) {
            resultSet = statement.executeQuery("select * from Employee where roleId = '" + roleId + "' and  projectId  = '" + s + "'");

            while (resultSet.next()) {
                allJavaDevelopers.add(resultSet.getString("firstName"));
            }
        }

        resultSet.close();
        return allJavaDevelopers;
    }

}

